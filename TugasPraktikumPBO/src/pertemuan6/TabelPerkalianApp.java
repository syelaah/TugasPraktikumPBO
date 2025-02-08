package pertemuan6;

/**
 *
 * @author sye
 */
import java.util.Scanner;
public class TabelPerkalianApp {
    public static void main(String[] args) {
        // object class
        var kali = new TabelPerkalianLoop();
        // object input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input nilai n: ");
        kali.number = input.nextInt();
       
        System.out.println("== TABEL PERKALIAN " + kali.number + " x " + kali.number + " ==");
        // memanggil method
        kali.whileLoop();
    }
}