
import java.util.Scanner;

/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java.
*/
public class Ej2Guia3 {

    public static void main(String[] args) {
        String frase;
        System.out.println("Ingresar frase");
        Scanner leer = new Scanner(System.in);
        frase = leer.nextLine().toLowerCase();
        
        if(frase.equals("Eureka")){
        System.out.println("La frase es Eureka");
        
        } else{System.out.println("La frase NO es Eureka");
    }
    
}
}