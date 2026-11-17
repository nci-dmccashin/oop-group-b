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
public class ExpiryDateTrackerManager {
    protected ArrayList<FoodProduct> foodItems;
    protected ExpiryDateTrackerCalculator expiryDateTrackerCalculator;
    protected ExpiryDateTrackerGUI expiryGUI;

    public ExpiryDateTrackerManager(ArrayList<FoodProduct> foodItems) {
        this.foodItems = foodItems;
        this.expiryDateTrackerCalculator = new ExpiryDateTrackerCalculator(foodItems);
        expiryDateTrackerCalculator.calculateFoodExpiration();
        this.expiryGUI = new ExpiryDateTrackerGUI(foodItems);
        expiryGUI.setVisible(true);
    }
    
}
