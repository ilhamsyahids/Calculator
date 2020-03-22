package expression;

/**
 * File: SqrtExpression.java
 * Class untuk implementasi ekspresi akar kuadrat
 * pada aplikasi Calculator
 * Disusun dalam rangka memenuhi Tugas Besar IF2210
 * Pemrograman Berorientasi Objek
 *
 * @author : Kelompok 06 Tugas Besar OOP
 * @since : 18 Maret 2020
 */
public class SqrtExpression extends UnaryExpression{

	/**
	 * Constructor
	 *
	 * @param x : Expression dasar
	 */
	public SqrtExpression(Expression x){
    	super(x);
	}

	/**
	 * Method overloading : Sqrt
	 *
	 * @param x : Bilangan double
	 * @return Hasil akar kuadrat dari x
	 */
	private Double sqrt(Double x){
		return Math.sqrt(x);
	}

	/**
	 * Mengembalikan kalkulasi dari expression yang ada
	 *
	 * @return Hasil akar kuadrat dari expression
	 */
  	public Double solve(){
  		if(this.x.solve() < Double.parseDouble("0")) throw new ArithmeticException("Error: Galat Matematika");
    	return sqrt(this.x.solve());
  	}
}