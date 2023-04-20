/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida
al usuario un número a buscar en el vector. El programa mostrará dónde se encuentra el 
numero y si se encuentra repetido
*/
import java.util.Scanner;
public class Ej2Guia5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la muestra");
        int N = leer.nextInt();

        int vector[] = new int[N];

        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < N; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");

        System.out.println("Ingrese el número a buscar");
        int numBuscado = leer.nextInt();
        int repet = 0;

        for (int i = 0; i < N; i++) {
            if (vector[i] == numBuscado) {
                System.out.println("[" + (i + 1) + "]");
                repet++;
            }
        }
        if (repet == 0) {
            System.out.println("El número buscado no se encuentra en la muestra");
        } else {
            System.out.println("El número buscado se encuentra " + repet + " veces");
        }
    }
}
    
    

