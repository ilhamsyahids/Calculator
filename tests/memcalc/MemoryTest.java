package memcalc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.NoSuchElementException;

public class MemoryTest {

    private Memory<Double> m;

    /**
     * Inisialisasi
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        m = new Memory<Double>();
    }

    /**
     * Menguji method memorize
     */
    @Test
    public void memorizeTest() {
        m.memorize(2.0);
        assertEquals(2.0, m.recall(), 0.0001);
    }

    /**
     * Menguji method recall
     */
    @Test
    public void recallTest() {
        m.memorize(2.0);
        m.memorize(3.0);
        m.memorize(5.0);
        assertEquals(2.0, m.recall(), 0.0001);
        assertEquals(3.0, m.recall(), 0.0001);
        assertEquals(5.0, m.recall(), 0.0001);
    }

    /**
     * Menguji method clear dan Exception
     */
    @Test(expected=NoSuchElementException.class)
    public void clearTest() {
        m.memorize(3.0);
        m.clear();
        Double garbage = m.recall();
    }
}