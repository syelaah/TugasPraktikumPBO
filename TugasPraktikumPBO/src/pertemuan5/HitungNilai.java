/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author sye
 */
// import java scanner
import java.util.Scanner;

public final class HitungNilai {
    // object scanner
    Scanner input = new Scanner(System.in);
    
    
    // variabel/atribut 
    String npm, nama, ket;
    char grade;
    double nKehadiran, nTugas, nUts, nUas, nAkhir, nRata;
    
    
    // konstruktor
    public HitungNilai(){
        this.setNpm();
        this.setNama();
        this.setnKehadiran();
        this.setnTugas();
        this.setnUts();
        this.setnUas();
        this.setnAkhir();
        this.setnRata();
        this.setGrade(); 
        this.setKet();
}
    // method
    public String getNpm() {
        return npm;
    }

    public void setNpm() {
        System.out.print("NPM\t\t: ");
        this.npm = input.nextLine();
    }

    public String getNama() {
        return nama;
    }

    public void setNama() {
        System.out.print("Nama\t\t: ");
        this.nama = input.nextLine();
    }

    public double getnKehadiran() {
        return nKehadiran;
    }

    public void setnKehadiran() {
        System.out.print("Nilai Kehadiran\t: ");
        this.nKehadiran = input.nextDouble();
    }

    public double getnTugas() {
        return nTugas;
    }

    public void setnTugas() {
        System.out.print("Nilai Tugas\t: ");
        this.nTugas = input.nextDouble();
    }

    public double getnUts() {
        return nUts;
    }

    public void setnUts() {
        System.out.print("Nilai UTS\t: ");
        this.nUts = input.nextDouble();
    }

    public double getnUas() {
        return nUas;
    }

    public void setnUas() {
        System.out.print("Nilai UAS\t: ");
        this.nUas = input.nextDouble();
    }

    public double getnAkhir() {
        return nAkhir;
    }

    public void setnAkhir() {
        this.nAkhir = (0.1 * this.nKehadiran) + (0.2 * this.nTugas) 
                + (0.3 * this.nUts) + (0.4 * this.nUas);
    }

    public double getnRata() {
        return nRata;
    }

    public void setnRata() {
        this.nRata = (nKehadiran + nTugas + nUts + nUas)/4;
    }
    
    public char getGrade() {
        return grade;
    }

    public void setGrade() {
        getnAkhir();
        // if else
        if(this.nAkhir >= 76){
            grade = 'A';
        } else if (this.nAkhir >= 66){
            grade = 'B';
        } else if (this.nAkhir >= 56){
            grade = 'C';
        } else if (this.nAkhir >= 46){
            grade = 'D';
        } else {
            grade = 'E';
        }
    }
    
    public String getKet() {
        return ket;
    }

    public void setKet() {
        // switch case
        switch(grade){
            case 'A':
                ket = "Istimewa";
                break;
            case 'B':
                ket = "Baik";
                break;
            case 'C':
                ket = "Cukup";
                break;
            case 'D':
                ket = "Kurang";
                break;
            case 'E':
                ket = "Kurang Sekali";
                break;   
        } 
    }
}