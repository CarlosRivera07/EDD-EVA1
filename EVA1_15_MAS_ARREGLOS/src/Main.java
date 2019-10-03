/*
 * EVA1 - PRÁCTICA 15 - MÁS ARREGLOS
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
        int iNume = 10;
        System.out.println("Valor = " + iNume);
        incrementa(iNume);
        System.out.println("Valor = " + iNume);
        //-------------
        Prueba obj = new Prueba();
        obj.iVal = 10;
        System.out.println("Valor = " + obj.iVal);
        incrementaObj(obj);
        System.out.println("Valor = " + obj.iVal);
    }
    
    public static void incrementa(int iVal){
        iVal++;
    }
    public static void incrementaObj(Prueba obj){
        obj.iVal++;
    }
}
class Prueba{
    int iVal;
}