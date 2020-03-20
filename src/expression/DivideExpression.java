package expression;

/**
 * Class untuk implementasi ekspresi pembagian pada Calculator
 * Disusun dalam rangka memenuhi Tugas Besar IF2210
 * Pemrograman Berorientasi Objek
 *
 * @author : Kelompok 06 Tugas Besar OOP
 * @since : 18 Maret 2020
 */

public class DivideExpression extends BinaryExpression {

	/**
	 * Constructor
	 *
	 * @param x Expression pertama
	 * @param y Expression kedua
	 */
	public DivideExpression(Expression x, Expression y){
		super(x, y);
	}

	/**
	 * Method overloading : divide
	 *
	 * @param x Bilangan pertama
	 * @param y Bilangan kedua
	 * @return Hasil pembagian x dengan y
	 */
	private Double divide(Double x, Double y){
		return x / y;
	}

	/**
	 * Mengembalikan nilai dari ekspresi
	 *
	 * @return hasil pembagian dari Expression x dengan Expression y
	 */
	public Double solve(){
		return divide(this.x.solve(), this.y.solve());
	}
}
