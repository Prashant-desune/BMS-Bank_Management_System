
package bms.bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{
    JTextField t1;
    JButton b1,b2;
    JLabel l1,image;
    String pinnum;
//    constructor
    Deposit(String pinnum){
       
        this.pinnum = pinnum;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 18));
        
        b1 = new JButton("DEPOSIT");
        b2 = new JButton("BACK");
        
        setLayout(null);
        
        l1.setBounds(170,300,400,20);
        image.add(l1);
        
        t1.setBounds(170,350,320,20);
        image.add(t1);
        
        b1.setBounds(355,485,150,30);
        image.add(b1);
        
        b2.setBounds(355,520,150,30);
        image.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setLayout(null);
        setSize(900,900);
        setUndecorated(true);
        setLocation(300,0);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
        try{        
            String amount = t1.getText();
            Date date = new Date();
            if(ae.getSource()==b1){
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
                    Conn c = new Conn();
                    c.s.executeUpdate("insert into bank values('"+pinnum+"', '"+date+"', 'Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new Transactions(pinnum).setVisible(true);
                }
            }else if(ae.getSource()==b2){
                setVisible(false);
                new Transactions(pinnum).setVisible(true);
            }
        }catch(Exception e){
//            e.printStackTrace();
        }
            
    }
 public static void main(String[] args){
        new Deposit("").setVisible(true);
    }
}
