/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author sye
 */

import java.util.Scanner;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var suhu = new KonversiSuhu2();
        
        System.out.println("PROGRAM KONVERSI SUHU");
        System.out.println("Masukkan suhu celcius: ");
        
        suhu.celcius = input.nextInt();
        
        suhu.celciusToFahrenheit();
        suhu.celciusToReamur();
        suhu.fahrenheitToReamur();
    }
}