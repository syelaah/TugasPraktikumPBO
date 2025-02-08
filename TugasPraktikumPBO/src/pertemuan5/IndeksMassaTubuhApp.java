/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author sye
 */
public class IndeksMassaTubuhApp {
    public static void main(String[] args) {
        //  object
        var imt = new IndeksMassaTubuh();
        
        // output
        System.out.println("\nBerat Badan Anda\t: " + imt.getBb());
        System.out.println("Tinggi Badan Anda\t: " + imt.getTb());
        System.out.printf("NIlai IMT Anda\t\t: %.2f%n", imt.getImt());
        imt.setKriteria();
    } 
}