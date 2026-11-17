/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExpiryTracker;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public abstract class ExpiryTrackerCommonGUI extends javax.swing.JFrame {
    protected ArrayList<FoodProduct> foodItems;
    
    
    public ExpiryTrackerCommonGUI(ArrayList<FoodProduct> foodItems) {
        this.foodItems = foodItems;
    }

    public ArrayList<FoodProduct> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(ArrayList<FoodProduct> foodItems) {
        this.foodItems = foodItems;
    }
    
    // Create blank refresh method for all GUIs
    public void refresh() {
    }
}
