package expression;

public class NegativeExpression extends UnaryExpression {
	protected Expression x;

	public NegativeExpression(Expression x){
    	super(x);
  	}

  	public double solve(){
    	return -1 * this.x.solve();
  	}
}