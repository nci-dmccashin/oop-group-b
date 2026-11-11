/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainApp;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import expiry.ExpiryApp;
import expiry.ExpiryDateTrackerGUI;
import expiry.FoodProduct;
import foodinventory.InventoryGUI;
import expirytrack.wasteGUI;


public class MainApp extends JFrame {
    private JPanel pan;
    private JLabel titleLbl;
    private JButton inventoryBtn;
    private JButton expiryBtn;
    private JButton wasteBtn;

    // Shared food list for the expiry tracker
    private ArrayList<FoodProduct> foodItems = new ArrayList<>();

    public MainApp() {

        setTitle("Food Management System");
        setSize(450, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pan = new JPanel();
        pan.setLayout(null);
        pan.setBackground(Color.orange);

        titleLbl = new JLabel("Food Management System");
        titleLbl.setFont(new Font("Arial", Font.BOLD, 22));
        titleLbl.setBounds(90, 25, 300, 35);

        inventoryBtn = new JButton("Food Inventory");
        expiryBtn = new JButton("Expiry Date Tracker");
        wasteBtn = new JButton("Waste Management");

        inventoryBtn.setBounds(110, 90, 220, 40);
        expiryBtn.setBounds(110, 150, 220, 40);
        wasteBtn.setBounds(110, 210, 220, 40);

        // Open Food Inventory
        inventoryBtn.addActionListener(e -> {
            InventoryGUI inventory = new InventoryGUI();
            inventory.setVisible(true);
        });

        // Open Expiry Date Tracker
        expiryBtn.addActionListener(e -> {
            ExpiryDateTrackerGUI expiry = new ExpiryDateTrackerGUI(foodItems);
            expiry.setVisible(true);
        });

        // Open Waste Management
        wasteBtn.addActionListener(e -> {
            wasteGUI waste = new wasteGUI();
            waste.setVisible(true);
        });

        pan.add(titleLbl);
        pan.add(inventoryBtn);
        pan.add(expiryBtn);
        pan.add(wasteBtn);

        add(pan);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            MainApp app = new MainApp();
            app.setVisible(true);
        });
    }
}
    
