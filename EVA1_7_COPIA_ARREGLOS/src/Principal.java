/*
 * EVA 1 - PRÁCTICA 7 - COPIA ARREGLOS
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
        
         int aiDatos[] = new int[10];
         int aiCopia[] = new int[10];
        
        
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[1] = (int)((Math.random() * 100) + 1);
    }
        System.out.println("DATOS ORIGINALES");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.print("[" + aiDatos[i] + "]");
        }
        System.out.println(aiDatos[9]);
        aiCopia = aiDatos;
        System.out.println("\nDATOS COPIADOS");
        for (int i = 0; i < aiDatos.length; i++) {
        System.out.print("[" + aiCopia[i] + "]");

        }
    
}
}