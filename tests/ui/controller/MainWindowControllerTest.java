package ui.controller;

import expression.TerminalExpression;
import memcalc.Memory;
import org.junit.Test;
import ui.view.MainWindow;

import javax.swing.*;

import static org.junit.Assert.*;

public class MainWindowControllerTest {
    private MainWindow M = new MainWindow();
    private MainWindowController MC = new MainWindowController(M);

    @Test
    public void initComponents() {
        assertTrue(MC.getMainWindow() instanceof MainWindow);
        assertTrue(MC.getBtnZero() instanceof JButton);
        assertTrue(MC.getBtnOne() instanceof JButton);
        assertTrue(MC.getBtnTwo() instanceof JButton);
        assertTrue(MC.getBtnThree() instanceof JButton);
        assertTrue(MC.getBtnFour() instanceof JButton);
        assertTrue(MC.getBtnFive() instanceof JButton);
        assertTrue(MC.getBtnSix() instanceof JButton);
        assertTrue(MC.getBtnSeven() instanceof JButton);
        assertTrue(MC.getBtnEight() instanceof JButton);
        assertTrue(MC.getBtnNine() instanceof JButton);
        assertTrue(MC.getBtnDot() instanceof JButton);
        assertTrue(MC.getBtnAns() instanceof JButton);
        assertTrue(MC.getBtnMemC() instanceof JButton);
        assertTrue(MC.getBtnMemR() instanceof JButton);
        assertTrue(MC.getBtnSquare() instanceof JButton);
        assertTrue(MC.getBtnEqu() instanceof JButton);
        assertTrue(MC.getBtnPlus() instanceof JButton);
        assertTrue(MC.getBtnMin() instanceof JButton);
        assertTrue(MC.getBtnDiv() instanceof JButton);
        assertTrue(MC.getBtnMul() instanceof JButton);
        assertTrue(MC.getBtnClear() instanceof JButton);
        assertTrue(MC.getErrorField() instanceof JTextField);
        assertTrue(MC.getNumField() instanceof JTextField);
        assertTrue(MC.getLabel() instanceof JTextField);
        assertTrue(MC.getAns() instanceof Double);
        assertTrue(MC.getExp() instanceof TerminalExpression);
        assertTrue(MC.getMemo() instanceof Memory);
        assertEquals(0, MC.getTypeExp());
        assertTrue(MC.isFirst());
        assertFalse(MC.isJustAnswered());
    }

    @Test
    public void setFirst() {
        MC.setFirst(true);
        assertTrue(MC.isFirst());
    }

    @Test
    public void getMainWindow() {
        assertEquals(M, MC.getMainWindow());
    }

    @Test
    public void getNumField() {
        assertEquals(M.getNumField(), MC.getNumField());
    }

    @Test
    public void getErrorField() {
        assertEquals(M.getErrorField(), MC.getErrorField());
    }

    @Test
    public void getLabel() {
        assertEquals(M.getLabel(), MC.getLabel());
    }

    @Test
    public void getBtnOne() {
        assertEquals(M.getBtnOne(), MC.getBtnOne());
    }

    @Test
    public void getBtnTwo() {
        assertEquals(M.getBtnTwo(), MC.getBtnTwo());
    }

    @Test
    public void getBtnDot() {
        assertEquals(M.getBtnDot(), MC.getBtnDot());
    }

    @Test
    public void getBtnZero() {
        assertEquals(M.getBtnZero(), MC.getBtnZero());
    }

    @Test
    public void getBtnAns() {
        assertEquals(M.getBtnAns(), MC.getBtnAns());
    }

    @Test
    public void getBtnPlus() {
        assertEquals(M.getBtnPlus(), MC.getBtnPlus());
    }

    @Test
    public void getBtnSix() {
        assertEquals(M.getBtnSix(), MC.getBtnSix());
    }

    @Test
    public void getBtnMul() {
        assertEquals(M.getBtnMul(), MC.getBtnMul());
    }

    @Test
    public void getBtnMin() {
        assertEquals(M.getBtnMin(), MC.getBtnMin());
    }

    @Test
    public void getBtnDiv() {
        assertEquals(M.getBtnDiv(), MC.getBtnDiv());
    }

    @Test
    public void getBtnEqu() {
        assertEquals(M.getBtnEqu(), MC.getBtnEqu());
    }

    @Test
    public void getBtnThree() {
        assertEquals(M.getBtnThree(), MC.getBtnThree());
    }

    @Test
    public void getBtnNine() {
        assertEquals(M.getBtnNine(), MC.getBtnNine());
    }

    @Test
    public void getBtnClear() {
        assertEquals(M.getBtnClear(), MC.getBtnClear());
    }

    @Test
    public void getBtnMemC() {
        assertEquals(M.getBtnMemC(), MC.getBtnMemC());
    }

    @Test
    public void getBtnSeven() {
        assertEquals(M.getBtnSeven(), MC.getBtnSeven());
    }

    @Test
    public void getBtnEight() {
        assertEquals(M.getBtnEight(), MC.getBtnEight());
    }

    @Test
    public void getBtnFour() {
        assertEquals(M.getBtnFour(), MC.getBtnFour());
    }

    @Test
    public void getBtnFive() {
        assertEquals(M.getBtnFive(), MC.getBtnFive());
    }

    @Test
    public void getBtnMemR() {
        assertEquals(M.getBtnMemR(), MC.getBtnMemR());
    }

    @Test
    public void getBtnSquare() {
        assertEquals(M.getBtnSquare(), MC.getBtnSquare());
    }
}