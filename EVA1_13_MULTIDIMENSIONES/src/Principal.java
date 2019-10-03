/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carla
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aMatriz[][][][][] = new int [5][3][8][0][11];
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                for (int k = 0; k < aMatriz[i][j].length; k++) {
                    for (int l = 0; l < aMatriz[i][j][k].length; l++) {
                        for (int m = 0; m < aMatriz[i][j][k][l].length; m++) {
                            aMatriz[i][j][k][l][m] = (int)(Math.random()* 100);
                        }
                    }
                }
            }
            
        }
    }
    
}
