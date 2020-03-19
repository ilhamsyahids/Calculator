package expression;

public class DivideExpression extends BinaryExpression {
	public DivideExpression(Expression x, Expression y){
		super(x, y);
	}

	private Double Divide(Double x, Double y){ 
		return x / y;
	}

	public Double solve(){
		return Divide(this.x.solve(), this.y.solve());
	}
}
