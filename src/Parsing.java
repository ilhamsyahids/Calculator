
public class Parsing{
	private String[] operator = {"+","-","+","*","/"};
//	{'+','-','*','/','^','='};
	public String Num1,Num2;
	public String op;
	public String[] word = new String[2];
	
//	public T Num1,Num2,op;
	
	public Parsing(String input) {
		word = input.split(" ");
		String[] a = new String[3];
		int j = 0;
		for(String x : word) {
			a[j] = x;
			j++;
		}
		
		this.Num1 = a[0];
		this.op = a[1];
		this.Num2 = a[2]; 
	}
	
	public String getOp() {
		return this.op;
	}
	
	public int getNum1() {
		return Integer.parseInt(this.Num2);
	}
	
	public int getNum2() {
		return Integer.parseInt(this.Num2);
	}
	
//	public static void main(String args[]) {
//		String A = "1234 + 5678";
//		Parsing obj = new Parsing(A);
//		
//		System.out.println(obj.Num1);
//		System.out.println(obj.op);
//		System.out.println(obj.Num2);
//		System.out.println(obj.Num1.getClass().getName());
//		System.out.println(obj.op.getClass().getName());
//		System.out.println(obj.Num2.getClass().getName());
//		
//		int a = obj.getNum1() + obj.getNum2();
//		
//		System.out.println(a);
//
//	}
	
}