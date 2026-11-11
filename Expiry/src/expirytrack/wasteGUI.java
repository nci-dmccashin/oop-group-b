/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expirytrack;

/**
 *
 * @author mtrsi
 */
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class wasteGUI extends JFrame{
    //declare obj
    private JPanel p;
    private JLabel titleLbl;
    private JLabel amountLbl;
    private JLabel unitsLbl;
    private JLabel itemLbl;
    private JLabel wasteTypeLbl;

    private JTextField amountTf;
    private JTextField unitsTf;
    private JTextField itemTf;
    private JTextField wasteTypeTf;

    private JButton nextBtn;
    private JButton disposalBtn;
    private JButton reportBtn;
    
    //declare array list
    private ArrayList<wasteRecord> wasteList = new ArrayList<>();

    public wasteGUI() {
        //set size and location of JFrame
        setSize(700, 400);
        setLocation(20,20);
        
        //create the panel
        p = new JPanel();
        //set panel layout
        p.setLayout(null);
        //set background color of panel
        p.setBackground(Color.orange);
        //add panel to JFrame
        add(p);
        
        //create objects
        titleLbl = new JLabel("Waste Record");
        amountLbl= new JLabel("Enter amount wasted for a product");
        unitsLbl = new JLabel("Enter units: L for litres, kg for kilos, g for grams");
        itemLbl = new JLabel("Enter product wasted");
        wasteTypeLbl = new JLabel("<html>Enter waste type (liquid, plastic,<br> cartoon, paper, can, food, general, oil)</html>");
        
        amountTf = new JTextField();
        unitsTf = new JTextField();
        itemTf = new JTextField();
        wasteTypeTf = new JTextField();
        
        nextBtn = new JButton("save/next record");
        disposalBtn = new JButton("Show Disposal Method");
        reportBtn = new JButton("Go to end");
        
        //set bounds of object (x,y,width,height)
        titleLbl.setBounds(350, 10, 200, 30);
        titleLbl.setFont(new Font("Arial", Font.BOLD, 18));
        amountLbl.setBounds(20, 70, 300, 30);
        unitsLbl.setBounds(20, 130, 300, 30);
        itemLbl.setBounds(20, 190, 300, 30);
        wasteTypeLbl.setBounds(20, 230, 300, 50);
        
        amountTf.setBounds(320, 70, 200, 30);
        unitsTf.setBounds(320, 130, 200, 30);
        itemTf.setBounds(320, 190, 200, 30);
        wasteTypeTf.setBounds(320, 240, 200, 30);
        
        nextBtn.setBounds(100, 310, 150, 35);
        disposalBtn.setBounds(270, 310, 200, 35);
        reportBtn.setBounds(490, 310, 120, 35);
        
        p.add(titleLbl);
        p.add(amountLbl);
        p.add(unitsLbl);
        p.add(itemLbl);
        p.add(wasteTypeLbl);
        p.add(amountTf);
        p.add(unitsTf);
        p.add(itemTf);
        p.add(wasteTypeTf);
        p.add(nextBtn);
        p.add(disposalBtn);
        p.add(reportBtn);
        
        nextBtn.addActionListener(e -> saveRecord());
        disposalBtn.addActionListener(e -> showDisposal());
        reportBtn.addActionListener(e -> calculateTotal());
        
    }
    public void saveRecord() {
    String amount = amountTf.getText();
    String units = unitsTf.getText();
    String item = itemTf.getText();
    String wasteType = wasteTypeTf.getText();

    if (amount.isEmpty() || units.isEmpty() || item.isEmpty() || wasteType.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please complete all fields.");
    } 
    else if (Character.isDigit(amount.charAt(0)) == false) {
        JOptionPane.showMessageDialog(this, "Please enter numbers only.");
    } 
    else {
        double wasteAmount = Double.parseDouble(amount);

        if (wasteAmount <= 0) {
            JOptionPane.showMessageDialog(this, "Amount must be greater than zero.");
        } 
        else {
            wasteRecord wr = new wasteRecord(wasteAmount, units, item, wasteType);
            wasteList.add(wr);

            JOptionPane.showMessageDialog(this, "Record saved!");

            amountTf.setText("");
            unitsTf.setText("");
            itemTf.setText("");
            wasteTypeTf.setText("");
            }
        }
    }
    public void showDisposal() {
    String wasteType = wasteTypeTf.getText();
    Dispose d = new Dispose();
    d.setWasteType(wasteType);

    JOptionPane.showMessageDialog(this, d.getRecommend());
    }
   public void calculateTotal() {
    double totalWaste = 0;

        for (int i = 0; i < wasteList.size(); i++) {
            totalWaste = totalWaste + wasteList.get(i).getWasteAmount();
        }

    LocalDateTime date = LocalDateTime.now();
        double wasteAmount = 0;
        String units = "";
        String item = "";
        String wasteType = "";

    wasteReport report = new wasteReport(
        wasteAmount, units, item, wasteType,
        totalWaste, date.toString());
   

    JOptionPane.showMessageDialog(this, report.printDetails());
    }
}
 
    

