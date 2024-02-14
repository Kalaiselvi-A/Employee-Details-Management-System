package employee.details.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JTextField tfusername;
    JPasswordField tfpassword;
    
    Login(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login1.0.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1920, 1080);
        add(image);
        
        JLabel heading = new JLabel("Login Page");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        heading.setForeground(Color.WHITE);
        image.add(heading);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(50,150,150,30);
        lblusername.setFont(new Font("serif", Font.BOLD, 20));
        lblusername.setForeground(Color.WHITE);
        image.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(200, 150, 150, 30);
        image.add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(50,200,150,30);
        lblpassword.setFont(new Font("serif", Font.BOLD, 20));
        lblpassword.setForeground(Color.WHITE);
        image.add(lblpassword);
        
        tfpassword = new JPasswordField();
        tfpassword.setBounds(200, 200, 150, 30);
        image.add(tfpassword);
        
        JButton login = new JButton("LOGIN");
        login.setBounds(160,300,150,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        image.add(login);
        
       // JButton back = new JButton("Exit");
       // back.setBounds(800, 70, 80, 20);
       // back.addActionListener(this);
       // back.setBackground(Color.red);
       // back.setForeground(Color.WHITE);
       // add(back);
       
        
        setSize(900,700);
        setLocation(300,50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            Conn c = new Conn();
            String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
            
            ResultSet rs = c.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Home();
            }else{
                JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}