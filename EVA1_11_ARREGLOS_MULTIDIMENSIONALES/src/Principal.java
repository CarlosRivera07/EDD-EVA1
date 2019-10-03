/*
 * EVA 1 - PRÁCTICA 11 - ARREGLO MULTIDIMENSIONAL
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
        //ARREGLO DE DOS DIMENSIONES --> MATRIZ
        int aDatos [][] = new int [3][4];
        System.out.println("Direccion del arreglo: " + aDatos);
        System.out.println("Tamaño del arreglo: " + aDatos.length);
        
        System.out.println("Direccion del arreglo aDatos [0]: " + aDatos[0]);
        System.out.println("Tamaño del arreglo aDatos [0]: " + aDatos[0].length);
        
        System.out.println("Valor almacenado de la posición aDatos[0][0]:  " + aDatos[0][0]);
    }
    
}
