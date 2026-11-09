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
public class ExpiryDateTrackerCalculator {
    // ArrayList isn't instatianted as ArrayList should be passed from parent class
    protected ArrayList<FoodProduct> foodItems;
    // ArrayList is instatiated as it is created in this class
    protected ArrayList<FoodProduct> expiringSoonFoodItems = new ArrayList();
    protected ArrayList<FoodProduct> expiringLongFoodItems = new ArrayList();

    public ArrayList<FoodProduct> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(ArrayList<FoodProduct> foodItems) {
        this.foodItems = foodItems;
    }

    public ArrayList<FoodProduct> getExpiringSoonFoodItems() {
        return expiringSoonFoodItems;
    }

    public void setExpiringSoonFoodItems(ArrayList<FoodProduct> expiringSoonFoodItems) {
        this.expiringSoonFoodItems = expiringSoonFoodItems;
    }

    public ArrayList<FoodProduct> getExpiringLongFoodItems() {
        return expiringLongFoodItems;
    }

    public void setExpiringLongFoodItems(ArrayList<FoodProduct> expiringLongFoodItems) {
        this.expiringLongFoodItems = expiringLongFoodItems;
    }

    public ExpiryDateTrackerCalculator(ArrayList<FoodProduct> foodItems) {
        this.foodItems = foodItems;
    }
    
    public void calculateFoodExpiration() {
        
    }
}
