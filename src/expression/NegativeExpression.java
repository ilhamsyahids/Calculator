package expression;

public class NegativeExpression extends UnaryExpression {
	public NegativeExpression(Expression x){
    	super(x);
	  }
	
	private Double Negative(Double x){ 
		return -1 * x;
	}

  	public double solve(){
    	return Negative(-1 * this.x.solve());
  	}
}