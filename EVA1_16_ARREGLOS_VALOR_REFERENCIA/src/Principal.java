/*
 * EVA 1 - PRÁCTICA 16 - ARREGLOS VALOR REFERENCIA 
 */

/**
 *
 * @author Carlos Rogelio Rivera Lujan - 18550725
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Arreglo[] = new int [10];
        System.out.println(Arreglo);
        llenarArreglo(Arreglo);
        madrearArreglo(Arreglo);
        System.out.println(Arreglo);
        imprimirArreglo(Arreglo);
        
    }
    public static void madrearArreglo(int[] arre){
       arre = new int [100];
        System.out.println(arre);
    }
    
    public static void llenarArreglo(int[] arre){ //EL METODO VA A LLENAR EL ARREGLO
        for (int i = 0; i < arre.length; i++) {
            arre[i] = (int)(Math.random() * 100);
        }
        System.out.println(arre);            

    }
    
    
    public static void imprimirArreglo(int[] arre){ //EL METODO VA A LLENAR EL ARREGLO
        for (int i = 0; i < arre.length; i++) {
            System.out.print("[" + arre[i] + "]");
        }
        System.out.println(" ");
    }
}
