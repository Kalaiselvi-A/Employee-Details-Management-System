package employee.details.management;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener {
    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    JTextField tfname,tffname,tfaddress,tfsalary,tfphone,tfaadhar,tfemail,tfdesignation;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblempId;
    JButton add,back,sdetails;
    
    AddEmployee(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login1.1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1920, 1080);
        add(image);
        
        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        heading.setForeground(Color.WHITE);
        image.add(heading);
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50,150,150,30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        labelname.setForeground(Color.WHITE);
        image.add(labelname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        image.add(tfname);
        
        JLabel labelfname = new JLabel("Father's Name");
        labelfname.setBounds(400,150,150,30);
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        labelfname.setForeground(Color.WHITE);
        image.add(labelfname);
        
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        image.add(tffname);
        
        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(50,200,150,30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        labeldob.setForeground(Color.WHITE);
        image.add(labeldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 150, 30);
        image.add(dcdob);
        
        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(400,200,150,30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        labelsalary.setForeground(Color.WHITE);
        image.add(labelsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        image.add(tfsalary);
        
        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(50,250,150,30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        labeladdress.setForeground(Color.WHITE);
        image.add(labeladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        image.add(tfaddress);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(400,250,150,30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        labelphone.setForeground(Color.WHITE);
        image.add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        image.add(tfphone);
        
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50,300,150,30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        labelemail.setForeground(Color.WHITE);
        image.add(labelemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        image.add(tfemail);
        
        JLabel labeleducation = new JLabel("Highest Education");
        labeleducation.setBounds(400,300,150,30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        labeleducation.setForeground(Color.WHITE);
        image.add(labeleducation);
        
        String courses[] = {"BBA","BCA","BA","B.SC","B.COM","B.TECH","MBA","MCA","MA","M.TECH","M.SC","PHD"};
        cbeducation = new JComboBox(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600, 300, 150, 30);
        image.add(cbeducation);
        
        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(50,350,150,30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        labeldesignation.setForeground(Color.WHITE);
        image.add(labeldesignation);
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 150, 30);
        image.add(tfdesignation);
        
        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(400,350,150,30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        labelaadhar.setForeground(Color.WHITE);
        image.add(labelaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        image.add(tfaadhar);
        
        JLabel labelemplId = new JLabel("Employee Id");
        labelemplId.setBounds(50,400,150,30);
        labelemplId.setFont(new Font("serif", Font.PLAIN, 20));
        labelemplId.setForeground(Color.WHITE);
        image.add(labelemplId);
        
        lblempId = new JLabel("" + number);
        lblempId.setBounds(200,400,150,30);
        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
        lblempId.setForeground(Color.WHITE);
        image.add(lblempId);
        
        add = new JButton("Add Details");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        image.add(add);
        
        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        image.add(back);
        
     //   sdetails = new JButton("-->");
      //  sdetails.setBounds(775,200,50,30);
    //    sdetails.addActionListener(this);
   //     sdetails.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
    //    sdetails.setBackground(Color.BLACK);
    //    sdetails.setForeground(Color.WHITE);
     //   image.add(sdetails);
        
        
        setSize(900,700);
        setLocation(300,50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String empId = lblempId.getText();
            
            
            
            try{
                if(name.isEmpty() || !(name.matches("^[a-zA-Z]+$"))){
                    JOptionPane.showMessageDialog(null, "Enter valid name","Error", JOptionPane.ERROR_MESSAGE);
                }else if(fname.isEmpty() || !(fname.matches("^[a-zA-Z]+$"))){
                    JOptionPane.showMessageDialog(null, "Enter valid Father's name", "Error",JOptionPane.ERROR_MESSAGE);
                }else if(dob.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Enter the Date of Birth", "Error",JOptionPane.ERROR_MESSAGE);
                }else if(salary.isEmpty() || !(salary.matches("^[0-9]+$"))){
                    JOptionPane.showMessageDialog(null, "Enter valid salary", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(address.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Enter valid address", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(phone.isEmpty() || phone.length() != 10 || !(phone.matches("^[0-9]+$"))){
                    JOptionPane.showMessageDialog(null, "Enter valid phone no." ,"Error", JOptionPane.ERROR_MESSAGE);
                //}else if(phone.length() != 10){
                 //   if(phone.matches("'[0-9]':"))
                 //       tfphone.setEditable(true);
                 //   else
                 //       JOptionPane.showMessageDialog(null, "Enter valid phone no.");
                }else if(email.isEmpty() || !(email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))){
                    JOptionPane.showMessageDialog(null, "Enter valid email id", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(education.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Add valid education details", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(designation.isEmpty() || !(designation.matches("^[a-zA-Z]+$"))){
                    JOptionPane.showMessageDialog(null, "Enter your designation", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(aadhar.isEmpty() || !(aadhar.matches("^[0-9]+$")) || aadhar.length() != 12){
                    JOptionPane.showMessageDialog(null, "Enter valid aadhar no.", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(empId.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Enter valid Employee ID", "Error", JOptionPane.ERROR_MESSAGE);
                }else{
                Conn conn = new Conn();
                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+empId+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added sucessfully");
                setVisible(false);
                new Home();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
                
        }else if(ae.getSource() == sdetails){
            setVisible(false);
            new SalaryDetails();
        }else{
            setVisible(false);
            new Home();
        }
        
    }
    
    
    public static void main(String args[]){
        new AddEmployee();
    }
}
