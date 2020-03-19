package expression;

public class SqrtExpression extends UnaryExpression{
	public SqrtExpression(Expression x){
    	super(x);
	}
	  
	private Double Sqrt(Double x){ 
		return Math.sqrt(x);
	}

  	public Double solve(){
    	return Sqrt(this.x.solve());
  	}
}