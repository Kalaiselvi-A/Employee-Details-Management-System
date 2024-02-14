package employee.details.management;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class SalaryDetails extends JFrame implements ActionListener {
    
    JTextField tfin,tfmon,tfyear,tfbasic,tfhra,tfca,tfma,tfinternet,tfother,tfemployeed,tfgross,tfpf,tfesi,tflwf,tfpt,tfnet,tfemployeec,tfepf,tfeesi,tfelwf;
    JTextField tfbasicy,tfhray,tfcay,tfmay,tfinternety,tfothery,tfgrossy,tfpfy,tfesiy,tflwfy,tfpty,tfnety,tfepfy,tfeesiy,tfelwfy,tfctc,tfsalm,tfsaly;
    JButton c,back;

    SalaryDetails(){
        
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);
        
        JLabel heading = new JLabel(" DETAILS OF  SALARY");
        heading.setBounds(320,10,500,50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        heading.setForeground(Color.black);
        add(heading);
        
        tfin = new JTextField();
        tfin.setBounds(50, 75, 100, 25);
        tfin.setFont(new Font("serif", Font.BOLD, 15));
        tfin.setBackground(Color.BLACK);
        tfin.setForeground(Color.WHITE);
        add(tfin);
        
        c = new JButton("CALCULATE");
        c.setBounds(50, 125, 100, 25);
        c.addActionListener(this);
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        add(c);
        
        tfmon = new JTextField("MONTHLY");
        tfmon.setBounds(450, 75, 100, 25);
        tfmon.setFont(new Font("serif", Font.BOLD, 15));
        tfmon.setBackground(Color.BLACK);
        tfmon.setForeground(Color.WHITE);
        add(tfmon);
        
        tfyear = new JTextField("ANNUAL");
        tfyear.setBounds(600, 75, 100, 25);
        tfyear.setFont(new Font("serif", Font.BOLD, 15));
        tfyear.setBackground(Color.BLACK);
        tfyear.setForeground(Color.WHITE);
        add(tfyear);

        JLabel labelsalary = new JLabel("Basic Salary");
        labelsalary.setBounds(200,125,200,30);
        labelsalary.setFont(new Font("serif", Font.BOLD, 20));
        labelsalary.setForeground(Color.WHITE);
        add(labelsalary);
        
        tfbasic = new JTextField();
        tfbasic.setBounds(450, 125, 100, 25);
        add(tfbasic);
        
        tfbasicy = new JTextField();
        tfbasicy.setBounds(600, 125, 100, 25);
        add(tfbasicy);
        
        JLabel labelhra = new JLabel("HRA");
        labelhra.setBounds(200,150,200,30);
        labelhra.setFont(new Font("serif", Font.BOLD, 20));
        labelhra.setForeground(Color.WHITE);
        add(labelhra);
        
        tfhra = new JTextField();
        tfhra.setBounds(450, 150, 100, 25);
        add(tfhra);
        
        tfhray = new JTextField();
        tfhray.setBounds(600, 150, 100, 25);
        add(tfhray);
        
        JLabel labelca = new JLabel("Conveyence Allowance");
        labelca.setBounds(200,175,200,30);
        labelca.setFont(new Font("serif", Font.BOLD, 20));
        labelca.setForeground(Color.WHITE);
        add(labelca);
        
        tfca = new JTextField();
        tfca.setBounds(450, 175, 100, 25);
        add(tfca);
        
        tfcay = new JTextField();
        tfcay.setBounds(600, 175, 100, 25);
        add(tfcay);
        
        JLabel labelma = new JLabel("Medical Allowance");
        labelma.setBounds(200,200,200,30);
        labelma.setFont(new Font("serif", Font.BOLD, 20));
        labelma.setForeground(Color.WHITE);
        add(labelma);
        
        tfma = new JTextField();
        tfma.setBounds(450, 200, 100, 25);
        add(tfma);
        
        tfmay = new JTextField();
        tfmay.setBounds(600, 200, 100, 25);
        add(tfmay);
        
        JLabel labelinternet = new JLabel("Travel Allowance");
        labelinternet.setBounds(200,225,200,30);
        labelinternet.setFont(new Font("serif", Font.BOLD, 20));
        labelinternet.setForeground(Color.WHITE);
        add(labelinternet);
        
        tfinternet = new JTextField();
        tfinternet.setBounds(450, 225, 100, 25);
        add(tfinternet);
        
        tfinternety = new JTextField();
        tfinternety.setBounds(600, 225, 100, 25);
        add(tfinternety);
        
        JLabel labelother = new JLabel("Other Allowance");
        labelother.setBounds(200,250,200,30);
        labelother.setFont(new Font("serif", Font.BOLD, 20));
        labelother.setForeground(Color.WHITE);
        add(labelother);
        
        tfother = new JTextField();
        tfother.setBounds(450, 250, 100, 25);
        add(tfother);
        
        tfothery = new JTextField();
        tfothery.setBounds(600, 250, 100, 25);
        add(tfothery);
        
        JLabel labelgross = new JLabel("GROSS SALARY");
        labelgross.setBounds(200,275,200,30);
        labelgross.setFont(new Font("serif", Font.BOLD, 20));
        labelgross.setForeground(Color.BLUE);
        add(labelgross);
        
        tfgross = new JTextField();
        tfgross.setBounds(450, 275, 100, 25);
        tfgross.setBackground(Color.BLUE);
        tfgross.setForeground(Color.WHITE);
        add(tfgross);
        
        tfgrossy = new JTextField();
        tfgrossy.setBounds(600, 275, 100, 25);
        tfgrossy.setBackground(Color.BLUE);
        tfgrossy.setForeground(Color.WHITE);
        add(tfgrossy);
        
        tfemployeed = new JTextField("EMPLOYEE DEDUCTION");
        tfemployeed.setBounds(200, 325, 500, 25);
        tfemployeed.setFont(new Font("serif", Font.BOLD, 20));
        tfemployeed.setBackground(Color.BLACK);
        tfemployeed.setForeground(Color.WHITE);
        add(tfemployeed);
        
        JLabel labelph = new JLabel("PF(Employee)");
        labelph.setBounds(200,350,200,30);
        labelph.setFont(new Font("serif", Font.BOLD, 20));
        labelph.setForeground(Color.WHITE);
        add(labelph);
        
        tfpf = new JTextField();
        tfpf.setBounds(450, 350, 100, 25);
        add(tfpf);
        
        tfpfy = new JTextField();
        tfpfy.setBounds(600, 350, 100, 25);
        add(tfpfy);
        
        JLabel labelesi = new JLabel("ESI(Employee)");
        labelesi.setBounds(200,375,200,30);
        labelesi.setFont(new Font("serif", Font.BOLD, 20));
        labelesi.setForeground(Color.WHITE);
        add(labelesi);
        
        tfesi = new JTextField();
        tfesi.setBounds(450, 375, 100, 25);
        add(tfesi);
        
        tfesiy = new JTextField();
        tfesiy.setBounds(600, 375, 100, 25);
        add(tfesiy);
        
        JLabel labellwf = new JLabel("LWF(Employee)");
        labellwf.setBounds(200,400,200,30);
        labellwf.setFont(new Font("serif", Font.BOLD, 20));
        labellwf.setForeground(Color.WHITE);
        add(labellwf);
        
        tflwf = new JTextField();
        tflwf.setBounds(450, 400, 100, 25);
        add(tflwf);
        
        tflwfy = new JTextField();
        tflwfy.setBounds(600, 400, 100, 25);
        add(tflwfy);
        
        JLabel labelpt = new JLabel("Providence Tax (Employee)");
        labelpt.setBounds(200,425,200,30);
        labelpt.setFont(new Font("serif", Font.BOLD, 20));
        labelpt.setForeground(Color.WHITE);
        add(labelpt);
        
        tfpt = new JTextField();
        tfpt.setBounds(450, 425, 100, 25);
        add(tfpt);
        
        tfpty = new JTextField();
        tfpty.setBounds(600, 425, 100, 25);
        add(tfpty);
        
        JLabel labelnet = new JLabel("NET SALARY");
        labelnet.setBounds(200,450,200,30);
        labelnet.setFont(new Font("serif", Font.BOLD, 20));
        labelnet.setForeground(Color.BLUE);
        add(labelnet);
        
        tfnet = new JTextField();
        tfnet.setBounds(450, 450, 100, 25);
        tfnet.setBackground(Color.BLUE);
        tfnet.setForeground(Color.WHITE);
        add(tfnet);
        
        tfnety = new JTextField();
        tfnety.setBounds(600, 450, 100, 25);
        tfnety.setBackground(Color.BLUE);
        tfnety.setForeground(Color.WHITE);
        add(tfnety);
        
        tfemployeec = new JTextField("EMPLOYER CONTRIBUTION");
        tfemployeec.setBounds(200, 500, 500, 25);
        tfemployeec.setFont(new Font("serif", Font.BOLD, 20));
        tfemployeec.setBackground(Color.BLACK);
        tfemployeec.setForeground(Color.WHITE);
        add(tfemployeec);
        
        JLabel labeleph = new JLabel("PF(Employer)");
        labeleph.setBounds(200,525,200,30);
        labeleph.setFont(new Font("serif", Font.BOLD, 20));
        labeleph.setForeground(Color.WHITE);
        add(labeleph);
        
        tfepf = new JTextField();
        tfepf.setBounds(450, 525, 100, 25);
        add(tfepf);
        
        tfepfy = new JTextField();
        tfepfy.setBounds(600, 525, 100, 25);
        add(tfepfy);
        
        JLabel labeleesi = new JLabel("ESI(Employer)");
        labeleesi.setBounds(200,550,200,30);
        labeleesi.setFont(new Font("serif", Font.BOLD, 20));
        labeleesi.setForeground(Color.WHITE);
        add(labeleesi);
        
        tfeesi = new JTextField();
        tfeesi.setBounds(450, 550, 100, 25);
        add(tfeesi);
        
        tfeesiy = new JTextField();
        tfeesiy.setBounds(600, 550, 100, 25);
        add(tfeesiy);
        
        JLabel labelelwf = new JLabel("LWF(Employer)");
        labelelwf.setBounds(200,575,200,30);
        labelelwf.setFont(new Font("serif", Font.BOLD, 20));
        labelelwf.setForeground(Color.WHITE);
        add(labelelwf);
        
        tfelwf = new JTextField();
        tfelwf.setBounds(450, 575, 100, 25);
        add(tfelwf);
        
        tfelwfy = new JTextField();
        tfelwfy.setBounds(600, 575, 100, 25);
        add(tfelwfy);
        
        tfctc = new JTextField("SALARY");
        tfctc.setBounds(200, 625, 200, 25);
        tfctc.setFont(new Font("serif", Font.BOLD, 20));
        tfctc.setBackground(Color.GREEN);
        tfctc.setForeground(Color.WHITE);
        add(tfctc);
        
        tfsalm = new JTextField();
        tfsalm.setBounds(450, 625, 100, 25);
        tfsalm.setFont(new Font("serif", Font.BOLD, 15));
        tfsalm.setBackground(Color.BLACK);
        tfsalm.setForeground(Color.WHITE);
        add(tfsalm);
        
        tfsaly = new JTextField();
        tfsaly.setBounds(600, 625, 100, 25);
        tfsaly.setFont(new Font("serif", Font.BOLD, 15));
        tfsaly.setBackground(Color.BLACK);
        tfsaly.setForeground(Color.WHITE);
        add(tfsaly);
        
        back = new JButton("Exit");
        back.setBounds(700, 700, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.red);
        back.setForeground(Color.WHITE);
        add(back);
        
        setSize(900,800);
        setLocation(300,50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == c){
            String input = tfin.getText();
            
            try{
                if(input.isEmpty() || !(input.matches("^[0-9]+$"))){
                    JOptionPane.showMessageDialog(null, "Enter valid number", "Error", JOptionPane.ERROR_MESSAGE);
                }else{
                    double ctc = Integer.parseInt(tfin.getText());
                    double fbasic = (0.4*ctc);
                    int ibasic = (int)fbasic;
                    tfbasic.setText(String.valueOf(ibasic));
                    int abasic = (ibasic*12);
                    tfbasicy.setText(String.valueOf(abasic));
                    double fhra = (0.4*fbasic);
                    int ihra = (int)fhra;
                    tfhra.setText(String.valueOf(ihra));
                    int ahra = ihra*12;
                    tfhray.setText(String.valueOf(ahra));
                    int fca = 1600;
                    tfca.setText(String.valueOf(fca));
                    int aca = fca *12;
                    tfcay.setText(String.valueOf(aca));
                    int fma = 1250;
                    tfma.setText(String.valueOf(fma));
                    int ama = fma*12;
                    tfmay.setText(String.valueOf(ama));
                    int finternet = 3000;
                    tfinternet.setText(String.valueOf(finternet));
                    int ainternet = finternet*12;
                    tfinternety.setText(String.valueOf(ainternet));
                    int fother = 6177;
                    tfother.setText(String.valueOf(fother));
                    int aother = fother*12;
                    tfothery.setText(String.valueOf(aother));
                    double fgross = fbasic+fhra+fca+fma+finternet+fother;
                    int igross = (int)fgross;
                    tfgross.setText(String.valueOf(igross));
                    int agross = igross*12;
                    tfgrossy.setText(String.valueOf(agross));
                    double fpf = (fbasic*0.12);
                    int ipf = (int)fpf;
                    tfpf.setText(String.valueOf(ipf));
                    int apf = ipf*12;
                    tfpfy.setText(String.valueOf(apf));
                    double fesi = fgross*(1.75/100); //1.75/100 = 0.0175  175 / 10000 = 0.0175
                    int iesi = (int)fesi;
                    tfesi.setText(String.valueOf(iesi));
                    int aesi = iesi*12;
                    tfesiy.setText(String.valueOf(aesi));
                    int flwf = 10;
                    tflwf.setText(String.valueOf(flwf));
                    int alwf = flwf*12;
                    tflwfy.setText(String.valueOf(alwf));
                    int fpt = 200;
                    tfpt.setText(String.valueOf(fpt));
                    double apt = fpt*12;
                    tfpty.setText(String.valueOf(apt));
                    double fnet = fgross - (fpf+fesi+flwf+fpt);
                    int inet = (int)fnet;
                    tfnet.setText(String.valueOf(inet));
                    int anet = inet*12;
                    tfnety.setText(String.valueOf(anet));
                    double fepf = (fbasic * (13.15 / 100));
                    int iepf = (int)fepf;
                    tfepf.setText(String.valueOf(iepf));
                    int aepf = iepf*12;
                    tfepfy.setText(String.valueOf(aepf));
                    double feesi = (fgross*(4.75 / 100));
                    int ieesi = (int)feesi;
                    tfeesi.setText(String.valueOf(ieesi));
                    int aeesi = ieesi*12;
                    tfeesiy.setText(String.valueOf(aeesi));
                    int felwf = 30;
                    tfelwf.setText(String.valueOf(felwf));
                    int aelwf = felwf*12;
                    tfelwfy.setText(String.valueOf(aelwf));
                    double salary = fgross+fepf+feesi+felwf;
                    int isalary = (int)salary;
                    tfsalm.setText(String.valueOf(isalary));
                    int asalary = isalary*12;
                    tfsaly.setText(String.valueOf(asalary));
                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
            new Home();
            
        }
        // tftsalary.setText(String.valueOf(tsalary));
        
    }
    
    public static void main(String args[]){
        new SalaryDetails();
    }
}
