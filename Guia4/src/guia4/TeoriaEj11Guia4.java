/*Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada
por teclado y terminada en punto, y luego codifique la palabra o frase 
ingresada de la siguiente manera: cada vocal se reemplaza por el carácter 
que se indica en la tabla y el resto de los caracteres (incluyendo a las 
vocales acentuadas) se mantienen sin cambios.
*/

package guia4;
        // TODO code application logic here    }
    import java.util.Scanner;

public class TeoriaEj11Guia4{
    
    public static void main(String[] args) {
        
        // Se lee la secuencia de caracteres
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String secuencia = sc.nextLine().toLowerCase();
        
        // Se codifica la secuencia de caracteres
        String codificacion = codificar(secuencia);
        
        // Se muestra la secuencia de caracteres codificada
        System.out.println("La secuencia de caracteres codificada es: " + codificacion);
    }
    
    public static String codificar(String secuencia) {
        
        // Se crea una cadena vacía para almacenar la codificación
        String codificacion = "";
        
        // Se recorre la secuencia de caracteres y se codifica cada carácter
        for(int i = 0; i < secuencia.length(); i++) {
            char c = secuencia.charAt(i);
            switch(c) {
                case 'a':
                    codificacion += '@';
                    break;
                case 'e':
                    codificacion += '#';
                    break;
                case 'i':
                    codificacion += '$';
                    break;
                case 'o':
                    codificacion += '%';
                    break;
                case 'u':
                    codificacion += '*';
                    break;
                default:
                    codificacion += c;
                    break;
            }
        }
        
        return codificacion;
    }
}

