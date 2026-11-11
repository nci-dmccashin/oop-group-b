/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodinventory;

/**
 *
 * @author kri
 */
public class FoodProduct {
    private String name, category, expiryDate;
    private int quantity;

    public FoodProduct() { // default constructor
    }

    public FoodProduct(String name, String category, String expiryDate, int quantity) {
        this.name = name;
        this.category = category;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    
    public String printDetails(){
        return name+" "+category+" "+quantity+" "+expiryDate;
    }
    
    
    
}
