/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author sye
 */
public class Matematika2 extends Matematika{
    double modul;
    
    public void modulus(int a, int b){
        modul = a % b;
        System.out.println("Hasil modulus " + a + " dan " + b + " = " + modul);
    }      
}