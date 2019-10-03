/*
 * EVA 1 -  PRÁCTICA 9 - ARREGLO DE OBJETOS

    PRACTICA DONDE DUPLICAMOS ARREGLOS CON OBJETOS
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
        Prueba[] apArreglo = new Prueba [5];
        Prueba[] apCopia = new Prueba [5];
        
        System.out.println(apArreglo);
        for (int i = 0; i < apArreglo.length; i++) {
            apArreglo[i]  = new Prueba();
            apArreglo[i].x = (int)(Math.random() * 100);
            System.out.println(apArreglo[i]);
            
        }
        for (int i = 0; i < apArreglo.length; i++) {
            apCopia[i] = new Prueba();
            apCopia[i].x = apArreglo[i].x; //NO FUNCIONA
            System.out.println("copia " + i + " = " + apCopia[i]);
            System.out.println("Arreglo " + i + " = " + apArreglo[i]);
            
        }
    }
    
    
}

class Prueba{
    int x;
}
