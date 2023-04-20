/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
Después haremos otra función o procedimiento que imprima el vector.

 */
package extrasGuia5;



import java.util.Scanner;

public class ExtEj3Guia5 {
    public static void main(String[] args) {
       
Scanner leer = new Scanner(System.in);
   System.out.println("ingrese el tamaño de la muestra : ");
    int n = leer.nextInt();
   
    
   
   int muestra1[]= new int[n];
   int muestra2[]= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese un numero entero");
            muestra1[i]= leer.nextInt();
           
        }System.out.println("ingresa los valores del vector2");
        for (int i = 0; i < n; i++) {
          System.out.println("ingrese un numero entero");
          muestra2[i]= leer.nextInt();
           
        }
        for (int i = 0; i < n; i++) {
            if (muestra1[i] != muestra2[i]) {
                System.out.println(" No Son iguales.");
        
            break;
        } else {
                System.out.println("  son iguales.");
            }
        }
    }
} 
    
    

