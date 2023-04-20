/*1-Escribir un programa que pida dos números enteros por teclado y calcule la
suma de los dos.El programa deberá después mostrar el resultado de la suma
 */
package guia2;

import java.util.Scanner;

public class Guia2Ej1 {
    public static void main(String[] args) {
        int num1, num2, resultado;
        System.out.println("Ingrese el primer valor");
        try (Scanner leer = new Scanner(System.in)) {
            num1= leer.nextInt();
            System.out.println("Ingrese el segundo valor");
            num2= leer.nextInt();
            resultado = num1 + num2;
            System.out.println("La suma es;" + resultado);
        }
        
        
                
                
              
        
    }
    
}
