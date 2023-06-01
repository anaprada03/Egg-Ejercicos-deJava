/*Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y
simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza”
para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y 
de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 

 */
package Servicios;

import Entidad.Cafetera;
import java.util.Scanner;

public class cafeteraServicios {
    
Cafetera nespresso = new Cafetera();
    Scanner leer = new Scanner(System.in);

public void menu(){
    System.out.println("  ");
    System.out.println("1.Llenar Cafetera ");
    System.out.println("2.Servir taza");
    System.out.println("3.Vaciar cafetera");
    System.out.println("4.Agregar café");
    System.out.println("5. Salida"); 
    System.out.println("Ingree una opcion entre 1 y 5");
    int opcion = leer.nextInt();
    
     switch( opcion){
         case 1:
             llenarCafetera();
             break;
         case 2:
             servirTaza();
             menu();
             break;
         case 3:
             vaciarCafetera();
             break;
         case 4:
             agregarCafe();
             menu();
             break;
         case 5:
             System.out.println("Salida");
             
     }    
} 
 
     //metodo propio
     public void llenarCafetera(){
         nespresso.setCapciadAct(nespresso.getCapacidadMax());
         System.out.println("Cafetera completa");
         System.out.println("Cantidad actual: " + nespresso.getCapciadAct() + "cm3");
         menu();
     }
     /*
     Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y
simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza”
para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y 
de no haberse llenado en cuanto quedó la taza.
     */
     public int servirTaza(){
         System.out.println("Ingrese el la capacidad de la taza en cm3");        
         int capacidad = leer.nextInt();
         if (nespresso.getCapciadAct() >= capacidad){
             nespresso.setCapciadAct(nespresso.getCapciadAct() - capacidad);
             System.out.println("La cantidad actual es: " + nespresso.getCapciadAct());
         }else{ System.out.println("En el vaso queda: " + nespresso.getCapciadAct());
         
         nespresso.setCapciadAct(nespresso.getCapciadAct() - nespresso.getCapciadAct());
             
             
         }
         return nespresso.getCapciadAct();
                 
         
         
     
     }
     //Método vaciarCafetera(): pone la cantidad de café actual en cero. 
     public void vaciarCafetera(){
         nespresso.setCapciadAct(0);
         System.out.println("La cafetera ha sido vaciada");
         System.out.println("Cm3 = " + nespresso.getCapciadAct());
         menu();
}
     //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade
     //a la cafetera 
     //la cantidad de café indicada.
     
     public int agregarCafe(){
         System.out.println("Ingrese la cantidad de cafe a agregar");
        
         int cantidadCafe = leer.nextInt();
         
         while(cantidadCafe + nespresso.getCapciadAct()> nespresso.getCapacidadMax()){
             System.out.println("Se exedio en la cantidad max. Ingrese un cantidad menor");
              cantidadCafe = leer.nextInt();
         }
         
           nespresso.setCapciadAct( nespresso.getCapciadAct() + cantidadCafe);  
         
         
         System.out.println("En la cafetera hay " + nespresso.getCapciadAct());
         return nespresso.getCapciadAct();
         
     }
    
}
