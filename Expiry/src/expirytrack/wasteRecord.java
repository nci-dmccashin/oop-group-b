/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expirytrack;

/**
 *
 * @author mtrsi
 */
public class wasteRecord {
    protected double wasteAmount;
    private String units;
    private String item;
    protected String wasteType;

    public wasteRecord() {
    }

    public wasteRecord(double wasteAmount, String units, String item, String wasteType) {
        this.wasteAmount = wasteAmount;
        this.units = units;
        this.item = item;
        this.wasteType = wasteType;
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

    public void setWasteType(String wasteType) {
        this.wasteType = wasteType;
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

    public String getWasteType() {
        return wasteType;
    }
    
    public String printDetails(){
        return "Item: " + item
        + "\nWaste Amount: " + wasteAmount
        + "\nUnits: " + units 
        + "\nwaste type: " +wasteType
                ;}       
}
