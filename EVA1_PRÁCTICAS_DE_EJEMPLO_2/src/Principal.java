/*
 * EVA 1 - PRÁCTICAS DE EJEMPLO 2
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
        int aMatriz [][] = new int [100][100];
        aMatriz[0][0] = 1;
        
        for (int i = 1; i < aMatriz.length; i++) {
            
            for (int j = 1; j < aMatriz[i].length; j++) {
                if (i == j) {
                    aMatriz[i][j] = 1;
                    
                }else{
                    aMatriz[i][j]= 0;
                }
            }
        }
            
            for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                System.out.print("[" + aMatriz[i][j] + "]");
                
            }
            System.out.println("");
        }
    }
    
}
