/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author sye
 */

import java.util.Scanner;

public class ShapeApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // variabel
        int pilih; 
        
        // object
        var balok = new Balok();
        var kubus = new Kubus();
        
        System.out.println("PROGRAM MENGHITUNG LUAS DAN KELILING");
        System.out.println("1. Balok \n2. Kubus");
        System.out.print("Input angka: ");
        pilih = input.nextInt();
        
        switch (pilih) {
            case 1:
                
//                balok.start();
                System.out.print("Input panjang balok: ");
                balok.panjang = input.nextInt();
                System.out.print("Input lebar balok: ");
                balok.lebar = input.nextInt();
                System.out.print("Input tinggi balok: ");
                balok.tinggi = input.nextInt();
//                balok.start(balok.panjang, balok.lebar, balok.tinggi);
               
                break;
                
            case 2:
               
                System.out.print("Input sisi kubus: ");
                kubus.sisi = input.nextInt();
                
                break;
                
            default:
                
                System.out.println("Silahkan pilih menu kembali dengan benar");
                
                break;
        }
    }  
}