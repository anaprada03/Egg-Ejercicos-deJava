
import java.util.Scanner;

/*Realizar un programa que pida dos números enteros positivos por teclado
y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción
y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
*/

public class Ej6guia3 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int num1, num2, opc;
         String respuesta = null;
    do{
    
    System.out.println("Ingrese el primer numero");
    num1=leer.nextInt();
    System.out.println("Ingrese el segundo numero");
    num2=leer.nextInt();
        int opcion;
    
        
    
    System.out.println("Ingrese una opcion del 1 al 5");
    opc=leer.nextInt();
    
        
          
    
    switch(opc) {
        case 1:
                System.out.println("El resultado de la suma es: " +  (num1 + num2));
                break;
        case 2:
              System.out.println("El resultado de la resta es: " + ( num1 - num2));
              break;
        case 3:
              System.out.println("El resultado de la multiplicacion es: " + ( num1 * num2));
                break;
        case 4:
              System.out.println("El resultado de la division es: " +  (num1 / num2));
                break;

        case 5:
               System.out.println("¿Está seguro que desea salir del programa (S/N)?");
               respuesta =leer.next();
               if(respuesta.equalsIgnoreCase("s")){
                System.out.println("Salida");
                break;}         
          
               
    }
    } while (respuesta.equals("n")); 
    


    }
}

