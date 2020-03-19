package expression;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddExpressionTest {

    private final Expression x = new TerminalExpression(10.0);

    @Test
    public void solve() {
        Expression y = new TerminalExpression(3.0);
        Expression addExp = new AddExpression(x,y);
        assertEquals(13.0, addExp.solve(), 0.001);
    }

    @Test
    public void solveIfNegative() {
        Expression y = new TerminalExpression(-10.0);
        Expression addExp = new AddExpression(x,y);
        assertEquals(0.0, addExp.solve(), 0.001);
    }
}