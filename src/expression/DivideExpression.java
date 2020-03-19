package expression;

public class DivideExpression extends BinaryExpression {
	public DivideExpression(Expression x, Expression y){
		super(x, y);
	}

	public Double solve(){
		return this.x.solve() / this.y.solve();
	}
}
