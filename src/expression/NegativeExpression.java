package expression;

/**
 * File: NegativeExpression.java
 * Class untuk implementasi ekspresi negative
 * pada aplikasi Calculator
 * Disusun dalam rangka memenuhi Tugas Besar IF2210
 * Pemrograman Berorientasi Objek
 *
 * @author : Kelompok 06 Tugas Besar OOP
 * @since : 18 Maret 2020
 */
public class NegativeExpression extends UnaryExpression {

	/**
	 * Constructor
	 *
	 * @param x : Expression dasar
	 */
	public NegativeExpression(Expression x){
    	super(x);
	  }

	/**
	 * Method overloading : negative
	 *
	 * @param x : Bilangan double
	 * @return : Nilai negative dari x
	 */
	private Double Negative(Double x){ 
		return -1 * x;
	}

	/**
	 * Menghitung nilai dari ekspresi yang ada
	 *
	 * @return Nilai negative dari ekspresi yang ada
	 */
  	public Double solve(){
    	return Negative(this.x.solve());
  	}
}