/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author sye
 */
// import scanner
import java.util.Scanner;

public final class IndeksMassaTubuh {
    // object scanner
    Scanner input = new Scanner(System.in);
    
    // variabel
    String kriteria;
    int bb, tb;
    double imt;
    
    // konstruktor
    public IndeksMassaTubuh() {
        this.setBb();
        this.setTb();
        this.setImt();
    }
    
    // method
    public int getBb() {
        return bb;
    }

    public void setBb() {
        System.out.print("Masukkan Berat Badan\t: ");
        bb = input.nextInt();
    }

    public int getTb() {
        return tb;
    }

    public void setTb() {
        System.out.print("Masukkan Tinggi Badan\t: ");
        tb = input.nextInt();
    }

    public double getImt() {
        return imt;
    }

    public void setImt() {
        imt = tb*0.01;
        imt = (bb)/(imt*imt);
        
        // if else if
        if(imt <= 18.4){
            kriteria = "Berat Badan Kurang";
        } else if ((imt >= 18.5) && (imt <= 24.9)){
            kriteria = "Berat Badan Ideal";
        } else if ((imt >= 25)&&(imt <= 29.9)){
            kriteria = "Berat Badan Lebih";
        } else if ((imt >= 30)&&(imt <= 39.9)){
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }
    }
    
    public String getKriteria() {
        return kriteria;
    }

    public void setKriteria() {
        getImt();
        switch(kriteria){
            case "Berat Badan Kurang":
                System.out.println("Kriteria Anda\t\t: " + kriteria);
                break;
            case "Berat Badan Ideal":
                System.out.println("Kriteria Anda\t\t: " + kriteria);
                break;
            case "Berat Badan Lebih":
                System.out.println("Kriteria Anda\t\t: " + kriteria);
                break;
            case "Gemuk":
                System.out.println("Kriteria Anda\t\t: " + kriteria);
                break;
            case "Sangat Gemuk":
                System.out.println("Kriteria Anda\t\t: " + kriteria);
                break;
        }
    }
}