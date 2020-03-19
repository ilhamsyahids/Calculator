package expression;

public class SqrtExpression extends UnaryExpression{
	public SqrtExpression(Expression x){
    	super(x);
  	}

  	public double solve(){
    	return Math.sqrt(this.x.solve());
  	}
}