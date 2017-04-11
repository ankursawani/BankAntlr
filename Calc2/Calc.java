import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class Calc {

	public static void main(String[] args) throws Exception {
		String inputFile = args[0];
		String className = args[1];
		
		IR.init( className );
		IR.setup();
		
		InputStream is = System.in;
		if (inputFile != null) {
			is = new FileInputStream(inputFile);
		}
		ANTLRInputStream input = new ANTLRInputStream(is);
		LabeledExprLexer lexer = new LabeledExprLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LabeledExprParser parser = new LabeledExprParser(tokens);
		ParseTree tree = parser.prog();
		
		EvalVisitor eval = new EvalVisitor();
		eval.visit( tree );
		
		IR.tearDown();
		IR.dump();
		
		/* System.out.println( tree.toStringTree(parser) ); */
	}

}
