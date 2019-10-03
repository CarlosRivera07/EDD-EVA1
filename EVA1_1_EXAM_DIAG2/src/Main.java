/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        
        System.out.println(generaClave());
        
            
        }
        //EL METODO TIENE QUE SER STATIC PARA QUE PUEDA SER UTLIZADO EN EL MAIN
        //EN METODOS NO ESTATICOS NO PUEDEN SER USADOS EN ESTATICOS, PERO LOS ESTATICOS SI EN LOS NO ESTATICOS
    //MODIFICADOR DE ACCESO (STATIC) (VALOR DE RETORNO) 
    public static String generaClave(){
        int iVal;
        iVal = (int)(Math.random() * 10000);
        
        String resu = "";
        if(iVal < 10){//NECESITA 3 CEROS
            resu = "000" + iVal;
            
        }else if(iVal < 100){//NECESITA 2 CEROS
            resu = "00" + iVal;
            
        }else if(iVal < 1000){//NECESITA 1 CERO
            resu = "0" + iVal;
            
        }else{//TIENE 4 DIGITOS
            resu = "" + iVal;
            
        }
        
        return resu;
    }

    
    }
    
    

