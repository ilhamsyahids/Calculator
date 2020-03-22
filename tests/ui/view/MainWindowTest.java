package ui.view;

import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class MainWindowTest {
    private MainWindow MC = new MainWindow();
    @Test
    public void getNumFieldTest() {
        assertTrue(MC.getNumField() instanceof JTextField);
    }
    
    @Test
    public void getErrorFieldTest() {
        assertTrue(MC.getErrorField() instanceof JTextField);
    }
    
    @Test
    public void getLabelTest() {
        assertTrue(MC.getLabel() instanceof JTextField);
    }

    @Test
    public void getBtnDotTest() {
        assertTrue(MC.getBtnDot() instanceof JButton);
    }

    @Test
    public void getBtnZeroTest() {
        assertTrue(MC.getBtnZero() instanceof JButton);
    }

    @Test
    public void getBtnAnsTest() {
        assertTrue(MC.getBtnAns() instanceof JButton);
    }

    @Test
    public void getBtnPlusTest() {
        assertTrue(MC.getBtnPlus() instanceof JButton);
    }

    @Test
    public void getBtnTwoTest() {
        assertTrue(MC.getBtnTwo() instanceof JButton);
    }

    @Test
    public void getBtnSixTest() {
        assertTrue(MC.getBtnSix() instanceof JButton);
    }
    
    @Test
    public void getBtnMulTest() {
        assertTrue(MC.getBtnMul() instanceof JButton);
    }
    
    @Test
    public void getBtnMinTest() {
        assertTrue(MC.getBtnMin() instanceof JButton);
    }
    
    @Test
    public void getBtnDivTest() {
        assertTrue(MC.getBtnDiv() instanceof JButton);
    }
    
    @Test
    public void getBtnEquTest() {
        assertTrue(MC.getBtnEqu() instanceof JButton);
    }
    
    @Test
    public void getBtnOneTest() {
        assertTrue(MC.getBtnOne() instanceof JButton);
    }
    
    @Test
    public void getBtnThreeTest() {
        assertTrue(MC.getBtnThree() instanceof JButton);
    }
    
    @Test
    public void getBtnNineTest() {
        assertTrue(MC.getBtnNine() instanceof JButton);
    }
    
    @Test
    public void getBtnClearTest() {
        assertTrue(MC.getBtnClear() instanceof JButton);
    }
    
    @Test
    public void getBtnMemCTest() {
        assertTrue(MC.getBtnMemC() instanceof JButton);
    }
    
    @Test
    public void getBtnSevenTest() {
        assertTrue(MC.getBtnSeven() instanceof JButton);
    }
    
    @Test
    public void getBtnEightTest() {
        assertTrue(MC.getBtnEight() instanceof JButton);
    }
    
    @Test
    public void getBtnFourTest() {
        assertTrue(MC.getBtnFour() instanceof JButton);
    }
    
    @Test
    public void getBtnFiveTest() {
        assertTrue(MC.getBtnFive() instanceof JButton);
    }
    
    @Test
    public void getBtnMemRTest() {
        assertTrue(MC.getBtnMemR() instanceof JButton);
    }
    
    @Test
    public void getBtnSquareTest() {
        assertTrue(MC.getBtnSquare() instanceof JButton);
    }
}