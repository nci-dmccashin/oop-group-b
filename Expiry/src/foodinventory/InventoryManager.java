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
        products.add(product); //add product to arraylist
    }
}
    public String displayProducts(){
        String details=" ";
        for (int i=0; i<products.size(); i++ ){ //loop through products
            FoodProduct temp= products.get(i);
            details = details+temp.printDetails()+ "/n";
        }
        return details;
    }
    
    public ArrayList<FoodProduct> getProducts(){
    return products;
}
    
    public FoodProduct searchProduct(String name){ //method to search for product
        for(int i=0;i<products.size(); i++){ // loop through products list
            FoodProduct temp= products.get(i);
            
            if(temp.getName().equals(name)){
                return temp;
            }
        }
        return null;
    }
    
    public void deleteProduct(String name){
        for(int i=0; i<products.size();i++){
            FoodProduct product= products.get(i);
            
            if(product.getName().equals(name)){
                products.remove(i);
                return;
            }
        }
    }
 }