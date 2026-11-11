/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExpiryTracker;
/**
 *
 * @author danie
 */
// Temporary Class
public class FoodProduct {
    private String name;
    private String category;
    private int quantity;
    private String expiryDate;

    public FoodProduct() {
    }

    public FoodProduct(String name, String category, int quantity, String expiryDate) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String printDetails() {
        return "FoodProduct{" + "name=" + name + ", category=" + category + ", quantity=" + quantity + ", expiryDate=" + expiryDate + '}';
    }
}
