class AddExpression implements Expression {
	protected Expression x;
	protected Expression y;

	public AddExpression(Expression x, Expression y){
		this.x = x;
		this.y = y;
	}

	public double solve(){
		return this.x.solve() + this.y.solve();
	}
}
