
package bms.bank.management.system;

/**
 *
 * @author prashantkumar
 */
import javax.swing.*;
import java.awt.*;//import java.awt for image function
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    
//    Globally Defines the button from locally
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
//    Class Constructor
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        /* --------------------------------------------------------- */
//        For insert the image into the frame I use a function name ImageIcon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        
        Image i2 = i1.getImage().getScaledInstance(100, 110, Image.SCALE_DEFAULT);
        
        ImageIcon i3 = new ImageIcon(i2);
//        for lable the image to the desire point using Jlable
        JLabel label = new JLabel(i3);
            label.setBounds(70, 10, 100, 110 );
        add(label);
        
        
//              For insert the image into the frame I use a function name ImageIcon
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/credit.png"));
       
        Image i5 = i4.getImage().getScaledInstance(110, 100, Image.SCALE_DEFAULT);
       
        ImageIcon i6 = new ImageIcon(i5);

//    for lable the image to the desire point using Jlable
        JLabel label1 = new JLabel(i6);
           label1.setBounds(600, 12, 110, 90 );
       add(label1);
        
        /* ---------------------------------------------------------- */
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.black);
//        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.black);
//        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.black);
//        login.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);

        /* --------------------------------------------------------- */
        
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("Welcome to ATM ");
        text.setFont(new Font("Osword", Font.BOLD, 38));
        text.setBounds(230, 40, 400, 40);
        add(text);
        
        JLabel cardno = new JLabel("Card No: ");
        cardno.setFont(new Font("Osword", Font.BOLD, 38));
        cardno.setBounds(120, 150, 250, 30);
        add(cardno);
//        For the input-box of the CardNo: 
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD, 15));
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Osword", Font.BOLD, 38));
        pin.setBounds(120, 220, 250, 30);
        add(pin);
        
        //For the input-box of the Pin No: 
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial",Font.BOLD, 15));
        add(pinTextField);
        
        setSize(750,580);
        
//        Function Call
        setVisible(true);
        setLocation(350,200); // for make the frame in center of the login page 
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
//   this setText function is used to read the text into the box 
//and clear if click on clear because it is in the clear clear function button action
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource() == login){
            Conn c = new Conn();
            String cardnum = cardTextField.getText();
            String pinnum = pinTextField.getText();

              String query = "select * from login where cardnumber = '"+cardnum+"'";
//              String query = "select * from login where cardnumber = '"+cardnum+"' and pinnumber = '"+pinnum+ "'";
            try{
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnum).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }else if(ae.getSource() == signup){
            
            setVisible(false);
            new SignupOne().setVisible(true);
        }
        
    } 
            
    public static void main(String[] args){
//        Class Object6
        new Login();
    }
}
