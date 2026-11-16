/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodinventory;

/**
 *
 * @author Khrystyna Kokhanovska
 */

import java.util.ArrayList;

public class InventoryManager {
    private ArrayList<FoodProduct>products; //arra to store products

    public InventoryManager() { //default constructor
    }

    public InventoryManager(ArrayList<FoodProduct> products) { //concstructor with array list
        this.products = products;
    }
    
    public void addProduct(FoodProduct product){
        products.add(product);
    }
}
