/*
 * EVA 1 - PRÁCTICA 1 - MEMORY MAGNAMENT
 */

/**
 *
 * @author Carlos Rogelio Rivera Lujan - 18550725
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("incia Main");
        A();
        System.out.println("Termina Main");
    }
    
    public static void A(){
        System.out.println("Inicia A");
        B();
        System.out.println("Termina A");
    }
    
    public static void B(){
        System.out.println("Inicia B");
        C();
        System.out.println("Termina B");
       
    }
    
    public static void C(){
        System.out.println("Inicia C");
        System.out.println("Termina C");
        
    }
}
