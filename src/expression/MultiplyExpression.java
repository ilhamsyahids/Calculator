/**
 * File: MultiplyExpression.java
 * Class untuk implementasi ekspresi perkalian pada Calculator
 * Disusun dalam rangka memenuhi Tugas Besar IF2210
 * Pemrograman Berorientasi Objek
 *
 * @author : Kelompok 06 Tugas Besar OOP
 * @since : 18 Maret 2020
 */

package expression;

public class MultiplyExpression extends BinaryExpression {

	/**
	 * Constructor
	 *
	 * @param x Expression pertama
	 * @param y Expression kedua
	 */
	public MultiplyExpression(Expression x, Expression y){
		super(x, y);
	}

	/**
	 * Method overloading : multiply
	 *
	 * @param x Bilangan pertama
	 * @param y Bilangan kedua
	 * @return Hasil perkalian x dengan y
	 */
	private Double multiply(Double x, Double y){
		return x * y;
	}

	/**
	 * Mengembalikan nilai dari ekspresi perkalian
	 *
	 * @return hasil perkalian dari Expression x dengan Expression y
	 */
	public Double solve(){
		return multiply(this.x.solve(), this.y.solve());
	}
}
