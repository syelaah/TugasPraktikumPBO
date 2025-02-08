package pertemuan6;

/**
 *
 * @author sye
 */
public class TabelPerkalianLoop {
    int number, i, j, k;
    
    public void whileLoop(){
        i = 0;
        while(i<=number){
            System.out.print(i + "\t");
            i++;
        }
        System.out.println("\n");
        
        j = 1;
        while(j<=number){
            System.out.print(j + "\t");
            k = 1;
            
            while(k<=number){
                System.out.print(j * k + "\t");
                k++;
            }
                
            System.out.print("\n\n");
            j++;
        } 
    }  
}