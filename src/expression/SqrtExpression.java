package expression;

public class SqrtExpression implements Expression {
	protected Expression x;

	public SqrtExpression(Expression x){
    	this.x = x;
  	}

  	public double solve(){
    	return 0.5 * this.x.solve();
  	}
}