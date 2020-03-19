package expression;

public class NegativeExpression extends UnaryExpression {
	public NegativeExpression(Expression x){
    	super(x);
  	}

  	public Double solve(){
    	return -1 * this.x.solve();
  	}
}