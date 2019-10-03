/*
 * EVA 1 - PRÁCTICAS DE EJEMPLO 3
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
        int aMatriz [][] = new int [5][5];
        int aCopia [][] = new int [5][5];
        
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                aMatriz[i][j] = (int)(Math.random() * 100);
            }
        }
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                aCopia[aCopia.length - i -1][aCopia.length - j - 1] = aMatriz[i][j];
                
            }

            
        }
        
        
        //IMPRIMIR
         for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                System.out.print("[" + aMatriz[i][j] + "]");
                
            }
            System.out.println("");
             
            
    }
             System.out.println("------------------------------------------------");
         
         for (int i = 0; i < aCopia.length; i++) {
            for (int j = 0; j < aCopia[i].length; j++) {
                System.out.print("[" + aCopia[i][j] + "]");
                
            }
            System.out.println("");
    
}
    }
}

