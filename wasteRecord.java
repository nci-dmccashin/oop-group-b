/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expirytrack;

/**
 *
 * @author mtrsi
 */
public class WasteRecord {
    private double wasteAmount;
    private String units;
    private String item;

    public WasteRecord() {
    }

    public WasteRecord(double wasteAmount, String units, String item) {
        this.wasteAmount = wasteAmount;
        this.units = units;
        this.item = item;
    }

    public void setWasteAmount(double wasteAmount) {
        this.wasteAmount = wasteAmount;
    }
    
    public void setUnits(String units) {
        this.units = units;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getWasteAmount() {
        return wasteAmount;
    }

    public String getUnits() {
        return units;
    }

    public String getItem() {
        return item;
    }  

    public String printDetails(){}       
}
