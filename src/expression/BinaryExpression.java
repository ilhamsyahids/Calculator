/**
 * Class untuk implementasi ekspresi biner (tambah, kurang, kali, bagi, dst.)
 * pada aplikasi Calculator
 * Disusun dalam rangka memenuhi Tugas Besar IF2210
 * Pemrograman Berorientasi Objek
 *
 * @author : Kelompok 06 Tugas Besar OOP
 * @since : 18 Maret 2020
 */

package expression;

abstract class BinaryExpression implements Expression {

    /**
     * Sebuah Binary Expression minimal
     * terdiri dari dua buah Expression Dasar
     */
    protected Expression x;
    protected Expression y;

    /**
     * Constructor
     * @param x : Expression pertama
     * @param y : Expression kedua
     */
	public BinaryExpression(Expression x, Expression y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Mengahasilkan nilai ekspresi
     * @return Nilai Expression (double)
     */
    abstract public Double solve();
}