import java.util.HashMap;
import java.util.Map;


public class EvalVisitor extends LibExprBaseVisitor<Integer> {
	Map<String,Integer> symTable = new HashMap<String, Integer>();
	
	@Override
	public Integer visitIntDeclation(LabeledExprParser.IntDeclationContext ctx) {
		String id = ctx.ID().getText();
		symTable.put(id, null);
		return 0;
	}
	
	public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
		String id = ctx.ID().getText();
		
		if (!symTable.containsKey(id)) {
			System.out.println("undeclared variable " + id);
			System.exit(-1);
		}
		
		int value = visit(ctx.expr()); // why does visit gets you the value assignment?!?
		symTable.put(id, value);
		return value;
	}
	
	public Integer visitInt(LabeledExprParser.IntContext ctx) {
		return Integer.valueOf(ctx.INT().getText());
	}
	
	public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
		Integer value = visit(ctx.expr());
		System.out.println(value);
		return 0;
	}
	
	public Integer visitId(LabeledExprParser.IdContext ctx) {
		String id = ctx.ID().getText();
		if (symTable.containsKey(id)) {
			return symTable.get(id);
		}
		return 0;
	}
	
	public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx) {
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
	
		if ( ctx.op.getType() == LabeledExprParser.MUL) {
			return left * right;
		} else {
			return left / right;
		}
	}
	
	public Integer visitAddSub(LabeledExprParser.AddSubContext ctx) {
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
	
		if ( ctx.op.getType() == LabeledExprParser.ADD) {
			return left + right;
		} else {
			return left - right;
		}
	}
	
	public Integer visitParens(LabeledExprParser.ParensContext ctx) {
		return visit(ctx.expr());
	}
}
