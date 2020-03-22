package expression;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnaryExpressionTest {

    private UnaryExpression utest;

    /**
     * Menguji method solve()
     * pada NegativeExpression
     */
    @Test
    public void solveNegativeTest1() {
        utest = new NegativeExpression(new TerminalExpression(1.35));
        assertEquals(-1.35, utest.solve(), 0.0001);
    }

    /**
     * Menguji method solve()
     * pada NegativeExpression
     */
    @Test
    public void solveNegativeTest2() {
        Expression x = new AddExpression(new TerminalExpression(1.8), new TerminalExpression(0.55));
        utest = new NegativeExpression(x);
        assertEquals(-2.35, utest.solve(), 0.0001);
    }

    /**
     * Menguji method solve()
     * pada NegativeExpression
     */
    @Test
    public void solveNegativeTest3(){
        Expression x = new SubstractExpression(new TerminalExpression(1.8), new TerminalExpression(-5.55));
        utest = new NegativeExpression(x);
        assertEquals(3.75, utest.solve(), 0.0001);
    }



    /**
     * Menguji method solve()
     * pada SqrtExpression
     */
    @Test
    public void solveSqrt1() {
        utest = new SqrtExpression(new TerminalExpression(16.0));
        assertEquals(Math.sqrt(16.0), utest.solve(), 0.00001);
    }

    /**
     * Menguji method solve()
     * pada SqrtExpression
     */
    @Test
    public void solveSqrt2() {
        Expression x = new AddExpression(new TerminalExpression(1.8), new TerminalExpression(0.55));
        utest = new SqrtExpression(x);
        assertEquals(Math.sqrt(1.8+0.55), utest.solve(), 0.000001);
    }

    /**
     * Menguji exception handling
     * pada SqrtExpression
     */
    @Test(expected=ArithmeticException.class)
    public void solveSqrtException() {
        utest = new SqrtExpression(new TerminalExpression(-3.0));
        utest.solve();
    }
}