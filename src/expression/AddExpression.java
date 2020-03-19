package expression;

/**
 * Class untuk implementasi ekspresi penjumlahan pada Calculator
 * Disusun dalam rangka memenuhi Tugas Besar IF2210
 * Pemrograman Berorientasi Objek
 *
 * @author : Kelompok 06 Tugas Besar OOP
 * @since : 18 Maret 2020
 */
public class AddExpression extends BinaryExpression {

	/**
	 * Constructor
	 *
	 * @param x Expression pertama
	 * @param y Expression kedua
	 */
	public AddExpression(Expression x, Expression y){
		super(x, y);
	}

	/**
	 * Mengembalikan nilai dari ekspresi
	 *
	 * @return hasil penjumlahan dari Expression x dengan Expression y
	 */
	public double solve(){
		return this.x.solve() + this.y.solve();
	}
}
