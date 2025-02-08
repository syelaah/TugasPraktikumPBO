package pertemuan6;

/**
 *
 * @author sye
 */

import java.util.Scanner;
public class AnakAyamApp {
    public static void main(String[] args) {
        // object class
        var loop = new AnakAyamLoop();
        // object input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input jumlah anak ayam: ");
        loop.ayam = input.nextInt();
        
        // method for
        loop.forLoop(loop.ayam);
        System.out.println("\n\n");
        
        // method while
        loop.whileLoop(loop.ayam);
        System.out.println("\n\n");
        
        // method do while
        loop.doWhileLoop(loop.ayam);
    }  
}