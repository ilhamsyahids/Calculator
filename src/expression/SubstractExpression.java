package expression;

public class SubstractExpression extends BinaryExpression {
	public SubstractExpression(Expression x, Expression y){
		super(x, y);
	}

	private Double Substract(Double x, Double y){ 
		return x - y;
	}

	public Double solve(){
		return Substract(this.x.solve() - this.y.solve());
	}
}
