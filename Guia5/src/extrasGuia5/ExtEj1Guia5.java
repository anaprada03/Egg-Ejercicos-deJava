/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
con los valores ingresados por el usuario.

*/
package extrasGuia5;

import java.util.Scanner;

public class ExtEj1Guia5 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int suma =0 ;
        
        System.out.println("Ingrese la cantidad de numeros a sumar");
        int tamaño = leer.nextInt();
        int vector [] = new int[tamaño];
        for(int i=0; i < tamaño; i++){
        System.out.println("Ingrese el valor a sumar en la posision " + i);
        vector[i] = leer.nextInt();
        suma = suma + vector[i];
        }
        System.out.println("La suma de los valores del vector es:" + suma);
        
    }
    
}