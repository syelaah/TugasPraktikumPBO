/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author sye
 */
public class NilaiApp {
    // main
    public static void main(String[] args) {
        // object
        var n = new HitungNilai();
        // output
        System.out.println("\nNPM Mahasiswa\t: " + n.getNpm());
        System.out.println("Nama Mahasiswa\t: " + n.getNama());
        System.out.println("Nilai Rata-rata\t: " + n.getnRata());
        System.out.println("Grade\t\t: " + n.getGrade());
        System.out.println("Keterangan\t: " + n.getKet());
    }
}