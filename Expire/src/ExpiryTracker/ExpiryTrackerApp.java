/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExpiryTracker;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author danie
 */
public class ExpiryTrackerApp {

    /**
     * @param args the command line arguments
     */
    // Temporary: food products array list until inventory manager is implemented
    protected ArrayList<FoodProduct> foodProducts = new ArrayList();
    protected ExpiryDateTrackerManager edtm;
    public ExpiryTrackerApp() {
        // TODO code application logic here
        // Temporary: Create 6 food items
        for (int i = 0; i <= 3; i++) {
           foodProducts.add(new FoodProduct("Apple", "fruit", 2, "11 11 2026"));
           foodProducts.add(new FoodProduct("Bread", "baked", 1, "15 11 2026"));
        }
        
        this.edtm = new ExpiryDateTrackerManager(foodProducts);
    }
    
    // Pass along setVisible method to correct GUI
    public void setVisible(boolean isVisible) {
        edtm.expiryGUI.setVisible(isVisible);
    }
}
