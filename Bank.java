import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class Bank{

	public static void main(String[] args) throws Exception {
	
		String inputFile = args[0];

		String className = args[1];		
		IR.init( className );
		IR.setup();
		
		//System.out.println("I'm here3");
		InputStream is = System.in;
		if (inputFile != null) {
			is = new FileInputStream(inputFile);
		}
		
		ANTLRInputStream input = new ANTLRInputStream(is);
		LabeledBankLexer lexer = new LabeledBankLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LabeledBankParser parser = new LabeledBankParser(tokens);
		ParseTree tree = parser.prog();
		BankVisitor eval = new BankVisitor();
		//	System.out.println("I'm here4");
		eval.visit( tree );
			//	System.out.println("I'm here5");
		
		
		IR.tearDown();
		IR.dump();
		
		/* System.out.println( tree.toStringTree(parser) ); */
	}

}