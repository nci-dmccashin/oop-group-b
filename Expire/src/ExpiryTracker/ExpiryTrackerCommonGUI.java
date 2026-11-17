/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExpiryTracker;

import java.util.ArrayList;
import javax.swing.SwingUtilities;

/**
 *
 * @author danie
 */
public abstract class ExpiryTrackerCommonGUI extends javax.swing.JFrame {
    protected ArrayList<FoodProduct> foodItems;
    
    
    public ExpiryTrackerCommonGUI(ArrayList<FoodProduct> foodItems) {
        this.foodItems = foodItems;
    }
    
    // Create refresh method for all GUIs
    public void refresh() {
        // Use updateComponentTreeUI to refresh all elements
        SwingUtilities.updateComponentTreeUI(this);
    }
}
