
import java.io.IOException; 
import java.util.Random;
import java.util.HashMap;
import java.util.Map;


public class BankVisitor extends test58BaseVisitor<Integer>{
	
	Map<String,Integer> symTable = new HashMap<String, Integer>();

	
		//IR.addCode("");
	public Integer visitWithExpr(LabeledBankParser.WithExprContext ctx)
	{
	
		
	
		try
		{
			
		
		System.out.println("Here we are visiting the Deposit Expression.");
		int deposit = Integer.parseInt(ctx.INT().getText());
		String id = ctx.ID().getText();
		int a = symTable.get(id) + deposit;
		
		IR.addCode(id + "= " + a + ";");
	
		
				return 0;
		}
		
		catch (Exception e)
		{
			System.out.println("Error occurred in Withdrawal Expression.");
			IR.addCode("Withdrawal statement used incorrect grammar. Please try again.");
			return 0;
		}
	
	}
	public Integer visitDepoExpr(LabeledBankParser.DepoExprContext ctx)
	{
	
		System.out.println("Here we are visiting the Deposit Expression.");
		int deposit = Integer.parseInt(ctx.INT().getText());
		String id = ctx.ID().getText();
		int a = symTable.get(id) + deposit;
		
		IR.addCode(id + "= " + a + ";");
	
		
		return 0;	
		
		
			
	
	}
	public  Integer visitBalExpr(LabeledBankParser.BalExprContext ctx)
	{
		try
		{
			
		
			System.out.println("Here we are in the balance expression where we print the balance.");
			String id = ctx.ID().getText();
		
			if (symTable.containsKey(id)) {
				int a = symTable.get(id);
				//int a = (String)symTable.get(id);
				
				IR.addCode( "Balance for " + id + ":" + a);
				IR.addCode("ankur = 4;");
			}
			else
				System.out.println("didn'g work");
			return 0;
		}
		catch(Exception e)
		{
			System.out.println("Error occurred in Balance Expression.");
			IR.addCode("Balance statement used incorrect grammar. Please try again.");
			return 0;
		}

		
	}
	
	public Integer visitAddPerson(LabeledBankParser.AddPersonContext ctx)
	{
		String id = ctx.ID().getText();
			symTable.put(id, 10);
			IR.addCode( "int " + id + " = " + 10 + ";");
			IR.addCode( "System.out.println(" + '"' + "New Account created for " + id + "." + '"' + ");");
		return 0;
	}
	
	public Integer visitHouseSell(LabeledBankParser.HouseSellContext ctx)
	{
		
		Random rnd = new Random();
		int housePrice = (rnd.nextInt(5)+1) * 100000;
		int houseInterest = Integer.parseInt(ctx.INT().getText());
		System.out.println("House Interest: " + houseInterest);
		
		return 0;
		
	}
	
	
	
}