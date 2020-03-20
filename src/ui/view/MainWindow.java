package ui.view;

import javax.swing.*;

public class MainWindow extends JFrame{
    private JTextField numField;
    private JTextField errorField;
    private JTextField label;
    private JButton btnDot;
    private JButton btnZero;
    private JButton btnAns;
    private JButton btnPlus;
    private JButton btnTwo;
    private JButton btnSix;
    private JButton btnMul;
    private JButton btnMin;
    private JButton btnDiv;
    private JButton btnEqu;
    private JButton btnOne;
    private JButton btnThree;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMemC;
    private JButton btnSeven;
    private JButton banEight;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnMemR;
    private JButton btnSquare;
    private JPanel mainPanel;

    public MainWindow() {
        setSize(350, 400);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public JTextField getNumField() {
        return numField;
    }

    public JTextField getErrorField() {
        return errorField;
    }

    public JTextField getLabel() {
        return label;
    }

    public JButton getBtnDot() {
        return btnDot;
    }

    public JButton getBtnZero() {
        return btnZero;
    }

    public JButton getBtnAns() {
        return btnAns;
    }

    public JButton getBtnPlus() {
        return btnPlus;
    }

    public JButton getBtnTwo() {
        return btnTwo;
    }

    public JButton getBtnSix() {
        return btnSix;
    }

    public JButton getBtnMul() {
        return btnMul;
    }

    public JButton getBtnMin() {
        return btnMin;
    }

    public JButton getBtnDiv() {
        return btnDiv;
    }

    public JButton getBtnEqu() {
        return btnEqu;
    }

    public JButton getBtnOne() {
        return btnOne;
    }

    public JButton getBtnThree() {
        return btnThree;
    }

    public JButton getBtnNine() {
        return btnNine;
    }

    public JButton getBtnClear() {
        return btnClear;
    }

    public JButton getBtnMemC() {
        return btnMemC;
    }

    public JButton getBtnSeven() {
        return btnSeven;
    }

    public JButton getBanEight() {
        return banEight;
    }

    public JButton getBtnFour() {
        return btnFour;
    }

    public JButton getBtnFive() {
        return btnFive;
    }

    public JButton getBtnMemR() {
        return btnMemR;
    }

    public JButton getBtnSquare() {
        return btnSquare;
    }
}
