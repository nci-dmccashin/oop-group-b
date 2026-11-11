/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ExpiryTracker;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
// Interface usable by all common ExpiryDate classes that all take foodItems
public interface ExpiryDateCommonInterface {
    ArrayList<FoodProduct> foodItems = new ArrayList();
    
    ArrayList<FoodProduct> getFoodItems();
    void setFoodItems(ArrayList<FoodProduct> foodItems);
}
