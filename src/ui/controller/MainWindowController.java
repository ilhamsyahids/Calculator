package ui.controller;

import expression.*;
import ui.view.MainWindow;
import memcalc.Memory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindowController {
    private static final int MAXSTRINGLABEL = 15;

    private MainWindow mainWindow;
    private JTextField numField;
    private JTextField errorField;
    private JLabel label;
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

    private TerminalExpression Exp;
    private Double ans;
    private boolean first;
    private int typeExp;
    private Memory<Double> MM;

    public MainWindowController() {
        initComponents();
        initListeners();
    }

    public void initComponents() {
        typeExp = 0;
        ans = 0.0;
        first = true;
        Exp = new TerminalExpression(0.0);
        MM = new Memory<Double>();

        mainWindow = new MainWindow();
        btnOne = mainWindow.getBtnOne();
        btnTwo = mainWindow.getBtnTwo();
        btnThree = mainWindow.getBtnThree();
        btnFour = mainWindow.getBtnFour();
        btnFive = mainWindow.getBtnFive();
        btnSix = mainWindow.getBtnSix();
        btnSeven = mainWindow.getBtnSeven();
        btnEight = mainWindow.getBanEight();
        btnNine = mainWindow.getBtnNine();
        btnZero = mainWindow.getBtnZero();
        btnDot = mainWindow.getBtnDot();
        btnPlus = mainWindow.getBtnPlus();
        btnMin = mainWindow.getBtnMin();
        btnMul = mainWindow.getBtnMul();
        btnDiv = mainWindow.getBtnDiv();
        btnSquare = mainWindow.getBtnSquare();
        btnClear = mainWindow.getBtnClear();
        btnAns = mainWindow.getBtnAns();
        btnEqu = mainWindow.getBtnEqu();
        btnMemC = mainWindow.getBtnMemC();
        btnMemR = mainWindow.getBtnMemR();
        numField = mainWindow.getNumField();
        errorField = mainWindow.getErrorField();
        label = mainWindow.getLabel();
    }

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
    }

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
            numField.setText(numField.getText() + '.');
        }
    }

    private class OneBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numField.setText(numField.getText() + '1');
        }
    }

    private class TwoBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numField.setText(numField.getText() + '2');
        }
    }

    private class ThreeBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numField.setText(numField.getText() + '3');
        }
    }

    private class FourBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numField.setText(numField.getText() + '4');
        }
    }

    private class FiveBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numField.setText(numField.getText() + '5');
        }
    }

    private class SixBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numField.setText(numField.getText() + '6');
        }
    }

    private class SevenBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numField.setText(numField.getText() + '7');
        }
    }

    private class EightBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numField.setText(numField.getText() + '8');
        }
    }

    private class NineBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
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
            numField.setText("");
            label.setText("");
            clearError();
        }
    }

    private class MemCBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            MM.memorize(Double.valueOf(label.getText()));
            errorField.setText("Berhasil disimpan");
        }
    }

    private class MemRBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Double memoryRecall = MM.recall();
                label.setText(Double.toString(memoryRecall));
            } catch(Exception ex) {
                errorField.setText(ex.getMessage());
            }
        }
    }

    private class EquBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            TerminalExpression firstNum = new TerminalExpression(Double.parseDouble(numField.getText()));
            switch (typeExp) {
                case 1:
                    MultiplyExpression mul = new MultiplyExpression(Exp, firstNum);
                    Exp = new TerminalExpression(mul.solve());
                    break;
                case 2:
                    DivideExpression div = new DivideExpression(Exp, firstNum);
                    Exp = new TerminalExpression(div.solve());
                    break;
                case 3:
                    AddExpression add = new AddExpression(Exp, firstNum);
                    Exp = new TerminalExpression(add.solve());
                    break;
                case 4:
                    SubstractExpression sub = new SubstractExpression (Exp, firstNum);
                    Exp = new TerminalExpression(sub.solve());
                    break;
                case 5:
                    SqrtExpression sqrt = new SqrtExpression(firstNum);
                    Exp = new TerminalExpression(sqrt.solve());
                    break;
            }
            ans = Exp.solve();
            resetField();
            resetAtt();
            label.setText(ans.toString());
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
                label.setText(Exp.getX() + " x ");
                numField.setText("");
                clearError();
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
                if (Double.parseDouble(numField.getText()) == 0.0000) throw new Exception("Pembilang Nol");
                TerminalExpression firstNum = new TerminalExpression(Double.parseDouble(numField.getText()));
                if (first) {
                    Exp = firstNum;
                    first = false;
                }
                else {
                    DivideExpression res = new DivideExpression(Exp, firstNum);
                    Exp = new TerminalExpression(res.solve());
                }
                label.setText(Exp.getX() + " : ");
                numField.setText("");
                clearError();
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
                label.setText(Exp.getX() + " + ");
                numField.setText("");
                clearError();
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
                label.setText(Exp.getX() + " - ");
                numField.setText("");
                clearError();
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
                if (numField.getText().length() <= 0) throw new Exception("Tidak ada angka");
                TerminalExpression firstNum = new TerminalExpression(Double.parseDouble(numField.getText()));
                SqrtExpression res = new SqrtExpression(firstNum);
                Exp = new TerminalExpression(res.solve());
                label.setText("√");
                clearError();
                typeExp = 5;
            } catch (Exception e1) {
                errorField.setText(e1.getMessage());
            }
        }
    }

    private void setLabelText(String s) {
        if (s.length() > MAXSTRINGLABEL) {
            label.setText(s.substring(s.length() - MAXSTRINGLABEL, MAXSTRINGLABEL));
        } else label.setText(s);
    }

    private void resetAtt() {
        Exp = new TerminalExpression(0.0);
        first = true;
    }

    private void resetField() {
        clearError();
        label.setText("");
        numField.setText("");
    }

    private void clearError() {
        errorField.setText("");
    }
}
