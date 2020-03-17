public class AddExpression extends BinaryExpression {
	protected Expression x;
	protected Expression y;

	public AddExpression(Expression x, Expression y){
		super(x, y);
	}

	public double solve(){
		return this.x.solve() + this.y.solve();
	}
}
