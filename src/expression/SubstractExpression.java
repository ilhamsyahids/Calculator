package expression;

/**
 * Class untuk implementasi ekspresi pengurangan
 * pada aplikasi Calculator
 * Disusun dalam rangka memenuhi Tugas Besar IF2210
 * Pemrograman Berorientasi Objek
 *
 * @author : Kelompok 06 Tugas Besar OOP
 * @since : 18 Maret 2020
 */
public class SubstractExpression extends BinaryExpression {

	/**
	 * Constructor
	 *
	 * @param x : Expression pertama
	 * @param y : Expression kedua
	 */
	public SubstractExpression(Expression x, Expression y){
		super(x, y);
	}

	/**
	 * Method overloading : substract
	 *
	 * @param x : Nilai pertama
	 * @param y : Nilai kedua
	 * @return : Hasil pengurangan nilai pertama dan kedua
	 */
	private Double substract(Double x, Double y){
		return x - y;
	}

	/**
	 * Mengembalikan hasil pengurangan antara dua buah ekspresi
	 *
	 * @return Hasil pengurangan Ekspresi x dan y
	 */
	public Double solve(){
		return substract(this.x.solve(), this.y.solve());
	}
}
