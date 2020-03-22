package ui.view;

import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class MainWindowTest {
    private MainWindow MC = new MainWindow();
    @Test
    public void getNumField() {
        assertTrue(MC.getNumField() instanceof JTextField);
    }
    
    @Test
    public void getErrorField() {
        assertTrue(MC.getErrorField() instanceof JTextField);
    }
    
    @Test
    public void getLabel() {
        assertTrue(MC.getLabel() instanceof JTextField);
    }

    @Test
    public void getBtnDot() {
        assertTrue(MC.getBtnDot() instanceof JButton);
    }

    @Test
    public void getBtnZero() {
        assertTrue(MC.getBtnZero() instanceof JButton);
    }

    @Test
    public void getBtnAns() {
        assertTrue(MC.getBtnAns() instanceof JButton);
    }

    @Test
    public void getBtnPlus() {
        assertTrue(MC.getBtnPlus() instanceof JButton);
    }

    @Test
    public void getBtnTwo() {
        assertTrue(MC.getBtnTwo() instanceof JButton);
    }

    @Test
    public void getBtnSix() {
        assertTrue(MC.getBtnSix() instanceof JButton);
    }
    
    @Test
    public void getBtnMul() {
        assertTrue(MC.getBtnMul() instanceof JButton);
    }
    
    @Test
    public void getBtnMin() {
        assertTrue(MC.getBtnMin() instanceof JButton);
    }
    
    @Test
    public void getBtnDiv() {
        assertTrue(MC.getBtnDiv() instanceof JButton);
    }
    
    @Test
    public void getBtnEqu() {
        assertTrue(MC.getBtnEqu() instanceof JButton);
    }
    
    @Test
    public void getBtnOne() {
        assertTrue(MC.getBtnOne() instanceof JButton);
    }
    
    @Test
    public void getBtnThree() {
        assertTrue(MC.getBtnThree() instanceof JButton);
    }
    
    @Test
    public void getBtnNine() {
        assertTrue(MC.getBtnNine() instanceof JButton);
    }
    
    @Test
    public void getBtnClear() {
        assertTrue(MC.getBtnClear() instanceof JButton);
    }
    
    @Test
    public void getBtnMemC() {
        assertTrue(MC.getBtnMemC() instanceof JButton);
    }
    
    @Test
    public void getBtnSeven() {
        assertTrue(MC.getBtnSeven() instanceof JButton);
    }
    
    @Test
    public void getBtnEight() {
        assertTrue(MC.getBtnEight() instanceof JButton);
    }
    
    @Test
    public void getBtnFour() {
        assertTrue(MC.getBtnFour() instanceof JButton);
    }
    
    @Test
    public void getBtnFive() {
        assertTrue(MC.getBtnFive() instanceof JButton);
    }
    
    @Test
    public void getBtnMemR() {
        assertTrue(MC.getBtnMemR() instanceof JButton);
    }
    
    @Test
    public void getBtnSquare() {
        assertTrue(MC.getBtnSquare() instanceof JButton);
    }
}