package pertemuan6;

/**
 *
 * @author sye
 */
public class PrimaApp {
    public static void main(String[] args) {
        // object class for
        var forLoop = new PrimaForLoop();
        
        forLoop.forLoop();
        
        System.out.println("\n\n");
        
        // object class while
        var whileLoop = new PrimaWhileLoop();
        
        whileLoop.whileLoop();
        
        System.out.println("\n\n");
        
        // object class do while
        var doWhileLoop = new PrimaDoWhileLoop();
        
        doWhileLoop.doWhile();
    } 
}