package pertemuan6;

/**
 *
 * @author sye
 */
public class AnakAyamLoop {
    int ayam, i;
    
    public void forLoop(int ayam){
        this.ayam = ayam;
        System.out.println("== LAGU ANAK AYAM MENGGUNAKAN FOR ==");
        System.out.println("""
                            \nTek kotek kotek kotek
                            Anak ayam turun berkotek
                            \nTek kotek kotek kotek
                            Anak ayam turun berkotek""");
        
        for(i=ayam; i>1; i--){
            System.out.println("\nAnak ayam turunlah " + ayam);
            ayam -= 1;
            System.out.println("Mati satu tinggal lah " + ayam);
        }
        
        System.out.println("\nAnak ayam turunlah " + ayam);
        System.out.println("Mati satu tinggal lah induknya");
    }
    
    public void whileLoop(int ayam){
        this.ayam = ayam;
        System.out.println("== LAGU ANAK AYAM MENGGUNAKAN WHILE ==");
        System.out.println("""
                            \nTek kotek kotek kotek
                            Anak ayam turun berkotek
                            \nTek kotek kotek kotek
                            Anak ayam turun berkotek""");
        
        i = ayam;
        while(i>1){
            System.out.println("\nAnak ayam turunlah " + ayam);
            ayam -= 1;
            System.out.println("Mati satu tinggal lah " + ayam);
            i--;
        }
        
        System.out.println("\nAnak ayam turunlah " + ayam);
        System.out.println("Mati satu tinggal lah induknya");
    }
    
    public void doWhileLoop(int ayam){
        this.ayam = ayam;
        System.out.println("== LAGU ANAK AYAM MENGGUNAKAN DO WHILE ==");
        System.out.println("""
                            \nTek kotek kotek kotek
                            Anak ayam turun berkotek
                            \nTek kotek kotek kotek
                            Anak ayam turun berkotek""");
        
        i = ayam;
        do{
            System.out.println("\nAnak ayam turunlah " + ayam);
            ayam -= 1;
            System.out.println("Mati satu tinggal lah " + ayam);
            i--;
        }while(i>1);
        
        System.out.println("\nAnak ayam turunlah " + ayam);
        System.out.println("Mati satu tinggal lah induknya");
    }
}