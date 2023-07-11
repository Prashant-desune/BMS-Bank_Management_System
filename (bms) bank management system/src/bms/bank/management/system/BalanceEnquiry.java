
package bms.bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import java.util.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
    JTextField t1, t2;
    JButton b1, b2, b3;
    JLabel l1, l2, l3;
    String pinnum;
    BalanceEnquiry(String pinnum) {
        this.pinnum = pinnum;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l3 = new JLabel(i3);
        l3.setBounds(0, 0, 900, 900);
        add(l3);

        l1 = new JLabel();
        l1.setFont(new Font("System", Font.BOLD, 15));
        
        b1 = new JButton("BACK");

        setLayout(null);

        l3.add(l1);

        b1.setBounds(355, 520, 150, 20);
        l3.add(b1);
        
        Conn c = new Conn();
        int balance = 0;
        try{
            
            ResultSet rs = c.s.executeQuery("select * from bank where pinnum = '"+pinnum+"'");
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
                 }
        }catch(Exception e){
            System.out.println(e);
        }
        
        l1.setText("Your Current Account Balance is Rs : "+balance);
        l1.setForeground(Color.WHITE);
        l1.setBounds(155,290, 400, 20);
        b1.addActionListener(this);

        setSize(900, 900);
        setUndecorated(true);
        setLocation(300, 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transactions(pinnum).setVisible(true);
    }
    
    public static void main(String[] args) {
        new BalanceEnquiry("").setVisible(true);
    }
}
