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

    protected Expression x;
    protected Expression y;

	public BinaryExpression(Expression x, Expression y) {
        this.x = x;
        this.y = y;
    }

    abstract public Double solve();
}