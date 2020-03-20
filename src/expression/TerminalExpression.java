package expression;

/**
 * Class untuk implementasi ekspresi terminal
 * pada aplikasi Calculator
 * Disusun dalam rangka memenuhi Tugas Besar IF2210
 * Pemrograman Berorientasi Objek
 *
 * @author : Kelompok 06 Tugas Besar OOP
 * @since : 18 Maret 2020
 */
public class TerminalExpression implements Expression{

	/**
	 * Sebuah ekspresi terminal memiliki
	 */
	protected Double x;
  	
  	public TerminalExpression(Double x){
    	this.x = x;
  	}

	/**
	 * Getter : mengembalikan nilai x
	 *
	 * @return x
	 */
  	public Double getX() {
		return x;
	}

	/**
	 * Setter : Mengubah nilai x sesuai parameter
	 *
	 * @param x : Nilai x yang baru
	 */
	public void setX(Double x) {
		this.x = x;
	}

	/**
	 * Menghitung nilai dari ekspresi yang ada
	 *
	 * @return nilai dari ekspresi yang ada
	 */
  	public Double solve(){
    	return this.x;
  	}
}
