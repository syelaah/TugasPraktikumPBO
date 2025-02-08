/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author sye
 */
public class KonversiSuhu {
    double celcius, fahrenheit, reamur;
    
    public void celciusToFahrenheit(){
        fahrenheit = celcius * 1.8 + 32;
        System.out.println("Hasil konversi celcius ke fahrenheit: " + fahrenheit);
    }
    
    public void celciusToReamur(){
        reamur = celcius * 0.8;
        System.out.println("Hasil konversi celcius ke reamur    : " + reamur);
    }
}