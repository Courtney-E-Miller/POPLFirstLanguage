package prefixGrammer;

// import lexer, parser
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) {
        // Demonstrates Or, And, and Variable Assignment
        prefixLangLexer lexer = new prefixLangLexer(CharStreams.fromString("(Or (Let bunny (Or True True) (And bunny False)) True)"));

        // Demonstrates Nested Add and Variable Assignment
        //prefixLangLexer lexer = new prefixLangLexer(CharStreams.fromString("(Add (Let bunny (Add 1 1) (Add bunny 5)) 3)"));

        // Demonstrates And
        //prefixLangLexer lexer = new prefixLangLexer(CharStreams.fromString("(And True False)"));

        // Demonstrates If
        //prefixLangLexer lexer = new prefixLangLexer(CharStreams.fromString("(If True (Not True) (Not False))"));

        // Demonstrates Add
        //prefixLangLexer lexer = new prefixLangLexer(CharStreams.fromString("(Add 10 2)"));

        // Demonstrates Add and Variable Assignment
        //prefixLangLexer lexer = new prefixLangLexer(CharStreams.fromString("(Let bunny (Add 1 1) (Add bunny 5))"));

        // Demonstrates Function Declaration and Calling
        //prefixLangLexer lexer = new prefixLangLexer(CharStreams.fromString("(Let bubble (Lambda X (Add X 1)) (Call bubble 6))"));

        prefixLangParser parser = new prefixLangParser(new CommonTokenStream(lexer));

        ParseTree tree = parser.r(); // Declaring a variable of type parse tree and you're telling it what the root rule is
        myPrefixLangVisitor lychee = new myPrefixLangVisitor();
        System.out.println(lychee.visit(tree));


        // You then can traverse this tree.  Vey exciting!
        // this is the root rule and you should have this line so it knows where to start
    }
}
