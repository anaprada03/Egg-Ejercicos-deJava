
import java.util.Scanner;

/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*        *
*        *
* * * *
 */
public class Ej8Guia3 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);     
      
        System.out.println("Ingrese la base del recatngulo: ");
        double base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        double altura = leer.nextDouble();
        
        for(int fila = 1; fila <= base; fila++)
     {
            for(int columna = 1; columna <= altura; columna++)
         {
                 if((fila == 1) || (fila == base)||(columna ==1) || (columna == altura))
                  System.out.print("*");
                  else 
                    System.out.print(" ");
         
        }
            System.out.println("");
    }
    }
}
    
    

