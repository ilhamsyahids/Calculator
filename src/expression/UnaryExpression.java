package expression;

abstract class UnaryExpression implements Expression {
	protected Expression x;

	public UnaryExpression(Expression x){
    	this.x = x;
  	}

	abstract public Double solve();
}
