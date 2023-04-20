package guia2;


import java.util.Scanner;

/*Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */

/**
 *
 * @author ANAPR
 */
public class Guia2Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        System.out.println("El doble de " + num + " es " + num*2 + ", el triple es: " + num*3 + " y su raiz cuadrada es: " + Math.sqrt(num));
        leer.close();
        
    }
    
}
