package expression;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryExpressionTest {

    private BinaryExpression b;

    @Test
    public void solveDivideExpression() {
        b = new DivideExpression(new TerminalExpression(12.0), new TerminalExpression(4.0));
        assertEquals(3.0, b.solve(), 0.0001);
    }

    @Test(expected=ArithmeticException.class)
    public void testDivideException() {
        b = new DivideExpression(new TerminalExpression(1.0), new TerminalExpression(0.0));
        b.solve();
    }

    @Test
    public void testDivideExceptionMsg() {
        try {
            b = new DivideExpression(new TerminalExpression(1.0), new TerminalExpression(0.0));
            b.solve();
        } catch(Exception e) {
            assertEquals(e.getMessage(), "Error: Pembagi Nol");
        }
    }

    @Test
    public void solveMulExpression() {
        Expression temp = new MultiplyExpression(new TerminalExpression(10.0), new TerminalExpression(4.0));
        b = new MultiplyExpression(new TerminalExpression(0.55), temp);
        assertEquals(10.0*4.0*0.55, b.solve(), 0.0001);
    }

    @Test
    public void solveSubsExpression() {
        b = new SubstractExpression(new TerminalExpression(6.0), new TerminalExpression(3.5));
        assertEquals(2.5, b.solve(), 0.0001);
    }

    @Test
    public void solveAddExpression(){
        b = new AddExpression(new TerminalExpression(2.5), new TerminalExpression(2.6));
        assertEquals(5.1, b.solve(), 0.0001);
    }

    @Test
    public void solveAddExpression2(){
        b = new AddExpression(new TerminalExpression(4.0), (new NegativeExpression(new TerminalExpression(5.0))));
        assertEquals(-1.0, b.solve(), 0.0001);
    }

}