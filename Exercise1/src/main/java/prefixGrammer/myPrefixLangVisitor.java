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
        HashMap<String, Data> symbolTable = new HashMap<>();
        // Calls other visitR with symbol table and returns value
        return visitR(ctx, symbolTable);
    }

    public Data visitR(prefixLangParser.RContext ctx, HashMap<String, Data> oldSymbolTable) {
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

            // How do I figure out what kind of variable this is supposed to be
            // For the Data part of the <String, Data> symbol table entry, Data = <String, Object>
            // Where the String is the data type "Integer", "Boolean", ect., and Object is the value of that variable

            // Checks to see if value of Data is boolean value
            Data varData = oldSymbolTable.get(varName);

            return varData;

//            if(Boolean.parseBoolean(varData.value.toString())){
//                Boolean varValue = Boolean.valueOf(varData.value.toString());
//                Data res = new Data("Boolean", varValue);
//                return res;
//
//            }
//            // Checks to see if the value of data in an integer value (I think)
//            else if(oldSymbolTable.get(varName).value.toString().matches("\\d")){
//                Integer varValue = Integer.valueOf(oldSymbolTable.get(varName).value.toString());
//                Data res = new Data("Integer", varValue);
//                return res;
//            }
                // Should I be adding the variables to the symbol table in this funciton?

            //return res; // So should this be returning a Symbol Table Entry instead of just a Data Object?
        }
        else {
            return null;
        }

    }

    public Data visitOrExp(prefixLangParser.OrExpContext ctx, HashMap<String, Data> oldSymbolTable) {
        Boolean firstR = Boolean.valueOf((Boolean) visitR(ctx.r(0), oldSymbolTable).value);
        Boolean secondR = Boolean.valueOf((Boolean) visitR(ctx.r(1), oldSymbolTable).value);
        // Evaluate these parts together and return a boolean
        Boolean boolRes = firstR || secondR;
        Data res = new Data("Boolean", boolRes);
        return res;
    }

    public Data visitAndExp(prefixLangParser.AndExpContext ctx, HashMap<String, Data> oldSymbolTable){
        Boolean firstA = Boolean.valueOf((Boolean) visitR(ctx.r(0), oldSymbolTable).value);
        Boolean secondA = Boolean.valueOf((Boolean) visitR(ctx.r(1), oldSymbolTable).value);
        Boolean boolRes = firstA && secondA;
        Data res = new Data("Boolean", boolRes);
        return res;
    }

    public Data visitNotExp(prefixLangParser.NotExpContext ctx, HashMap<String, Data> oldSymbolTable) {
        Boolean notVal = Boolean.valueOf((Boolean) visitR(ctx.r(), oldSymbolTable).value);
        Boolean boolRes = !(notVal);
        Data res = new Data("Boolean", boolRes);
        return res;
    }

    public Data visitIfExp(prefixLangParser.IfExpContext ctx, HashMap<String, Data> oldSymbolTable) {
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

    public Data visitLetExp(prefixLangParser.LetExpContext ctx, HashMap<String, Data> oldSymbolTable) {
        HashMap<String, Data> symbolTable = new HashMap<>();
        symbolTable = (HashMap<String, Data>) oldSymbolTable.clone();

        // Accesses name of variable and saves it as a string
        String varName = String.valueOf(ctx.VARIABLE());

        // Evaluates value of variable and saves it as a data object
        Data varValueData = visitR(ctx.r(0), oldSymbolTable);

        symbolTable.put(varName, varValueData);

        // Evaluates the expression with the new symbol table
        Data evalRes = visitR(ctx.r(1), symbolTable);

        return evalRes;

//        // Evaluates value of variable and saves it as a string
//        String varValue = String.valueOf(visitR(ctx.r(0), oldSymbolTable).value); // Should I be passing the old symbol table with this when I evaluate it? **
//        // Should it just be something like
//        Data varValueData = visitR(ctx.r(0), oldSymbolTable);
//
//        //  I need to add the access the type from the symbol table entry  ** But I don't know if it's been added
//        // The symbol table entries are <String, Data> now so I need to fix the line below
//
//        // Adds variable to symbol table
//        symbolTable.put(varName, varValue);
//
//        // Evaluates the expression with the new symbol table
//        Boolean evalRes = Boolean.valueOf((Boolean) visitR(ctx.r(1), oldSymbolTable).value);
//        Data res = new Data("Boolean", evalRes);
//        //return visitR(ctx.r(1), symbolTable);
    }

    public Data visitAddExp(prefixLangParser.AddExpContext ctx, HashMap<String, Data> oldSymbolTable){
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
