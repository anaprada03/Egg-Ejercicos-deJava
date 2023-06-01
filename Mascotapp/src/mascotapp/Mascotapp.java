package mascotapp;

import java.util.Scanner;
import mascotapp.Entidades.Mascota;

public class Mascotapp {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
       Mascota M1 = new Mascota();
       Mascota M2 = new Mascota();
       Mascota M3 = new Mascota();
       
       System.out.println("Apodo: ");
       M1.apodo = leer.nextLine();
       M1.cola = true;
       System.out.println("Color: ");                                                           
       M1.color= leer.nextLine();
        System.out.println("Edad: ");
       M1.edad= leer.nextInt();
        System.out.println("Nombre");
       M1.nombre= leer.next();
       M1.raza= "Rotweiler";
       
       M1.tipo="Perro";
        System.out.println( M1.apodo  + " "+  M1.nombre+ " "+  M1.color+ " ");
        
       
  
               
       
       
    }
    
}
