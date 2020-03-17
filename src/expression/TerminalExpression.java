package expression;

public class TerminalExpression implements Expression{
 	protected double x;
  	
  	public TerminalExpression(double x){
    	this.x = x;
  	}

  	public double solve(){
    	return this.x;
  	}
}
