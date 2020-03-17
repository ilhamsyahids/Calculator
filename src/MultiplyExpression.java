public class MultiplyExpression extends BinaryExpression {
	protected Expression x;
	protected Expression y;

	public MultiplyExpression(Expression x, Expression y){
		super(x, y);
	}

	public double solve(){
		return this.x.solve() * this.y.solve();
	}
}
