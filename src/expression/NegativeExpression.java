package expression;

public class NegativeExpression extends UnaryExpression {
	public NegativeExpression(Expression x){
    	super(x);
	  }
	
	private Double Negative(Double x){ 
		return -1 * x;
	}

  	public Double solve(){
    	return Negative(this.x.solve());
  	}
}