package expression;

public class TerminalExpression implements Expression{
	protected Double x;
  	
  	public TerminalExpression(Double x){
    	this.x = x;
  	}

  	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

  	public Double solve(){
    	return this.x;
  	}
}
