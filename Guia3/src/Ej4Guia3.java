
import java.util.Scanner;

/*Escriba un programa que pida una frase o palabra y valide si la primera letra 
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un
mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la funciónn Substring y equals() de Java.*/

public class Ej4Guia3 {

    public static void main(String[] args) {
        String frase;
        System.out.println("Ingresar frase");
        Scanner leer = new Scanner(System.in);
        frase = leer.nextLine();
        String cortada = frase.substring(0, 1);
        
        if(cortada.equals("A")){
            System.out.println("Correcto");
        }else{ System.out.println("Incorrecto");
        }
        
        }
}

