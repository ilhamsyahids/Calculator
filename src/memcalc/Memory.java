package memcalc;

import java.util.Queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Class untuk mengimplementasi fungsionalitas tombol MC dan MR
 * pada kalulator
 * Disusun dalam rangka memenuhi Tugas Besar IF2210
 * Pemrograman Berorientasi Objek
 *
 * @author : Kelompok 06 Tubes 1 OOP
 * @since : 19 Maret 2020
 **/

public class Memory<T> {

    /**
     * Implementasi MC dan MR memanfaatkan struktur data Queue
    **/
    private Queue<T> buffer;

    /**
     * Constructor
     **/
    public Memory() {
        this.buffer = new LinkedList<T>();
    }

    /**
     * Menyimpan hasil kalkulasi pada Queue
     *
     * @param entry : Hasil kalkulasi yang ingin dimasukkan
     */
    public void memorize(T entry) {
        this.buffer.add(entry);
    }

    /**
     * Mengambil hasil kalkulasi yang disimpan
     * dengan aturan FIFO (First In First Out)
     * Melempar NoSuchElementException apabila sudah tak ada hasil kalkulasi yang disimpan
     *
     * @return Hasil kalkulasi yang terdapat pada Head dari Queue
     */
    public T recall() {
        if (this.buffer.size() == 0) {
            throw new NoSuchElementException("Tidak ada data");
        }
        return this.buffer.remove();
    }

    /**
     * Mengosongkan isi queue
     */
    public void clear() {
        this.buffer.clear();
    }
}
