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
    public void initComponentsTest() {
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
    public void setFirstTest() {
        MC.setFirst(true);
        assertTrue(MC.isFirst());
    }

    @Test
    public void getMainWindowTest() {
        assertEquals(M, MC.getMainWindow());
    }

    @Test
    public void getNumFieldTest() {
        assertEquals(M.getNumField(), MC.getNumField());
    }

    @Test
    public void getErrorFieldTest() {
        assertEquals(M.getErrorField(), MC.getErrorField());
    }

    @Test
    public void getLabelTest() {
        assertEquals(M.getLabel(), MC.getLabel());
    }

    @Test
    public void getBtnOneTest() {
        assertEquals(M.getBtnOne(), MC.getBtnOne());
        MC.getBtnOne().doClick();
        assertEquals("1", MC.getNumField().getText());
    }

    @Test
    public void getBtnTwoTest() {
        assertEquals(M.getBtnTwo(), MC.getBtnTwo());
        MC.getBtnTwo().doClick();
        assertEquals("2", MC.getNumField().getText());
    }

    @Test
    public void getBtnDotTest() {
        assertEquals(M.getBtnDot(), MC.getBtnDot());
        MC.getBtnDot().doClick();
        assertEquals(".", MC.getNumField().getText());
        MC.getBtnDot().doClick();
        assertEquals("..", MC.getNumField().getText());
    }

    @Test
    public void getBtnZeroTest() {
        assertEquals(M.getBtnZero(), MC.getBtnZero());
    }

    @Test
    public void getBtnAnsTest() {
        assertEquals(M.getBtnAns(), MC.getBtnAns());
    }

    @Test
    public void getBtnPlusTest() {
        assertEquals(M.getBtnPlus(), MC.getBtnPlus());
        try {
            MC.getBtnPlus().doClick();
        } catch (Exception e) {
            assertEquals("Tidak ada angka", MC.getErrorField().getText());
        }
    }

    @Test
    public void getBtnSixTest() {
        assertEquals(M.getBtnSix(), MC.getBtnSix());
        MC.getBtnSix().doClick();
        assertEquals("6", MC.getNumField().getText());
    }

    @Test
    public void getBtnMulTest() {
        assertEquals(M.getBtnMul(), MC.getBtnMul());
        try {
            MC.getBtnMul().doClick();
        } catch (Exception e) {
            assertEquals("Tidak ada angka", MC.getErrorField().getText());
        }
    }

    @Test
    public void getBtnMinTest() {
        assertEquals(M.getBtnMin(), MC.getBtnMin());
        try {
            MC.getBtnMin().doClick();
        } catch (Exception e) {
            assertEquals("Tidak ada angka", MC.getErrorField().getText());
        }
    }

    @Test
    public void getBtnDivTest() {
        assertEquals(M.getBtnDiv(), MC.getBtnDiv());
        try {
            MC.getBtnDiv().doClick();
        } catch (Exception e) {
            assertEquals("Tidak ada angka", MC.getErrorField().getText());
        }
    }

    @Test
    public void getBtnEquTest() {
        assertEquals(M.getBtnEqu(), MC.getBtnEqu());
        try {
            MC.getBtnEqu().doClick();
        } catch (Exception e) {
            assertEquals("Tidak ada angka", MC.getErrorField().getText());
        }
    }

    @Test
    public void getBtnThreeTest() {
        assertEquals(M.getBtnThree(), MC.getBtnThree());
        MC.getBtnThree().doClick();
        assertEquals("3", MC.getNumField().getText());
    }

    @Test
    public void getBtnNineTest() {
        assertEquals(M.getBtnNine(), MC.getBtnNine());
        MC.getBtnNine().doClick();
        assertEquals("9", MC.getNumField().getText());
    }

    @Test
    public void getBtnClearTest() {
        assertEquals(M.getBtnClear(), MC.getBtnClear());
        try {
            MC.getBtnClear().doClick();
        } catch (Exception e) {
            assertEquals("Tidak ada angka", MC.getErrorField().getText());
        }
    }

    @Test
    public void getBtnMemCTest() {
        assertEquals(M.getBtnMemC(), MC.getBtnMemC());
    }

    @Test
    public void getBtnSeven() {
        assertEquals(M.getBtnSeven(), MC.getBtnSeven());
        MC.getBtnSeven().doClick();
        assertEquals("7", MC.getNumField().getText());
    }

    @Test
    public void getBtnEightTest() {
        assertEquals(M.getBtnEight(), MC.getBtnEight());
        MC.getBtnEight().doClick();
        assertEquals("8", MC.getNumField().getText());
    }

    @Test
    public void getBtnFourTest() {
        assertEquals(M.getBtnFour(), MC.getBtnFour());
        MC.getBtnFour().doClick();
        assertEquals("4", MC.getNumField().getText());
    }

    @Test
    public void getBtnFiveTest() {
        assertEquals(M.getBtnFive(), MC.getBtnFive());
        MC.getBtnFive().doClick();
        assertEquals("5", MC.getNumField().getText());
    }

    @Test
    public void getBtnMemRTest() {
        assertEquals(M.getBtnMemR(), MC.getBtnMemR());
        try {
            MC.getBtnMemR().doClick();
        } catch (Exception e) {
            assertEquals("Tidak ada data", MC.getErrorField().getText());
        }
    }

    @Test
    public void getBtnSquareTest() {
        assertEquals(M.getBtnSquare(), MC.getBtnSquare());
        MC.getBtnSquare().doClick();
        assertEquals("√", MC.getLabel().getText());
    }
}