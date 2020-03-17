package expression;

public class MultiplyExpression extends BinaryExpression {
	public MultiplyExpression(Expression x, Expression y){
		super(x, y);
	}

	public Double solve(){
		return this.x.solve() * this.y.solve();
	}
}
