/*Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores
jugar un juego de adivinanza de números. El primer jugador elige un número y el segundo
jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y 
recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina 
cuando el segundo jugador adivina el número o se queda sin intentos. Registra el número de 
intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package Entidad_Juego;

import java.util.Scanner;

public class Juego {
    public int num1;
    public int num2;
    public int i;
    
    public void iniciar_juego(){
    Scanner leer = new Scanner(System.in);
        
        num1= 0;
        num2 = 0;
        int jugador1 = 0;
        int jugador2 = 0;
        String respuesta = null;
        
         System.out.println("BIENVENIDO AL JUEGO DE ADIVINA EL NUMERO");
         System.out.println("Mi numero esta entre el 1 y el 20");
         System.out.println("Solo tienes cuatro intentos");
         
            do{
            do{
            
            System.out.println("El numero a adivinar es: "); 
            num1 = leer.nextInt();
            
            }while(num1 <0 || num1 > 20);
            i=0;
            
            do{
            System.out.println("Tira un numero!");
            num2 = leer.nextInt();
            
            if (num2 < num1) {
                System.out.println("El numero a adivinar es mayor");
                System.out.println("Intento: " + (i+1));
                i++;
            } else if (num2 > num1) {
                System.out.println("El numero a avivinar es menor");
                System.out.println("Intento: " + (i+1));
                i++;
            }else{System.out.println("FELICITACIONES ADIVINASTE!!!");
            jugador2+= 1;
            break;
            } 
             if(i == 3){
                jugador1+=1;
             } 
            }while(i < 4 && num1 != num2); 
         System.out.println("Quiere volver a jugar s/n");
            respuesta = leer.next();
            }while(respuesta.equals("s"));      
           System.out.println("Jugador 1 puntaje: " + jugador1);
            System.out.println("Jugador 2 puntaje: " + jugador2);           
                                       
             
        
        
           
}

    @Override
    public String toString() {
        return "Juego{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
        
}

         
        
       
        
         



           
        
        
        
    