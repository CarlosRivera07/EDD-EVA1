/*
 * EVA 1 - PRÁCTICA 8 - COPIA ARREGLOS 2
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
        // TODO code application logic here
        
        int aiDatos[] = new int[10];
        int aiCopia[] = new int[10];
        
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random() * 10) + 1;
        }
        //aiCopia = aiDatos; //AQUI COPIAMOS DIRECCIONES
        //ELEMENTO POR ELEMENTO
        
        for (int i = 0; i < aiDatos.length; i++) {
            aiCopia[i] = aiDatos[i];
        }
        
        imprimirArreglos(aiDatos);
        imprimirArreglos(aiCopia);
        System.out.println(aiDatos);
        System.out.println(aiCopia);
    
        System.out.println("");
        aiDatos[5]= 9000;
        imprimirArreglos(aiDatos);
        imprimirArreglos(aiCopia);
        System.out.println(aiDatos);
        System.out.println(aiCopia);
    }
    
    public static void imprimirArreglos(int[] args){
        System.out.println("");
        
        for (int i = 0; i < args.length; i++) {
            System.out.print("[" + args[i] + "]");
        
    } 
        System.out.println("");
}
}
