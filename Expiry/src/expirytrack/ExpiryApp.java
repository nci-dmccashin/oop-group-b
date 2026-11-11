/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expirytrack;

/**
 *
 * @author mtrsi
 */
public class ExpiryApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        wasteRecord wr = new wasteRecord();
        Dispose dsp = new Dispose();
        wasteReport wrp = new wasteReport();
        
        wasteGUI WG = new wasteGUI();
        WG.setVisible(true);
    }
    
}
