 package praktek02;

public class RectangleAksi {
    public static void main(String[] args) {
        Rectangle rl = new Rectangle();
        rl.panjang = 9;
        rl.lebar = 3;
        
        rl.cetakinfo();
        System.out.println("Luas rectangle = "+rl.hitungLuas());
        rl.cetakLuas();
        
        Rectangle r2 = new Rectangle();
        r2.cetakinfo();
        
        Rectangle r3 = new Rectangle(50,30);
        r3.cetakinfo();
    }
    
}
