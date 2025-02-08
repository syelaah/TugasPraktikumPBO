/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author sye
 */
public class Kubus implements ShapeInterface{
    // variabel
    int sisi;
    double l, k;
    
    // overriding
    @Override
    public void luas(){
        l = 6 * sisi * sisi;
        System.out.println("Luas Kubus \n6 x " + sisi + " x " + sisi + " = " + l);
    }
    
    // overriding
    @Override
    public void keliling(){
        k = 12 * sisi;
        System.out.println("Keliling Kubus \n12 x " + sisi + " = " + k); 
    }
    
}