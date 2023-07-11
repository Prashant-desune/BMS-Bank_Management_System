package bms.bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener{
    
    JButton deposite, withdrawl, ministatement,  fastcash, balanceenquiry, exit;
    String pinnum;
    
    Transactions(String pinnum){
        this.pinnum = pinnum;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        image.add(text);
        text.setFont(new Font ("System", Font.BOLD, 16));
        
        
        deposite= new JButton("DEPOSIT");
        deposite.setBounds(170,415,150,30);
        image.add(deposite);
        
        withdrawl = new JButton("CASH WITHDRAWL");
        withdrawl.setBounds(355,415,150,30);
        image.add(withdrawl);
        
        fastcash = new JButton("FAST CASH");
        fastcash.setBounds(170,450,150,30);
        image.add(fastcash);
        
        ministatement = new JButton("MINI STATEMENT");
        ministatement.setBounds(355,450,150,30);
        image.add(ministatement);
        
//        pinchange = new JButton("PIN CHANGE");
//        pinchange.setBounds(170,485,150,30);
//        image.add(pinchange);
        
        balanceenquiry = new JButton("BALANCE ENQUIRY");
        
        balanceenquiry.setBounds(170,485,150,30);
        image.add(balanceenquiry);
        
        exit = new JButton("EXIT");
        exit.setBounds(355,485,150,30);
        image.add(exit);
        
        
//        add the actionlistner on all the buttons

        deposite.addActionListener(this);
        withdrawl.addActionListener(this);
        fastcash.addActionListener(this);
        ministatement.addActionListener(this);
//        pinchange.addActionListener(this);
        balanceenquiry.addActionListener(this);
        exit.addActionListener(this);
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    } 
    
    
    public void actionPerformed(ActionEvent ae){
           if(ae.getSource()==exit){
               System.exit(0);
           }else if(ae.getSource()==deposite){
               setVisible(false);
               new Deposit(pinnum).setVisible(true);
           }else if(ae.getSource()==fastcash){ 
                setVisible(false);
                new FastCash(pinnum).setVisible(true);
        }else if(ae.getSource()==balanceenquiry){ 
            this.setVisible(false);
            new BalanceEnquiry(pinnum).setVisible(true);
        }else if(ae.getSource()==withdrawl){ 
            this.setVisible(false);
            new CashDrawal(pinnum).setVisible(true);
        }else if(ae.getSource()==ministatement){ 
            new MiniStatement(pinnum).setVisible(true);
        }else if(ae.getSource()==exit){ 
            System.exit(0);
        }
    }
    
    
    
    public static void main(String args[]){
        new Transactions("");
    }
}





            
