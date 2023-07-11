package bms.bank.management.system;

/**
 *
 * @author prashantkumar
 */

import javax.swing.*;
import java.awt.*;//import java.awt for image function
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    
//    set all variable to global to access by mysql
    long random;
    JTextField nameTextField, fatherTextField, emailTextField, addressTextField,cityTextField, stateTextField, pinTextField, branchTextField;
    JDateChooser dateChooser;
    JRadioButton male, female, other, married, unmarried, others;
    JButton next;
    
    
    
    SignupOne(){
        setTitle("New User Form Validation - Page : 01 ");
        
        setLayout(null);
        //        For insert the image into the frame I use a function name ImageIcon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/check-list.png"));
        
        Image i2 = i1.getImage().getScaledInstance(100, 110, Image.SCALE_DEFAULT);
        
        ImageIcon i3 = new ImageIcon(i2);
//        for lable the image to the desire point using Jlable
        JLabel label = new JLabel(i3);
            label.setBounds(40, 10, 100, 110 );
        add(label);
        
        
        
        
        Random ran = new Random();
        random = (Math.abs((ran.nextLong() % 9000L)+ 1000L));
        
        JLabel formno = new JLabel("APPICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 22));
        name.setBounds(100, 140, 110, 30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        JLabel fathername = new JLabel("Father's Name:");
        fathername.setFont(new Font("Raleway", Font.BOLD, 22));
        fathername.setBounds(100, 190, 210, 30);
        add(fathername);
        
        fatherTextField = new JTextField();
        fatherTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fatherTextField.setBounds(300, 190, 400, 30);
        add(fatherTextField);
        
//      This one is for the datechooser using JDateChooser Function 
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 22));
        dob.setBounds(100, 240, 210, 30);
        add(dob);
        
        

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        /***********************************************/ 
            
            
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setBounds(100, 290, 210, 30);
        add(gender);
        

//     This part is for the radio buttons
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 120, 30);
        male.setBackground(Color.WHITE);
        add(male);
        

        
        
        female = new JRadioButton("Female");
        female.setBounds(450, 290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        
        other = new JRadioButton("Other");
        other.setBounds(630, 290,120,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        //this is for group the both radio button to select either one of it .....
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);
        
        /***********************************************/ 
        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setBounds(100, 340, 210, 30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);
        
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 22));
        marital.setBounds(100, 390, 210, 30);
        add(marital);
        
//        This part is for the radio buttons
        
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 120, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 120, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        others = new JRadioButton("Others");
        others.setBounds(630, 390, 100, 30);
        others.setBackground(Color.WHITE);
        add(others);
        
          //   this is for group the both radio button to select either one of it .....
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(others);
        
         /***********************************************/
        
        JLabel address = new JLabel("Address");
        address.setFont(new Font("Raleway", Font.BOLD, 22));
        address.setBounds(100, 440, 210, 30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 22));
        city.setBounds(100, 490, 210, 30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        
        JLabel state = new JLabel("State");
        state.setFont(new Font("Raleway", Font.BOLD, 22));
        state.setBounds(100, 540, 210, 30);
        add(state);
        
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        
        
        JLabel pincode = new JLabel("Pin code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 22));
        pincode.setBounds(100, 590, 210, 30);
        add(pincode);
        
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300, 590, 400, 30);
        add(pinTextField);
        
        
        JLabel branchname = new JLabel("Branch Name:");
        branchname.setFont(new Font("Raleway", Font.BOLD, 22));
        branchname.setBounds(100, 640, 210, 30);
        add(branchname);
        
        
        branchTextField = new JTextField();
        branchTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        branchTextField.setBounds(300, 640, 400, 30);
        add(branchTextField);
        
/*---------------------Form Text Over----------------------------------*/   
        
        next  = new JButton("Next");
//        next.setBackground(Color.BLACK);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(630,700,80,30);
        next.addActionListener(this);
        add(next);

        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
//        String because all the data values are in integer or text somehow but after pushing it into the mysql we need to convert it into String and send to mysql data base;
        String formno = "" + random; // concat with ("")
        String name = nameTextField.getText();
        String fathername = fatherTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        
        
        String gender = null;
        if(male.isSelected()){
            gender ="Male";
        }
        else if(female.isSelected()){
            gender = "Female";
        }
        else if(other.isSelected()){
            gender = "Other";
        }
        
        
        
        String email = emailTextField.getText();
        
        
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }else if(unmarried.isSelected()){
            marital = "Unmarried";
        }else if(other.isSelected()){
            marital = "Other";
        }
     
    String address = addressTextField.getText();
    String city = cityTextField.getText();
    String state = stateTextField.getText();
    String pincode = pinTextField.getText();
    String branchname =  branchTextField.getText();
    
    try{
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Name is Required");
        }
        else if(fathername.equals("")){
            JOptionPane.showMessageDialog(null, "Enter Father Name");
        }
        else if(dob.equals("")){
            JOptionPane.showMessageDialog(null, "Enter Your Date of Birth ");
        }
        else if(email.equals("")){
            JOptionPane.showMessageDialog(null, "Enter Your Email");
        }
        else if(address.equals("")){
            JOptionPane.showMessageDialog(null, "Enter Your Address Name");
        }
        else if(city.equals("")){
            JOptionPane.showMessageDialog(null, "Enter City Name");
        }
        else if(state.equals("")){
            JOptionPane.showMessageDialog(null, "Enter State Name");
        }
        else if(pincode.equals("")){
            JOptionPane.showMessageDialog(null, "Enter Pin-Code Name");
        }
        else if(branchname.equals("")){
            JOptionPane.showMessageDialog(null, "Enter Branch Name");
        }
        else{
            Conn c = new Conn();
            String query = "insert into signup values('"+formno+"', '"+name+"', '"+fathername+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pincode+"', '"+branchname+"')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new SignupTwo(formno).setVisible(true);
        }
    }catch (Exception e){
        System.out.println(e);
    }
    
    }
    
    public static void main(String[] args){
//        Constructor of the class
        new SignupOne(); //constructor call
    }
    
}


