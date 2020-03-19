package expression;

public class TerminalExpression implements Expression{
	protected Double x;
  	
  	public TerminalExpression(Double x){
    	this.x = x;
  	}

  	public Double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

  	public double solve(){
    	return this.x;
  	}
}
