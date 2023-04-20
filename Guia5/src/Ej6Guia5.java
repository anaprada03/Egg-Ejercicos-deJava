
import java.util.Scanner;

/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas 
y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos, es decir, están 
entre el 1 y el 9.


 */
public class Ej6Guia5 {
    public static void main(String[] args) {
                  
                    
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                do {
                    System.out.println("Ingrese un valor del vector [" + i + "][" + j + "] que se encuentre entre 1 y 9");
                    matriz[i][j] = sc.nextInt();
                } while (matriz[i][j] < 0 || matriz[i][j] > 9);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("[ " + matriz[i][j] + " ]");

            }
            System.out.println("  ");
        }
        
        int suma1, suma2,suma3,suma4,suma5,suma6,suma7,suma8;
        
        suma1= (matriz[0][0]+matriz[0][1]+matriz[0][2]);
        suma2= (matriz[1][0]+matriz[1][1]+matriz[1][2]);
        suma3= (matriz[2][0]+matriz[2][1]+matriz[2][2]);
        suma4= (matriz[0][0]+matriz[1][0]+matriz[2][0]);
        suma5= (matriz[0][1]+matriz[1][1]+matriz[2][1]);
        suma6= (matriz[0][2]+matriz[1][2]+matriz[2][2]);
        suma7= (matriz[0][0]+matriz[1][1]+matriz[2][2]);
        suma8= (matriz[2][0]+matriz[1][1]+matriz[0][2]);
        

        if (suma1==suma2 && suma1==suma3 && suma1==suma4 && suma1==suma5 && suma1==suma6 && suma1==suma7 && suma1==suma8) {
            
            System.out.println("Es una matriz magica");
            
        }else {
            
            System.out.println("No es una matriz magica");
        
            
        }
        
        
    }                    
	
    }     
