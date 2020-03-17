package expression;

public class DivideExpression extends BinaryExpression {
	protected Expression x;
	protected Expression y;

	public DivideExpression(Expression x, Expression y){
		super(x, y);
	}

	public double solve(){
		return this.x.solve() / this.y.solve();
	}
}
