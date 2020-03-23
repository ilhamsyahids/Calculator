package ui.controller;

import expression.*;
import ui.view.MainWindow;
import memcalc.Memory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * File: MainWindowController.java
 * Program Controller untuk GUI yang digunakan
 */

public class MainWindowController {

    // Components GUI Calculator
    private MainWindow mainWindow;
    private JTextField numField;
    private JTextField errorField;
    private JTextField label;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnDot;
    private JButton btnZero;
    private JButton btnAns;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnMul;
    private JButton btnMin;
    private JButton btnDiv;
    private JButton btnEqu;
    private JButton btnThree;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMemC;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnMemR;
    private JButton btnSquare;
    private JButton btnClearNum;

    //Komponen untuk kalkulasi pada GUI
    private TerminalExpression Exp;
    private Double ans;
    private boolean first;
    private int typeExp;
    private Memory<Double> memo;
    private boolean justAnswered;

    /**
     * Constructors
     */
    public MainWindowController() {
        initComponents(new MainWindow());
        initListeners();
    }

    public MainWindowController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        initComponents(mainWindow);
        initListeners();
    }

    /**
     * Init property to pointer components
     */
    public void initComponents(MainWindow mainWindow) {
        setTypeExp(0);
        setAns(0.0);
        setFirst(true);
        setExp(new TerminalExpression(0.0));
        setMemo(new Memory<>());
        setJustAnswered(false);

        setMainWindow(mainWindow);
        setBtnAns(mainWindow.getBtnAns());
        setBtnClear(mainWindow.getBtnClear());
        setBtnDiv(mainWindow.getBtnDiv());
        setBtnDot(mainWindow.getBtnDot());
        setBtnEqu(mainWindow.getBtnEqu());
        setBtnMemC(mainWindow.getBtnMemC());
        setBtnMemR(mainWindow.getBtnMemR());
        setBtnMin(mainWindow.getBtnMin());
        setBtnMul(mainWindow.getBtnMul());
        setBtnPlus(mainWindow.getBtnPlus());
        setErrorField(mainWindow.getErrorField());
        setBtnSquare(mainWindow.getBtnSquare());
        setLabel(mainWindow.getLabel());
        setNumField(mainWindow.getNumField());
        setBtnZero(mainWindow.getBtnZero());
        setBtnOne(mainWindow.getBtnOne());
        setBtnTwo(mainWindow.getBtnTwo());
        setBtnThree(mainWindow.getBtnThree());
        setBtnFour(mainWindow.getBtnFour());
        setBtnFive(mainWindow.getBtnFive());
        setBtnSix(mainWindow.getBtnSix());
        setBtnSeven(mainWindow.getBtnSeven());
        setBtnEight(mainWindow.getBtnEight());
        setBtnNine(mainWindow.getBtnNine());
        setBtnClearNum(mainWindow.getBtnClearNum());
    }

    /**
     * Init listeners to button or field
     */
    private void initListeners() {
        btnDot.addActionListener(new DotBtnListener());
        btnOne.addActionListener(new OneBtnListener());
        btnTwo.addActionListener(new TwoBtnListener());
        btnThree.addActionListener(new ThreeBtnListener());
        btnFour.addActionListener(new FourBtnListener());
        btnFive.addActionListener(new FiveBtnListener());
        btnSix.addActionListener(new SixBtnListener());
        btnSeven.addActionListener(new SevenBtnListener());
        btnEight.addActionListener(new EightBtnListener());
        btnNine.addActionListener(new NineBtnListener());
        btnZero.addActionListener(new ZeroBtnListener());
        btnClear.addActionListener(new ClearBtnListener());
        btnMemC.addActionListener(new MemCBtnListener());
        btnMemR.addActionListener(new MemRBtnListener());
        btnAns.addActionListener(new AnsBtnListener());
        btnEqu.addActionListener(new EquBtnListener());
        btnMul.addActionListener(new MulBtnListener());
        btnDiv.addActionListener(new DivBtnListener());
        btnPlus.addActionListener(new PlusBtnListener());
        btnMin.addActionListener(new MinBtnListener());
        btnSquare.addActionListener(new SquareBtnListener());
        btnClearNum.addActionListener(new ClearNumListener());
    }

    public JButton getBtnClearNum() {
        return btnClearNum;
    }

    public void setBtnClearNum(JButton btnClearNum) {
        this.btnClearNum = btnClearNum;
    }

    public TerminalExpression getExp() {
        return Exp;
    }

    public void setExp(TerminalExpression exp) {
        Exp = exp;
    }

    public Double getAns() {
        return ans;
    }

    public void setAns(Double ans) {
        this.ans = ans;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public int getTypeExp() {
        return typeExp;
    }

    public void setTypeExp(int typeExp) {
        this.typeExp = typeExp;
    }

    public Memory<Double> getMemo() {
        return memo;
    }

    public void setMemo(Memory<Double> memo) {
        this.memo = memo;
    }

    public boolean isJustAnswered() {
        return justAnswered;
    }

    public void setJustAnswered(boolean justAnswered) {
        this.justAnswered = justAnswered;
    }

    public MainWindow getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    public JTextField getNumField() {
        return numField;
    }

    public void setNumField(JTextField numField) {
        this.numField = numField;
    }

    public JTextField getErrorField() {
        return errorField;
    }

    public void setErrorField(JTextField errorField) {
        this.errorField = errorField;
    }

    public JTextField getLabel() {
        return label;
    }

    public void setLabel(JTextField label) {
        this.label = label;
    }

    public JButton getBtnOne() {
        return btnOne;
    }

    public void setBtnOne(JButton btnOne) {
        this.btnOne = btnOne;
    }

    public JButton getBtnTwo() {
        return btnTwo;
    }

    public void setBtnTwo(JButton btnTwo) {
        this.btnTwo = btnTwo;
    }

    public JButton getBtnDot() {
        return btnDot;
    }

    public void setBtnDot(JButton btnDot) {
        this.btnDot = btnDot;
    }

    public JButton getBtnZero() {
        return btnZero;
    }

    public void setBtnZero(JButton btnZero) {
        this.btnZero = btnZero;
    }

    public JButton getBtnAns() {
        return btnAns;
    }

    public void setBtnAns(JButton btnAns) {
        this.btnAns = btnAns;
    }

    public JButton getBtnPlus() {
        return btnPlus;
    }

    public void setBtnPlus(JButton btnPlus) {
        this.btnPlus = btnPlus;
    }

    public JButton getBtnSix() {
        return btnSix;
    }

    public void setBtnSix(JButton btnSix) {
        this.btnSix = btnSix;
    }

    public JButton getBtnMul() {
        return btnMul;
    }

    public void setBtnMul(JButton btnMul) {
        this.btnMul = btnMul;
    }

    public JButton getBtnMin() {
        return btnMin;
    }

    public void setBtnMin(JButton btnMin) {
        this.btnMin = btnMin;
    }

    public JButton getBtnDiv() {
        return btnDiv;
    }

    public void setBtnDiv(JButton btnDiv) {
        this.btnDiv = btnDiv;
    }

    public JButton getBtnEqu() {
        return btnEqu;
    }

    public void setBtnEqu(JButton btnEqu) {
        this.btnEqu = btnEqu;
    }

    public JButton getBtnThree() {
        return btnThree;
    }

    public void setBtnThree(JButton btnThree) {
        this.btnThree = btnThree;
    }

    public JButton getBtnNine() {
        return btnNine;
    }

    public void setBtnNine(JButton btnNine) {
        this.btnNine = btnNine;
    }

    public JButton getBtnClear() {
        return btnClear;
    }

    public void setBtnClear(JButton btnClear) {
        this.btnClear = btnClear;
    }

    public JButton getBtnMemC() {
        return btnMemC;
    }

    public void setBtnMemC(JButton btnMemC) {
        this.btnMemC = btnMemC;
    }

    public JButton getBtnSeven() {
        return btnSeven;
    }

    public void setBtnSeven(JButton btnSeven) {
        this.btnSeven = btnSeven;
    }

    public JButton getBtnEight() {
        return btnEight;
    }

    public void setBtnEight(JButton btnEight) {
        this.btnEight = btnEight;
    }

    public JButton getBtnFour() {
        return btnFour;
    }

    public void setBtnFour(JButton btnFour) {
        this.btnFour = btnFour;
    }

    public JButton getBtnFive() {
        return btnFive;
    }

    public void setBtnFive(JButton btnFive) {
        this.btnFive = btnFive;
    }

    public JButton getBtnMemR() {
        return btnMemR;
    }

    public void setBtnMemR(JButton btnMemR) {
        this.btnMemR = btnMemR;
    }

    public JButton getBtnSquare() {
        return btnSquare;
    }

    public void setBtnSquare(JButton btnSquare) {
        this.btnSquare = btnSquare;
    }

    /**
     * Show the window
     */
    public void showWindow() {
        mainWindow.setVisible(true);
    }


    private class AnsBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clearError();
            numField.setText(ans.toString());
        }
    }

    private class DotBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            resetJustAnswered();
            numField.setText(numField.getText() + '.');
        }
    }

    private class OneBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            resetJustAnswered();
            numField.setText(numField.getText() + '1');
        }
    }

    private class TwoBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            resetJustAnswered();
            numField.setText(numField.getText() + '2');
        }
    }

    private class ThreeBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            resetJustAnswered();
            numField.setText(numField.getText() + '3');
        }
    }

    private class FourBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            resetJustAnswered();
            numField.setText(numField.getText() + '4');
        }
    }

    private class FiveBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            resetJustAnswered();
            numField.setText(numField.getText() + '5');
        }
    }

    private class SixBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            resetJustAnswered();
            numField.setText(numField.getText() + '6');
        }
    }

    private class SevenBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            resetJustAnswered();
            numField.setText(numField.getText() + '7');
        }
    }

    private class EightBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            resetJustAnswered();
            numField.setText(numField.getText() + '8');
        }
    }

    private class NineBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            resetJustAnswered();
            numField.setText(numField.getText() + '9');
        }
    }

    private class ZeroBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!numField.getText().equals("0")) {
                numField.setText(numField.getText() + '0');
            }
        }
    }

    private class ClearBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            resetAtt();
            resetField();
        }
    }

    private class MemCBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if(typeExp != 0) {
                    throw new NumberFormatException("Selesaikan perhitungan terlebih dahulu");
                } else {
                    if(numField.getText().length() > 0){
                        memo.memorize(Double.valueOf(numField.getText()));
                    } else {
                        memo.memorize(ans);
                    }
                }
                errorField.setText("Berhasil disimpan");
            } catch (Exception e1) {
                if(e1.getMessage().equals("Selesaikan perhitungan terlebih dahulu")){
                    errorField.setText(e1.getMessage());
                } else {
                    errorField.setText("Tidak ada angka");
                }
            }
        }
    }

    private class MemRBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Double memoryRecall = memo.recall();
                numField.setText(memoryRecall.toString());
            } catch(Exception ex) {
                errorField.setText(ex.getMessage());
            }
        }
    }

    private class EquBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Expression solveExp;
                if (numField.getText() == "") throw new Exception("Tidak ada angka");
                TerminalExpression firstNum = new TerminalExpression(Double.parseDouble(numField.getText()));
                switch (typeExp) {
                    case 1:
                        solveExp = new MultiplyExpression(Exp, firstNum);
                        Exp = new TerminalExpression(solveExp.solve());
                        break;
                    case 2:
                        solveExp = new DivideExpression(Exp, firstNum);
                        Exp = new TerminalExpression(solveExp.solve());
                        break;
                    case 3:
                        solveExp = new AddExpression(Exp, firstNum);
                        Exp = new TerminalExpression(solveExp.solve());
                        break;
                    case 4:
                        solveExp = new SubstractExpression (Exp, firstNum);
                        Exp = new TerminalExpression(solveExp.solve());
                        break;
                    case 5:
                        solveExp = new SqrtExpression(firstNum);
                        Exp = new TerminalExpression(solveExp.solve());
                        break;
                    default:
                        Exp = firstNum;
                }
                if (typeExp == 0) {
                    label.setText(numField.getText());
                    ans = Double.parseDouble(numField.getText());
                } else {
                    ans = Exp.solve();
                    label.setText(label.getText() + firstNum.solve() + " = " + ans.toString());
                }
                numField.setText(ans.toString());
                clearError();
                typeExp = 0;
                first = true;
                justAnswered = true;
            } catch (Exception ex) {
                errorField.setText(ex.getMessage());
                numField.setText("");
            }
        }
    }

    private class MulBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (numField.getText().length() <= 0) throw new Exception("Tidak ada angka");
                TerminalExpression firstNum = new TerminalExpression(Double.parseDouble(numField.getText()));
                if (first) {
                    Exp = firstNum;
                    first = false;
                }
                else {
                    MultiplyExpression res = new MultiplyExpression(Exp, firstNum);
                    Exp = new TerminalExpression(res.solve());
                }
                resetField();
                label.setText(Exp.getX() + " x ");
                typeExp = 1;
            } catch (Exception e1) {
                errorField.setText(e1.getMessage());
            }
        }
    }

    private class DivBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (numField.getText().length() <= 0) throw new Exception("Tidak ada angka");
                TerminalExpression firstNum = new TerminalExpression(Double.parseDouble(numField.getText()));
                if (first) {
                    Exp = firstNum;
                    first = false;
                }
                else {
                    DivideExpression res = new DivideExpression(Exp, firstNum);
                    Exp = new TerminalExpression(res.solve());
                }
                resetField();
                label.setText(Exp.getX() + " : ");
                typeExp = 2;
            } catch (Exception e1) {
                errorField.setText(e1.getMessage());
            }
        }
    }

    private class PlusBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (numField.getText().length() <= 0) throw new Exception("Tidak ada angka");
                TerminalExpression firstNum = new TerminalExpression(Double.parseDouble(numField.getText()));
                if (first) {
                    Exp = firstNum;
                    first = false;
                }
                else {
                    AddExpression res = new AddExpression(Exp, firstNum);
                    Exp = new TerminalExpression(res.solve());
                }
                resetField();
                label.setText(Exp.getX() + " + ");
                typeExp = 3;
            } catch (Exception e1) {
                errorField.setText(e1.getMessage());
            }
        }
    }

    private class MinBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (numField.getText().length() <= 0) {
                    numField.setText("-");
                    return;
                }
                TerminalExpression firstNum = new TerminalExpression(Double.parseDouble(numField.getText()));
                if (first) {
                    Exp = firstNum;
                    first = false;
                }
                else {
                    SubstractExpression res = new SubstractExpression(Exp, firstNum);
                    Exp = new TerminalExpression(res.solve());
                }
                resetField();
                label.setText(Exp.getX() + " - ");
                typeExp = 4;
            } catch (Exception e1) {
                errorField.setText(e1.getMessage());
            }
        }
    }

    private class SquareBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                resetJustAnswered();
                label.setText("√");
                typeExp = 5;
            } catch (Exception e1) {
                errorField.setText(e1.getMessage());
            }
        }
    }

    private void resetJustAnswered() {
        if(justAnswered) {
            justAnswered = false;
            if (numField.getText() != "-") numField.setText("");
        }
    }

    private void resetAtt() {
        typeExp = 0;
        ans = 0.0;
        first = true;
        justAnswered = false;
        Exp = new TerminalExpression(0.0);
        memo.clear();
    }

    private void resetField() {
        clearError();
        label.setText("");
        numField.setText("");
    }

    private void clearError() {
        errorField.setText("");
    }

    private class ClearNumListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numField.setText("");
        }
    }
}
