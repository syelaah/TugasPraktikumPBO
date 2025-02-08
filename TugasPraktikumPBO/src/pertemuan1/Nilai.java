/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author SYELA
 */
public class Nilai {
    //variabel
    String nim = "2010631250077";
    String nama = "Syela Herdina Naibaho";
        float nilaiAbsen = 100f;
        float nilaiTugas = 96f;
        float nilaiUts = 85f;
        float nilaiUas = 91.5f;
    
    //method nilai
    public void Nilai(){
        float nilaiAkhir = (nilaiAbsen * 10/100) + (nilaiTugas * 20/100) +
                (nilaiUts * 30/100) + (nilaiUas * 40/100);
        System.out.println("Nilai Akhir         : " + nilaiAkhir);
    }
    
    //method CetakNilai
    public void CetakNilai(){
        System.out.println("Nilai Mata Kuliah Pemrograman Berorientasi Objek");
        System.out.println("NIM                 : " + nim);
        System.out.println("Nama                : " + nama);
        System.out.println("Nilai Absen [10%]   : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%]   : " + nilaiTugas);
        System.out.println("Nilai UTS [30%]     : " + nilaiUts);
        System.out.println("Nilai UAS [40%]     : " + nilaiUas);
    }
}
