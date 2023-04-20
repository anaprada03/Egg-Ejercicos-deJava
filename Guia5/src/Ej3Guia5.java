
import java.util.Scanner;

/*
3-Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
public class Ej3Guia5 {

    public static void main(String[] args) {
         
          System.out.println("Ingrese un numero entero ");
         Scanner sc = new Scanner(System.in);
          int contU=0;  
            int contD=0;
            int contC=0;
            int contUM=0;
            int contDDM=0;
         int N = sc.nextInt();
         int [] vector = new int [N];
         for (int i = 0; i < N; i++){
             vector[i]= (int) (Math.random() * 99999);
         }
         for (int i = 0; i < N; i++){
              System.out.print("[" + vector[i] + "]");
        } System.out.println("");
        for (int i = 0; i < N; i++){
           
                    
            if(vector[i] >= 0 && vector[i] <= 9 ){
            contU=contU + 1;
            }
            if (vector[i] >= 10 && vector[i] <= 99 ){
            contD = contD +1;
            }
            if (vector[i] >= 100 && vector[i] <= 999 ){
            contC = contC +1;
            }
            if (vector[i] >= 1000 && vector[i] <= 9999 ){
            contUM = contUM +1;
            }
            
            if (vector[i] >= 10000 && vector[i] <= 99999 ){
            contDDM = contDDM +1;
            }
            System.out.println("En la muestra hay: " + contU + " numeros de 1 digito, " + contD + "numeros de dos cifras, " + contC + "numeros de tres cifras," + contUM + " numeros de cuatro cifras y " + contDDM + "numeros de cinco cifras");      
        
        }
    

    }
}