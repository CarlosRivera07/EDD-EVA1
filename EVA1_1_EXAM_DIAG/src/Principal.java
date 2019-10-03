/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        int numRandom = (int)(Math.random()* 10000) ;
        
        if(numRandom <10){
            System.out.println("000" + numRandom);
        }else{
            if(numRandom < 100){
                System.out.println("00" + numRandom);
            }else{
                if(numRandom < 1000){
                    System.out.println("0" + numRandom);
                    
                }else{
                    if(numRandom < 10000){
                        System.out.println(numRandom);
                    }
                }
            }
        }
    }
    
    
}
