
import java.util.Scanner;

/*
 * EVA 1 - PRÁCTICAS DE EJEMPLO 1
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
        Scanner input = new Scanner(System.in);
        
        System.out.println("¿Cuántas edades desea capturar?");
        edad[] aEdad = new edad[input.nextInt()];
        
        double iMedia = 0;
        int iMaxRepes = 0;
        int iModa = 0;
        double dDesviacion = 0;
        double dVarianza = 0;
        int n = aEdad.length;

        
        for (int i = 0; i < aEdad.length; i++) {
            System.out.println("Ingrese la Edad: ");
            aEdad[i] = new edad();
            aEdad[i].iEdad = input.nextInt();
            iMedia = iMedia + aEdad[i].iEdad;
        }
        
        for (int i = 0; i < aEdad.length; i++) {
            System.out.println("Las edad #" + (i + 1) + " es:");
            System.out.println("[" + aEdad[i].iEdad + "]");
        }
        System.out.println(iMedia);
        System.out.println("---------------------------------------------------");
        
        //media
        double iMedia2 = iMedia / aEdad.length;
        System.out.println("La media de las edades capturadas es: " + iMedia2);
        System.out.println("---------------------------------------------------");

        
        //moda
        for (int i = 0; i < aEdad.length; i++) {
            int iRepeticiones = 0;
            for (int j = 0; j < aEdad.length; j++) {
                if (aEdad[i] == aEdad[j]) {
                    iRepeticiones++;
                }
                
                if (iRepeticiones > iMaxRepes) {
                    iModa = aEdad[i].iEdad;
                    iMaxRepes = iRepeticiones;
                    
                }
            }
            
        }
        System.out.println("La moda de las edades captudradas es: " + iModa);
        System.out.println("---------------------------------------------------");
       
        //Desviación Estandar
        
        for (int i = 0; i < aEdad.length; i++) {
            double dRango;
            dRango = Math.pow(aEdad[i].iEdad - iMedia, 2f);
            dVarianza = dVarianza + dRango;
            
            
        }
        dVarianza = dVarianza / n;
        dDesviacion = Math.sqrt(dVarianza);
        System.out.println("La Desviacion Estandar de las edades capturadas es: " + dDesviacion);
        
    }
    
}
class edad{
    int iEdad;
}