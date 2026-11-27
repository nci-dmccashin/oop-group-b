/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package expirytrack;

public class Dispose {
    protected String wasteType;
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
        
        if (wasteType == null || wasteType.isEmpty()) {
            return "Please enter a waste type.";
        }
        else if (wasteType.equalsIgnoreCase("plastic")) {
            recommend = "Place in the recycling / green bin.";
        }
        else if (wasteType.equalsIgnoreCase("paper")) {
            recommend = "Place in the recycling / green bin.";
        }
        else if (wasteType.equalsIgnoreCase("carton")) {
            recommend = "Place in the recycling / green bin.";
        }
        else if (wasteType.equalsIgnoreCase("can")) {
            recommend = "Place in the metal recycling bin.";
        }
        else if (wasteType.equalsIgnoreCase("liquid")) {
            recommend = "Ordinary liquids like milk, juice and water can go down the sink.";
        }
        else if (wasteType.equalsIgnoreCase("oil")) {
            recommend = "Collect in a sealed container and take to a recycling facility.";
        }
        else if (wasteType.equalsIgnoreCase("general")) {
            recommend = "Black bin - General waste.";
        }
        else if (wasteType.equalsIgnoreCase("general waste")) {
            recommend = "Black bin - General waste.";
        }
        else if (wasteType.equalsIgnoreCase("food")) {
        recommend = "Food waste can be composted.";
        }
        else {
            recommend = "Waste type not recognised.";
        }

        return recommend;
    }
   
    public String printDetails() {
        return "Waste Type: " + wasteType
                + "\nRecommended Disposal: " + recommend;
    }
}







