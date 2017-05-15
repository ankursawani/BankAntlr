import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class BankDemo {

	public static void main(String[] args) throws Exception {
		String inputFile = args[0];
		InputStream is = System.in;
		if (inputFile != null) {
			is = new FileInputStream(inputFile);
		}
		ANTLRInputStream input = new ANTLRInputStream(is);
		test58Lexer lexer = new test58Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		test58Parser parser = new test58Parser(tokens);
		ParseTree tree = parser.prog();
		
		System.out.println( tree.toStringTree(parser) );
	}

}