/*
 * EVA 1 - PRÁCTICA 6 - ARREGLOS 2

    TODO ARREGLO ES UN OBJETO
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
        //DECLARACION
        int aiDatos[], a, b;
        int[] aiDatos2, x, y;
        //
        
        int aiCopia[];
        //INCIALICACIÓN DEL ARREGLO
        int tama = 100;
        aiDatos = new int[tama];
        
        // LLENAR CON VALORES ALEATORIOS
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[1] = (int)(Math.random() * 100) + 1;
            
             
            
            //SON OBJETOS EN JAVA
            //LA MEMORIA ES CONSECUTIVA
            //SON DE ACCESO ALEATORIO
            
            aiDatos[4] = 5000;
            aiDatos[69] = 500;
            
        }
        tama = 200;
        aiDatos = new int[tama];
        
        // LLENAR CON VALORES ALEATORIOS
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[1] = (int)(Math.random() * 100) + 1;
        
    }
    
}
}
