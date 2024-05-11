package javaapplication70;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class TicTacToe {
    public static void main(String args[])
    {
        JFrame jf = new JFrame("TTT");
        jf.setBounds(100, 100, 400, 400);
        jf.setLayout(new FlowLayout());
        JButton jb = new JButton();
        jf.add(jb);
        JButton jb1 = new JButton();
        JButton jb2 = new JButton();
        JButton jb3 = new JButton();
        JButton jb4 = new JButton();
        JButton jb5 = new JButton();
        JButton jb6 = new JButton();
        JButton jb7 = new JButton();
        JButton jb8 = new JButton();
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4);
        jf.add(jb5);
        jf.add(jb6);
        jf.add(jb7);
        jf.add(jb8);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
