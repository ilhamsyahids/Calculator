package expression;

public class SubstractExpression extends BinaryExpression {
	public SubstractExpression(Expression x, Expression y){
		super(x, y);
	}

	public double solve(){
		return this.x.solve() - this.y.solve();
	}
}
