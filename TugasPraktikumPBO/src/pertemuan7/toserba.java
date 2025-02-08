package pertemuan7;
import java.util.Scanner;
/**
 *
 * @author sye
 */
public class toserba {
    public static void main(String[] args) {
        // object input
        Scanner input = new Scanner(System.in);  
        
        System.out.println("TOKO SERBA ADA");
        System.out.println("***************");
        System.out.print("Masukan Item Barang : ");
        int barang = input.nextInt();
        
        // array
        String kode[] = new String[barang];
        String nama [] = {"Buku","Pensil","Pulpen"};
        int harga [] = {3000,4000,5000};
        int jumlah[] = new int[barang];
        int jumlahbayar[] = new int[barang];
        int total = 0;
        
        // looping
        for (int i = 0; i < barang; i++){
            System.out.println("Data ke "+(i+1));
            System.out.print("Masukkan Kode         : ");
            kode[i] = input.next();
            System.out.print("Masukkan Jumlah Beli  : ");
            jumlah[i] = input.nextInt();
            jumlahbayar[i] = jumlah[i]*harga[i];
            total = total + jumlahbayar[i];
        }
        
        // output
        System.out.println("\n\n");
        System.out.println("TOKO SERBA ADA");
        System.out.println("***************");
        System.out.println("No \t Kode Barang \t Nama Barang \t "
                + "Harga \t Jumlah Beli \t Jumlah Bayar \t");
        System.out.println("==============================================================================");
        for (int j = 0; j < barang; j++){
            System.out.println((j+1) + "\t " + kode[j] + "\t\t " + nama[j]
            + "\t\t  " + harga[j] + "\t\t   " + jumlah[j] + "\t\t" + jumlahbayar[j] + "\t");   
        }
        System.out.println("==============================================================================");
        System.out.println("Total Bayar \t\t\t\t\t\t" + total);
        System.out.println("==============================================================================");
    }
}