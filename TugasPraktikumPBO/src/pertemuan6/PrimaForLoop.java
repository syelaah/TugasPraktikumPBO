package pertemuan6;

/**
 *
 * @author sye
 */
public class PrimaForLoop {
    int prima = 0, bukan = 0;
    int i, j, number;
    
    public void forLoop(){
        System.out.println("== MENAMPILKAN BILANGAN 0 - 20 PRIMA DAN BUKAN MENGGUNAKAN FOR ==");
        for(i=0; i<=20; i++){
            System.out.print(i + ", ");
        }
        
        System.out.println("\n\nBilangan Prima:");
        for(i=0; i<=20; i++){
            number = 0;
            for(j=1; j<=i; j++){
                if(i%j==0){
                    number += 1;
                } 
            }
            if(number==2){
                System.out.print(i + ", ");
                prima += i;
            }
        }
        
        System.out.println("\n\nBilangan Bukan Prima:");
        for(i=0; i<=20; i++){
            number = 0;
            for(j=1; j<=i; j++){
                if(i%j==0){
                    number += 1;
                } 
            }
            if(number!=2){
                System.out.print(i + ", ");
                bukan += i;
            }
        }
        
        System.out.println("\n");
        System.out.println("Deret Prima      : " + prima);
        System.out.println("Deret Bukan Prima: " + bukan);
    }
}