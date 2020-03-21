package expression;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TerminalExpressionTest {

    private TerminalExpression t;

    /**
     * Inisialisasi
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        t = new TerminalExpression(10.0);
    }

    /**
     * Menguji method solve
     */
    @Test
    public void solveTest() {
        assertEquals(10.0, t.solve(), 0.0001);
    }

    /**
     * Menguji method getX()
     */
    @Test
    public void getterTest() {
        assertEquals(10.0, t.getX(), 0.0001);
    }

    /**
     * Menguji method setX()
     */
    @Test
    public void setterTest() {
        t.setX(2.0);
        assertEquals(2.0, t.getX(), 0.0001);
    }
}