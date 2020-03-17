package expression;

public class AddExpression extends BinaryExpression {
	public AddExpression(Expression x, Expression y){
		super(x, y);
	}

	public Double solve(){
		return this.x.solve() + this.y.solve();
	}
}
