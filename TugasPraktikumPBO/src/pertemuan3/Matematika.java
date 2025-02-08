/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author LENOVO
 */
public class Matematika{
    //variabel
    double tambah, kurang, kali, bagi;
    
    
    //method
    public void pertambahan(int a, int b){
        tambah = a + b;
        System.out.println("Hasil pertambahan " + a + " dan " + b + " = " + tambah);
    }
    
    public void pengurangan(int a, int b){
        kurang = a - b;
        System.out.println("Hasil pengurangan " + a + " dan " + b + " = " + kurang);
    }
    
    public void perkalian(int a, int b){
        kali = a * b;
        System.out.println("Hasil perkalian " + a + " dan " + b + " = " + kali);
    }
    
    public void pembagian(int a, int b){
        bagi = a / b;
        System.out.println("Hasil pembagian " + a + " dan " + b + " = " + bagi);
    }    
}