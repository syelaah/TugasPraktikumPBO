/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author sye
 */
public class KonversiSuhu2 extends KonversiSuhu{
    
    public void fahrenheitToReamur(){
    reamur = fahrenheit - 32;
    reamur = reamur * 4 / 9;
    System.out.println("Hasil konversi fahreinheit ke reamur: " + reamur);
    }
}