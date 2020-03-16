package ui.controller;

import ui.view.MainWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindowController {
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

    public MainWindowController() {
        initComponents();
        initListeners();
    }

    public void initComponents() {
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
            System.out.println(numField.getText());

            if (!numField.getText().equals("0")) {
                numField.setText(numField.getText() + '0');
            }
        }
    }

    private class ClearBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numField.setText("");
        }
    }

    private class MemCBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class MemRBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class EquBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class MulBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numField.setText(numField.getText() + 'x');
        }
    }

    private class DivBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numField.setText(numField.getText() + ':');
        }
    }

    private class PlusBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numField.setText(numField.getText() + '+');
        }
    }

    private class MinBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numField.setText(numField.getText() + '-');
        }
    }

    private class SquareBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numField.setText(numField.getText() + "√");
        }
    }
}
