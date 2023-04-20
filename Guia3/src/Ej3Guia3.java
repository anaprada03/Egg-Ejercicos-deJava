
import java.util.Scanner;

/*3-Realizar un programa que solo permita introducir solo frases o palabras de 
8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se 
deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
*/
public class Ej3Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        System.out.println("Ingresar frase");
        Scanner leer = new Scanner(System.in);
        frase = leer.nextLine().toLowerCase();
        
        if(frase.length() == 8){
            System.out.println("La frase es correcta");
        } else{ System.out.println("La frase es incorrecta");
    
                    
        }
        
        
    }
    
}
