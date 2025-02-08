/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author sye
 */
public class Balok implements ShapeInterface{
    // variabel
    int panjang, lebar, tinggi;
    double l, k;
    
    
    // overriding
    @Override
    public void luas(){
        l = (panjang * lebar) + (panjang * tinggi) + (lebar * tinggi);
        l = 2 * l;
        
        System.out.println("Luas Balok" 
                + "\n2 x ( " + panjang + " x " + lebar 
                + " + " + panjang + " x " + tinggi 
                + " + " + lebar + " x " + tinggi + ") = " + l);
    }
    
    
    // overriding
    @Override
    public void keliling(){
        k = panjang + lebar + tinggi;
        k = 4 * k;
        
        System.out.println("Keliling Balok"
                + "\n4 x (" + panjang + " + " + lebar + " + " + tinggi +") =  " + k);  
    }
}