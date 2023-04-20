
import java.util.Scanner;

/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre
0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.*/

public class TeoriaEj8Guia3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
  	System.out.println("Ingrese un numero entre 0 y 10"); 
   	int respuesta=leer.nextInt();
  	 
   	while (respuesta <= 0 ||respuesta >= 10) {
      	System.out.println("Ingrese un numero entre 0 y 10"); 
    	
    	respuesta = leer.nextInt();
   	   }
        System.out.println("Nota correcta");
   }

    }
    

