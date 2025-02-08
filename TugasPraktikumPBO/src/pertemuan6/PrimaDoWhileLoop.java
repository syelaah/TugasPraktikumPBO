package pertemuan6;

/**
 *
 * @author sye
 */
public class PrimaDoWhileLoop {
    int prima = 0, bukan = 0;
    int i, j, number;
    
    public void doWhile(){
        System.out.println("== MENAMPILKAN BILANGAN 0 - 20 PRIMA DAN BUKAN MENGGUNAKAN DO WHILE ==");
        
        do{
            System.out.print(i + ", ");
            i++;
        }while(i <= 20);
        
        System.out.println("\n\nBilangan Prima:");
        i = 0;
        do{
            number = 0;
            j = 1;
            do{
                if(i%j==0){
                    number += 1;
                }
                j++;
            }while(j <= i);
            if(number==2){
                System.out.print(i + ", ");
                prima += i;
            }
            i++;
        }while(i <= 20);
        
        System.out.println("\n\nBilangan Bukan Prima:");
        i = 0;
        do{
            number = 0;
            j = 1;
            do{
                if(i%j==0){
                    number += 1;
                }
                j++;
            }while(j <= i);
            if(number!=2){
                System.out.print(i + ", ");
                bukan += i;
            }
            i++;
        } while(i <= 20);
        
        System.out.println("\n");
        System.out.println("Deret Prima      : " + prima);
        System.out.println("Deret Bukan Prima: " + bukan);
    }
}