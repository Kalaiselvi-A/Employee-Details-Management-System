package employee.details.management;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SalaryCalculation extends JFrame implements ActionListener {
    
    JTextField tfbasic,tfhra,tfta,tffba,tfbonus,tfpf,tftax,tfinsurance,tftsalary;
    JButton calculate,back;
        
    SalaryCalculation(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login1.1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1920, 1080);
        add(image);
        
        JLabel heading = new JLabel(" DETAILS OF  SALARY");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        heading.setForeground(Color.WHITE);
        image.add(heading);
        
        JLabel labelbasic = new JLabel("Basic");
        labelbasic.setBounds(100,100,200,30);
        labelbasic.setFont(new Font("serif", Font.PLAIN, 20));
        labelbasic.setForeground(Color.WHITE);
        image.add(labelbasic);
        
        tfbasic = new JTextField();
        tfbasic.setBounds(450, 100, 200, 30);
        image.add(tfbasic);
        
        JLabel labelhra = new JLabel("HRA");
        labelhra.setBounds(100,150,200,30);
        labelhra.setFont(new Font("serif", Font.PLAIN, 20));
        labelhra.setForeground(Color.WHITE);
        image.add(labelhra);
        
        tfhra = new JTextField();
        tfhra.setBounds(450, 150, 200, 30);
        image.add(tfhra);
        
        JLabel labelta = new JLabel("Transport Allowance");
        labelta.setBounds(100,200,200,30);
        labelta.setFont(new Font("serif", Font.PLAIN, 20));
        labelta.setForeground(Color.WHITE);
        image.add(labelta);
        
        tfta = new JTextField();
        tfta.setBounds(450, 200, 200, 30);
        image.add(tfta);
        
        JLabel labelfba = new JLabel("FBP Allowance");
        labelfba.setBounds(100,250,200,30);
        labelfba.setFont(new Font("serif", Font.PLAIN, 20));
        labelfba.setForeground(Color.WHITE);
        image.add(labelfba);
        
        tffba = new JTextField();
        tffba.setBounds(450, 250, 200, 30);
        image.add(tffba);
        
        JLabel labelbonus = new JLabel("Bonus");
        labelbonus.setBounds(100,300,200,30);
        labelbonus.setFont(new Font("serif", Font.PLAIN, 20));
        labelbonus.setForeground(Color.WHITE);
        image.add(labelbonus);
        
        tfbonus = new JTextField();
        tfbonus.setBounds(450, 300, 200, 30);
        image.add(tfbonus);
        
        JLabel labelpf = new JLabel("Provident Fund");
        labelpf.setBounds(100,350,200,30);
        labelpf.setFont(new Font("serif", Font.PLAIN, 20));
        labelpf.setForeground(Color.WHITE);
        image.add(labelpf);
        
        tfpf = new JTextField();
        tfpf.setBounds(450, 350, 200, 30);
        image.add(tfpf);
        
        JLabel labeltax = new JLabel("Income Tax");
        labeltax.setBounds(100,400,200,30);
        labeltax.setFont(new Font("serif", Font.PLAIN, 20));
        labeltax.setForeground(Color.WHITE);
        image.add(labeltax);
        
        tftax = new JTextField();
        tftax.setBounds(450, 400, 200, 30);
        image.add(tftax);
        
        JLabel labelinsurance = new JLabel("Insurance");
        labelinsurance.setBounds(100,450,200,30);
        labelinsurance.setFont(new Font("serif", Font.PLAIN, 20));
        labelinsurance.setForeground(Color.WHITE);
        image.add(labelinsurance);
        
        tfinsurance = new JTextField();
        tfinsurance.setBounds(450, 450, 200, 30);
        image.add(tfinsurance);
        
        calculate = new JButton("CALCULATE SALARY");
        calculate.setBounds(100, 550, 200, 40);
        calculate.addActionListener(this);
        calculate.setBackground(Color.BLACK);
        calculate.setForeground(Color.WHITE);
        image.add(calculate);
        
        tftsalary = new JTextField();
        tftsalary.setBounds(450, 550, 200, 40);
        tftsalary.setBackground(Color.BLUE);
        tftsalary.setForeground(Color.WHITE);
        image.add(tftsalary);
        
        back = new JButton("Exit");
        back.setBounds(700, 600, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.red);
        back.setForeground(Color.WHITE);
        image.add(back);

        
        
        //double salary(){
        //    return tfbasic + tfhra + tfta + tffba + tfbonus - tfpf - tftax - tfinsurance;  
        //}

        
        setSize(900,700);
        setLocation(300,50);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
                        
           // tftsalary.setText(String.valueOf(tsalary));
           
        if(ae.getSource() == calculate){
            String basic = tfbasic.getText();
            String hra = tfhra.getText();
            String ta = tfta.getText();
            String fba = tffba.getText();
            String bonus = tfbonus.getText();
            String tax = tftax.getText();
            String pf = tfpf.getText();
            String insurance = tfinsurance.getText();
            //String tsalary = tf.getText();
            
            try{
                if(basic.isEmpty() || !(basic.matches("^[0-9]+$"))){
                    JOptionPane.showMessageDialog(null, "Enter valid number", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(hra.isEmpty() || !(hra.matches("^[0-9]+$"))){
                    JOptionPane.showMessageDialog(null, "Enter valid number", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(ta.isEmpty() || !(ta.matches("^[0-9]+$"))){
                    JOptionPane.showMessageDialog(null, "Enter valid number", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(fba.isEmpty() || !(fba.matches("^[0-9]+$"))){
                    JOptionPane.showMessageDialog(null, "Enter valid number", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(bonus.isEmpty() || !(bonus.matches("^[0-9]+$"))){
                    JOptionPane.showMessageDialog(null, "Enter valid number", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(tax.isEmpty() || !(tax.matches("^[0-9]+$"))){
                    JOptionPane.showMessageDialog(null, "Enter valid number", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(pf.isEmpty() || !(pf.matches("^[0-9]+$"))){
                    JOptionPane.showMessageDialog(null, "Enter valid number", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(insurance.isEmpty() || !(insurance.matches("^[0-9]+$"))){
                    JOptionPane.showMessageDialog(null, "Enter valid number", "Error", JOptionPane.ERROR_MESSAGE);
                }else{
                    int ibasic = Integer.parseInt(tfbasic.getText());
                    int ihra = Integer.parseInt(tfhra.getText());
                    int ita = Integer.parseInt(tfta.getText());
                    int ifba = Integer.parseInt(tffba.getText());
                    int ibonus = Integer.parseInt(tfbonus.getText());
                    int itax = Integer.parseInt(tftax.getText());
                    int ipf = Integer.parseInt(tfpf.getText());
                    int iinsurance = Integer.parseInt(tfinsurance.getText());
                    int itsalary = ibasic + ihra + ita + ifba + ibonus - ipf - itax - iinsurance;

                    //int tsalary = basic + hra + ta + fba + bonus - pf - tax - insurance;
                    tftsalary.setText(String.valueOf(itsalary));
                }
            }catch(Exception e){
                e.printStackTrace();
            }

        }else{
            setVisible(false);
            new Home();
        }

    }
    
    public static void main(String args[]){
        new SalaryCalculation();
    }
}
