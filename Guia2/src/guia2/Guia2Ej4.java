package guia2;


import java.util.Scanner;

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente 
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

/**
 *
 * @author ANAPR
 */
public class Guia2Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese los grados centigrados a transformar en F°");
        Scanner leer = new Scanner(System.in);
        double grados= leer.nextDouble();
        System.out.println( grados + "Grados Celsius, equivalen a " + (32 + (9 * grados / 5))); 
    }
    
}
