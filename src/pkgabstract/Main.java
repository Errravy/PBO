package pkgabstract;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gun gun1 = new Gun(5);
        Knife knife1 = new Knife();
        
        
        knife1.attack();
        gun1.attack();
        gun1.attack();
        knife1.attack();
        gun1.attack();
        gun1.attack();
        gun1.attack();
        gun1.attack();
    }
    
}
