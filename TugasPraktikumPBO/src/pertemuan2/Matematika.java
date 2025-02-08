/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author LENOVO
 */
public class Matematika implements InterfaceMtk{
    //variabel
    int tambah, kurang, kali, bagi;
    
    
    //method
    @Override
    public void pertambahan(int a, int b){
        tambah = a + b;
        System.out.println("Hasil pertambahan 20 + 10 = " + tambah);
    }
    
    @Override
    public void pengurangan(int a, int b){
        kurang = a - b;
        System.out.println("Hasil pengurangan 10 - 5 = " + kurang);
    }
    
    @Override
    public void perkalian(int a, int b){
        kali = a * b;
        System.out.println("Hasil perkalian 10 x 3 = " + kali);
    }
    
    @Override
    public void pembagian(int a, int b){
        bagi = a / b;
        System.out.println("Hasil pembagian 21 / 2 = " + bagi);
    }    
}
