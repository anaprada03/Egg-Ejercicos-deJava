
import java.util.Scanner;

/*Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
e imprima el número ingresado seguido de tantos asteriscos como indique
su valor.*/ 

public class TeoriaEj10Guia3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //lee los numeros
        System.out.println("Ingrese 4 numeros entre 1 y 20:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        int num4 = leer.nextInt();
        //imprime num1 mas los * (no usa ln en print)
        System.out.print(num1);
        for(int i = 1; i < num1+1; i++){
            System.out.print("*");
            }
        //Hace un salto de linea, imprime el segundo (usa el for para multiplicar *)
        System.out.println("");
        System.out.print(num2);
        for(int i = 1; i < num2+1; i++){
            System.out.print("*");
            }
        System.out.println("");
        System.out.print(num3);
        for(int i = 1; i < num3+1; i++){
            System.out.print("*");
            }
        System.out.println("");
        System.out.print(num4);
        for(int i = 1; i < num4+1; i++){
            System.out.print("*");
            }
        System.out.println("");


            
                
                
    }
    }
    
