package prefixGrammer;
import java.util.*;

public class myPrefixLangVisitor extends prefixLangBaseVisitor<myPrefixLangVisitor.Data> implements prefixLangVisitor<myPrefixLangVisitor.Data> {

    // Container class for data types
    public class Data {
        String type;
        Object value;

        public Data(String type, Object value){
            this.type = type;
            this.value = value;
        }

        // Returns formatted value of variable as a string
        public String toString(){
            return value.toString();
        }
    }

    public Data visitStart(prefixLangParser.StartContext ctx) {
        return visitR(ctx.r());
    }

    public Data visitR(prefixLangParser.RContext ctx) {
        // Creates original empty symbol table
        HashMap<String, String> symbolTable = new HashMap<>();
        // Calls other visitR with symbol table and returns value
        return visitR(ctx, symbolTable);
    }

    public Data visitR(prefixLangParser.RContext ctx, HashMap<String, String> oldSymbolTable) {
        // Only one of the values will not be equal to null, and that's how you know which you're dealing with
        // Value is either T,F, or null
        // If it's just a value
        if(ctx.BOOLVAL() != null){
            Boolean value = Boolean.valueOf(ctx.BOOLVAL().getText());
            Data res = new Data("Boolean", value);
            return res;
        }
        else if(ctx.INTVAL() != null){
            Integer val = Integer.valueOf(ctx.INTVAL().getText());
            Data res = new Data("Integer", val);
            return res;
        }
        // If it's an orExp
        else if (ctx.orExp() != null) {
            return visitOrExp(ctx.orExp(), oldSymbolTable);
        }
        // If it's an andExp
        else if (ctx.andExp() != null) {
            return visitAndExp(ctx.andExp(), oldSymbolTable);
        }
        else if (ctx.notExp() != null) {
            return visitNotExp(ctx.notExp(), oldSymbolTable);
        }
        else if (ctx.ifExp() != null) {
            return visitIfExp(ctx.ifExp(), oldSymbolTable);
        }
        else if (ctx.letExp() != null) {
            return visitLetExp(ctx.letExp(), oldSymbolTable);
        }
        else if (ctx.addExp() != null){
            return  visitAddExp(ctx.addExp(), oldSymbolTable);
        }
        else if (ctx.VARIABLE() != null){
            // The final case is the case where its a variable
            String varName = String.valueOf(ctx.VARIABLE());
            Boolean varValue = Boolean.valueOf(oldSymbolTable.get(varName));
            Data res = new Data("Boolean", varValue);
            return res;
        }
        else {
            return null;
        }

    }

    public Data visitOrExp(prefixLangParser.OrExpContext ctx, HashMap<String, String> oldSymbolTable) {
        Boolean firstR = Boolean.valueOf((Boolean) visitR(ctx.r(0), oldSymbolTable).value);
        Boolean secondR = Boolean.valueOf((Boolean) visitR(ctx.r(1), oldSymbolTable).value);
        // Evaluate these parts together and return a boolean
        Boolean boolRes = firstR || secondR;
        Data res = new Data("Boolean", boolRes);
        return res;
    }

    public Data visitAndExp(prefixLangParser.AndExpContext ctx, HashMap<String, String> oldSymbolTable){
        Boolean firstA = Boolean.valueOf((Boolean) visitR(ctx.r(0), oldSymbolTable).value);
        Boolean secondA = Boolean.valueOf((Boolean) visitR(ctx.r(1), oldSymbolTable).value);
        Boolean boolRes = firstA && secondA;
        Data res = new Data("Boolean", boolRes);
        return res;
    }

    public Data visitNotExp(prefixLangParser.NotExpContext ctx, HashMap<String, String> oldSymbolTable) {
        Boolean notVal = Boolean.valueOf((Boolean) visitR(ctx.r(), oldSymbolTable).value);
        Boolean boolRes = !(notVal);
        Data res = new Data("Boolean", boolRes);
        return res;
    }

    public Data visitIfExp(prefixLangParser.IfExpContext ctx, HashMap<String, String> oldSymbolTable) {
        Boolean cond = Boolean.valueOf((Boolean) visitR(ctx.r(0), oldSymbolTable).value);
        //Boolean cond = visitR(ctx.r(0), oldSymbolTable);

        // If the condition is true return the then value
        if(cond == true){
            Boolean boolTrueCase = Boolean.valueOf((Boolean) visitR(ctx.r(1), oldSymbolTable).value);
            Data res = new Data("Boolean", boolTrueCase);
            return res;
        }
        // Else (meaning the condition is false) return the else value
        else {
            Boolean elseCase = Boolean.valueOf((Boolean) visitR(ctx.r(2), oldSymbolTable).value);
            Data res = new Data("Boolean", elseCase);
            return res;
        }

    }

    public Data visitLetExp(prefixLangParser.LetExpContext ctx, HashMap<String, String> oldSymbolTable) {
        HashMap<String, String> symbolTable = new HashMap<>();

        // Accesses name of variable and saves it as a string
        String varName = String.valueOf(ctx.VARIABLE());

        // Evaluates value of variable and saves it as a string
        String varValue = String.valueOf(visitR(ctx.r(0), oldSymbolTable).value); // Should I be passing the old symbol table with this when I evaluate it? **

        // Adds variable to symbol table
        symbolTable.put(varName, varValue);

        // Evaluates the expression with the new symbol table
        Boolean evalRes = Boolean.valueOf((Boolean) visitR(ctx.r(1), oldSymbolTable).value);
        Data res = new Data("Boolean", evalRes);
        //return visitR(ctx.r(1), symbolTable);
        return res;
    }

    public Data visitAddExp(prefixLangParser.AddExpContext ctx, HashMap<String, String> oldSymbolTable){
        //Integer firstA = Integer.valueOf((Integer) visitR(ctx.r(0), oldSymbolTable).value);
        //Integer secondA = Integer.valueOf((Integer) visitR(ctx.r(1), oldSymbolTable).value);
        int firstA = (int) visitR(ctx.r(0), oldSymbolTable).value;
        int secondA = (int) visitR(ctx.r(1), oldSymbolTable).value;
        //int fA = firstA.intValue();
        //int sA = secondA.intValue();
        int addRes = firstA + secondA;
        Data res = new Data("Integer", addRes);
        return res;
    }
}
