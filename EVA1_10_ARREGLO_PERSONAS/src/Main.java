
import java.util.Scanner;

/*
 * EVA 1 - PRÁCTICA 10 - ARREGLO PERSONAS
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
        Scanner input = new Scanner(System.in);
        Persona[] apArreglo = new Persona[5];
        
        for (int i = 0; i < apArreglo.length ; i++) {
            apArreglo[i] = new Persona();
            System.out.println("Ingrese el Nombre: ");
            apArreglo[i].sNombre = input.nextLine();
            System.out.println("Ingrese el Apellido: ");
            apArreglo[i].sApellido = input.nextLine();
            
            
            
            
        }
        imprimeArreglo(apArreglo);
        
        //COPIA DEL ARREGLO
        Persona[] apCopia = new Persona[apArreglo.length];
        for (int i = 0; i < apArreglo.length; i++) {
            apCopia[i] = new Persona();
            apCopia[i].sNombre = apArreglo[i].sNombre; 
            apCopia[i].sApellido = apArreglo[i].sApellido; 
            
        }
        imprimeArreglo(apCopia);
        
        
    }
    
    public static void imprimeArreglo(Persona[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println("Nombre: " + args[i].sNombre);
            System.out.println("Apellido: " + args[i].sApellido);
        }
    }
    
}
class Persona{
    String sNombre;
    String sApellido;
}
