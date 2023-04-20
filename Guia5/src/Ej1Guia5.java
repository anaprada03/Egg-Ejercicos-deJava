/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros
y los muestre por pantalla en orden descendente.
*/
public class Ej1Guia5 {
  public static void main(String[] args) {
         int num[] = new int[100];
        
        for (int i = 0; i < 100; i++) {
            num[i] = i+1;
        }
        
        for (int i = 99; i >= 0; i--) {
            System.out.print("[" + num[i] + "]");
        } System.out.println("");
    }
    
}
