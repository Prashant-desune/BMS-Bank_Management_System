package bms.bank.management.system;

/**
 *
 * @author prashantkumar
 */

import javax.swing.*;
import java.awt.*;//import java.awt for image function
import java.util.*;
import java.awt.event.*;
//import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener{
    
//    set all variable to global to access by mysql
    
    JTextField panTextField, aadharTextField;
    JRadioButton yess, noo,yes, no;
    JButton next;
    JComboBox religions, categorys, incomes, educations, occupations;
    String formno;
    
    
      SignupTwo(String formno){
          this.formno = formno;
          
        
        setTitle("New User Form Validation - Page : 02 ");
        
        setLayout(null);
        //        For insert the image into the frame I use a function name ImageIcon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/resume.png"));
        
        Image i2 = i1.getImage().getScaledInstance(100, 110, Image.SCALE_DEFAULT);
        
        ImageIcon i3 = new ImageIcon(i2);
//        for lable the image to the desire point using Jlable
        JLabel label = new JLabel(i3);
            label.setBounds(40, 10, 100, 110 );
        add(label);
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        
        Image i5 = i4.getImage().getScaledInstance(120, 90, Image.SCALE_DEFAULT);
        
        ImageIcon i6 = new ImageIcon(i5);
//        for lable the image to the desire point using Jlable
        JLabel label1 = new JLabel(i6);
            label1.setBounds(160, 30, 600, 40);
        add(label1);
       
        JLabel personalDetails = new JLabel("Page 02 : Additional Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);

        
        
        
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 22));
        religion.setBounds(100, 140, 110, 30);
        add(religion);
        
        
        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Others"};
        religions = new JComboBox(valReligion);
        religions.setBounds(300, 140, 400, 30);
        religions.setBackground(Color.WHITE);
        add(religions);
        
        
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 22));
        category.setBounds(100, 190, 210, 30);
        add(category);
        

        
        
        String valCategorys[]={"General","OBC","SC","ST","Others"};
        categorys = new JComboBox(valCategorys);
        categorys.setBounds(300, 190, 400, 30);
        categorys.setBackground(Color.WHITE);
        add(categorys);
        
        
//      This one is for the datechooser using JDateChooser Function 
        
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 22));
        income.setBounds(100, 240, 210, 30);
        add(income);
        
        
        String valIncome[]={"Null","< 1,50,000","< 2,50,000","< 5,00,000","< 7,50,000","< 10,00,000", "Upto 15,00,000"};
        incomes = new JComboBox(valIncome);
        incomes.setBounds(300,240,400,30);
        incomes.setBackground(Color.WHITE);
        add(incomes);
 
        
        JLabel education = new JLabel("Educational");
        education.setFont(new Font("Raleway", Font.BOLD, 22));
        education.setBounds(100, 340, 210, 30);
        add(education);
        
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 22));
        qualification.setBounds(100, 360, 210, 30);
        add(qualification);
        
        String valEducations[]={"Non-Graduation","Graduate","Post Graduation","Doctrate","Others"};
        educations = new JComboBox(valEducations);
        educations.setBounds(300, 350, 400, 30);
        educations.setBackground(Color.WHITE);
        add(educations);
        
        

        
        JLabel occupation = new JLabel("Occupation");
        occupation.setFont(new Font("Raleway", Font.BOLD, 22));
        occupation.setBounds(100, 460, 210, 30);
        add(occupation);
        
        String valOccupations[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
        occupations = new JComboBox(valOccupations);
        occupations.setBounds(300, 460, 400, 30);
        occupations.setBackground(Color.WHITE);
        add(occupations);
        
//        addressTextField = new JTextField();
//        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
//        addressTextField.setBounds();
//        add(addressTextField);
        
        JLabel pan = new JLabel("Pan Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 22));
        pan.setBounds(100, 510, 210, 30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 510, 400, 30);
        add(panTextField);
        
        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 22));
        aadhar.setBounds(100, 560, 210, 30);
        add(aadhar);
        
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 560, 400, 30);
        add(aadharTextField);
        
       /***********************************************/          
        
        
        JLabel senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD, 22));
        senior.setBounds(100, 410, 210, 30);
        add(senior);
        
//        This part is for the radio buttons
        
        yes = new JRadioButton("Yes");
        yes.setBounds(300, 410, 120, 30);
        yes.setBackground(Color.WHITE);
        add(yes);
        
        no = new JRadioButton("No");
        no.setBounds(450, 410, 120, 30);
        no.setBackground(Color.WHITE);
        add(no);
        
        
        
          //   this is for group the both radio button to select either one of it .....
        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(yes);
        seniorGroup.add(no);
        
        
         /***********************************************/
    


                    
        JLabel exist = new JLabel("Existing Account:");
        exist.setFont(new Font("Raleway", Font.BOLD, 22));
        exist.setBounds(100, 290, 210, 30);
        add(exist);
        

//     This part is for the radio buttons
        yess = new JRadioButton("Yes");
        yess.setBounds(300, 290, 120, 30);
        yess.setBackground(Color.WHITE);
        add(yess);
        

        
        
        noo = new JRadioButton("No");
        noo.setBounds(450, 290,120,30);
        noo.setBackground(Color.WHITE);
        add(noo);
        
        
        
        
        //this is for group the both radio button to select either one of it .....
        ButtonGroup existGroup = new ButtonGroup();
        existGroup.add(yess);
        existGroup.add(noo);
        
        
         
         /***********************************************/
        
/*---------------------Form Text Over----------------------------------*/   
        
        next  = new JButton("Next");
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(630,620,80,30);
        next.addActionListener(this);
        add(next);

        
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 700);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
//        String because all the data values are in integer or text somehow but after pushing it into the mysql we need to convert it into String and send to mysql data base;
        
        
        String exist = null;
        if(yess.isSelected()){
            exist ="Yes";
        }
        else if(noo.isSelected()){
            exist = "No";
        }
        
        
        
        
        
        
        
        String senior = null;
        if(yes.isSelected()){
            senior = "Yes";
        }else if(no.isSelected()){
            senior = "No";
        }
    String religion = (String) religions.getSelectedItem();
    String category = (String) categorys.getSelectedItem();
    String income = (String) incomes.getSelectedItem();
    String education = (String) educations.getSelectedItem();
    String occupation = (String) occupations.getSelectedItem();
    String pan = panTextField.getText();
    String aadhar = aadharTextField.getText();
    
    
    try{
        if(pan.equals("")){
            JOptionPane.showMessageDialog(null, "Enter Your Pan Number ");
        }
        else if(aadhar.equals("")){
            JOptionPane.showMessageDialog(null, "Enter Your Aadhar Number");
        }
        else{
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"', '"+religion+"', '"+category+"', '"+income+"', '"+exist+"', '"+education+"', '"+senior+"', '"+occupation+"', '"+pan+"', '"+aadhar+"')";
            c.s.executeUpdate(query);
            
//            SignUp Three Object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        }
    }catch (Exception e){
        System.out.println(e);
    }
    
    }
    
    public static void main(String[] args){
//        Constructor of the class
        new SignupTwo(""); //constructor call
    }
    
}



