
import java.util.Scanner;

/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el 
primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y
toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
*/
public class Ej7Guia3 {
    public static void main(String[] args) {       
    int contador = 0;
    int contadorError = 0;
    Scanner scanner = new Scanner(System.in);
    String cadena;
    System.out.println("Hola, este es un programa RS232");

    do {
      System.out.println("Por favor ingrese caracteres: ");
      System.out.println("Para finalizar ingrese &&&&&");

      cadena = scanner.nextLine();

      if (cadena.length() >= 2 && cadena.length() <= 5) {
        if (cadena.substring(0, 1).equals("X") && (cadena.substring(cadena.length() - 1).equals("O"))) {
          contador++;
        } else {
          contadorError++;

        }
      }
    } while (!cadena.equals("&&&&&"));
    System.out.println("La cantidad bien son: " + contador);
    System.out.println("La cantidad mal son: " + (contadorError - 1));
  }
}

