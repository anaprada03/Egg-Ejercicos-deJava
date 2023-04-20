
import java.util.Scanner;

/*Ejercicio 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero 
se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso 
de la sentencia break.*/

public class TeoriaEj9Guia3 {

    public static void main(String[] args) {
        	
    	int cont = 5;
        int suma = 0;
        Scanner leer = new Scanner(System.in);
        

    	do {

    	System.out.println("Ingrese un numero");
    	int num = leer.nextInt();
        suma = suma + num;
        cont= cont - 1;
        if (num == 0){
            System.out.println("Se capturo el numero 0");
            break;
        }

    	} while (cont >= 0 );
        
        System.out.println("La suma de los numeros ingresados es:" + suma);
        
        
        
        
        
        
        
}

    }
    

