package expression;

/**
 * Class untuk implementasi ekspresi unary (akar, negative)
 * pada aplikasi Calculator
 * Disusun dalam rangka memenuhi Tugas Besar IF2210
 * Pemrograman Berorientasi Objek
 *
 * @author : Kelompok 06 Tugas Besar OOP
 * @since : 18 Maret 2020
 */
abstract class UnaryExpression implements Expression {

	/**
	 * Sebuah Unary Expression minimal memiliki satu buah
	 * expression dasar, yaitu x
	 */
	protected Expression x;

	/**
	 * Constructor
	 *
	 * @param x Expression dasar
	 */
	public UnaryExpression(Expression x){
    	this.x = x;
  	}

	/**
	 * Menghitung nilai dari ekspresi yang ada
	 *
	 * @return nilai dari ekspresi yang ada
	 */
	abstract public Double solve();
}
