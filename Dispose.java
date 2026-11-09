/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expirytrack;

/**
 *
 * @author mtrsi
 */
public class Dispose {
    private String wasteType;
    private String recommend;

    public Dispose() {
    }

    public Dispose(String wasteType, String recommend) {
        this.wasteType = wasteType;
        this.recommend = recommend;
    }
    
    public void setWasteType(String wasteType) {
        this.wasteType = wasteType;
    }
    

    public String getRecommend() {
        return recommend;
    }

    public String printDetails(){}
    
}
