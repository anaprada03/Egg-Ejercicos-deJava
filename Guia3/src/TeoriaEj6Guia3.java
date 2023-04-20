/*6-Implementar un programa que le pida dos números enteros al usuario y determine si ambos o 
alguno de ellos es mayor a 25.
*/
import java.util.Scanner;

public class TeoriaEj6Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Ingresar un numero entero: ");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();
        System.out.println("Ingresar otro numero entero: ");
        num2 =leer.nextInt();
                if(num1 >25 && num2 >25){
                     System.out.println(num1 + "Y" + num2 + " Son mayores a 25");
                } else if(num2 >25){
                    System.out.println(num2 + " Es mayor a 25");
                } else if(num1 > 25){
                    System.out.println(num1 + " es mayor a 25");
                } else{System.out.println( "Ninguno es mayor a 25");
      
        
    }
    
}
}
