package pertemuan6;

/**
 *
 * @author sye
 */
public class PrimaWhileLoop {
    int prima = 0, bukan = 0;
    int i, j, number;
    
    public void whileLoop(){
        System.out.println("== MENAMPILKAN BILANGAN 0 - 20 PRIMA DAN BUKAN MENGGUNAKAN WHILE ==");
        
        while(i <= 20){
            System.out.print(i + ", ");
            i++;
        }
        
        System.out.println("\n\nBilangan Prima:");
        i = 0;
        while(i <= 20){
            number = 0;
            j = 1;
            while(j <= i){
                if(i%j==0){
                    number += 1;
                }
                j++;
            }
            if(number==2){
                System.out.print(i + ", ");
                prima += i;
            }
            i++;
        }
        
        System.out.println("\n\nBilangan Bukan Prima:");
        i = 0;
        while(i <= 20){
            number = 0;
            j = 1;
            while(j <= i){
                if(i%j==0){
                    number += 1;
                }
                j++;
            }
            if(number!=2){
                System.out.print(i + ", ");
                bukan += i;
            }
            i++;
        }
        
        System.out.println("\n");
        System.out.println("Deret Prima      : " + prima);
        System.out.println("Deret Bukan Prima: " + bukan);
    }
}