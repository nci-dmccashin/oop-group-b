/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expiry;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author danie
 */
public class ExpiryApp {

    /**
     * @param args the command line arguments
     */
    // Temporary: food products array list until inventory manager is implemented
    protected static ArrayList<FoodProduct> foodProducts = new ArrayList();
    public static void main(String[] args) {
        // TODO code application logic here
        // Temporary: Create 6 food items
        for (int i = 0; i <= 3; i++) {
           foodProducts.add(new FoodProduct("Apple", "fruit", 2, "11/11/2026"));
           foodProducts.add(new FoodProduct("Bread", "baked", 1, "15/11/2026"));
        }
    }
    
}
