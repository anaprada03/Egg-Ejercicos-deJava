
import java.util.Scanner;

/*
 Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
sus filas por columnas (o viceversa).
 */
public class Ej5Guia5 {
    // Muestro la matriz
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("INDIQUE EL TAMAÑO DE LA MATRIZ");
        n = sc.nextInt();

        int matrizA[][] = new int[n][n];
        int matrizAT[][] = new int[n][n];

        //rellenamos matrizA
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.println("Ingrese un valor para la posicion " + i + j);
                matrizA[i][j] = sc.nextInt();
            }
        }
        // mostramos matriz A
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("[" + (matrizA[i][j]) + "]");
            }
            System.out.println(" ");
        }
        System.out.println("  ");
       
            
        
        // mostramos matriz AT
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                matrizAT[i][j] = matrizA[j][i];
                System.out.print("[" + (matrizAT[i][j]) + "]");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if ((matrizA[i][j]) == ((-matrizAT[i][j]))) {

                    System.out.println(" Es antisimétrica ");
                } else {
                    System.out.println("No es antisimetrica");
                }
            }

        }

    }
}
