/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExpiryTracker;

import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author danie
 */
public class ExpiryDateTrackerCalculator implements ExpiryDateCommonInterface {
    // ArrayList isn't instatianted as ArrayList should be passed from parent class
    protected ArrayList<FoodProduct> foodItems;
    // ArrayList is instatiated as it is created in this class
    protected ArrayList<FoodProduct> expiringSoonFoodItems = new ArrayList();
    protected ArrayList<FoodProduct> expiringLongFoodItems = new ArrayList();
    
    // HashMap of food items in days remaining (days remaining, FoodProduct)
    protected HashMap<Integer, FoodProduct> foodItemsDaysRemaining = new HashMap();

    @Override
    public ArrayList<FoodProduct> getFoodItems() {
        return foodItems;
    }

    @Override
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
        // Loop through food items and add to hashmap
        Iterator<FoodProduct> foodItemsIt = foodItems.iterator();
        while (foodItemsIt.hasNext()) {
            FoodProduct foodItem = foodItemsIt.next();
            
            // Create DateTimeFormatter to format expiryDate as dd-mm-YYYY so it can be subtracted from today's date
            DateTimeFormatter expiryDateFormatter = DateTimeFormatter.ofPattern("dd MM yyyy");
            // Get formatted time with seconds assuming time is midnight
            LocalDateTime expiryDateFormatted = LocalDate.parse(foodItem.getExpiryDate(), expiryDateFormatter).atStartOfDay();
            
            // Get days left
            var timeLeft  = Duration.between(LocalDateTime.now(), expiryDateFormatted).toDays();
            // Conver timeLeft (long) to int and insert into HashMap
            foodItemsDaysRemaining.put(Math.toIntExact(timeLeft), foodItem);
        }
    }
}
