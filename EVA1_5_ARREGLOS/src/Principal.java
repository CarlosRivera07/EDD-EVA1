/*
 * EVA 1 - PRÁCTICA 5 - ARREGLOS
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
        
        // DECLARACION DEL ARREGLO
        int aiDatos [] = new int [10]; //UN ARREGLO EN JAVA ES UN OBJETO
        
        
        //N --> REPRESENTA EL # DE ELEMENTOS
        //0 --> 1ER ELEMENTO
        //N - 1 --> ULTIMO ELEMENTO
        
        
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random() * 100) + 1;
            
        }
        System.out.println("FOR NORMAL");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println(aiDatos[i]);
            
        }
        //FOR - EACH
        System.out.println("FOR - EACH");
        for (int aiDato : aiDatos) {
            System.out.println(aiDato);
        }
            
        }
        
    }
    

