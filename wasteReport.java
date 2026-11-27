/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expirytrack;

/**
 *
 * @author mtrsi
 */
public class wasteReport extends wasteRecord {
    private double totalWaste;
    private String wasteDate;

    public wasteReport() {
    }

    public wasteReport(double wasteAmount, String units, String item,
            String wasteType, double totalWaste, String wasteDate) {
        super(wasteAmount, units, item, wasteType);
        this.totalWaste = totalWaste;
        this.wasteDate = wasteDate;
    }

    public void setTotalWaste(double totalWaste) {
        this.totalWaste = totalWaste;
    }

    public void setWasteDate(String wasteDate) {
        this.wasteDate = wasteDate;
    }

    public double getTotalWaste() {
        return totalWaste;
    }

    public String getWasteDate() {
        return wasteDate;
    }
     public String printDetails(){
         return "Waste report" 
                 + "\nTotal waste: " +totalWaste + " kg"
                 + "\nReport date: "+wasteDate
                 +"\nWaste type: " + wasteType;
     }  
    
}
