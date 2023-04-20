
import java.util.Scanner;

/*Escriba un programa en el cual se ingrese un valor límite positivo,
y a continuacióNn solicite números al usuario hasta que la suma de los números
introducidos supere el límite inicial.*/


public class Ej5Guia3 {
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor maximo: ");
        int maximo = leer.nextInt();
        
        int suma = 0;
        int num;
        int contador = 0;
        
        do {
            System.out.println("Ingrese un numero : ");
            num = leer.nextInt();
            suma += num;
            contador++;
        } while (suma <= maximo);
        System.out.println("Se ingresaron " + contador + " numeros para superar el limite  ");
        
     
        
}
}