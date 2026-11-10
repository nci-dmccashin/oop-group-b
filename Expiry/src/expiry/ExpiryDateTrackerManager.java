/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expiry;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class ExpiryDateTrackerManager implements ExpiryDateCommonInterface {
    protected ArrayList<FoodProduct> foodItems;
    protected ExpiryDateTrackerCalculator expiryDateTrackerCalculator;
    protected ExpiryDateTrackerGUI expiryGUI;

    public ArrayList<FoodProduct> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(ArrayList<FoodProduct> foodItems) {
        this.foodItems = foodItems;
    }

    public ExpiryDateTrackerManager(ArrayList<FoodProduct> foodItems) {
        this.foodItems = foodItems;
        this.expiryDateTrackerCalculator = new ExpiryDateTrackerCalculator(foodItems);
        expiryDateTrackerCalculator.calculateFoodExpiration();
        this.expiryGUI = new ExpiryDateTrackerGUI();
        expiryGUI.setFoodItems(foodItems);
        expiryGUI.setVisible(true);
    }
    
}
