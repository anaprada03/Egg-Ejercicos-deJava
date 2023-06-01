package servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
     
     Scanner leer = new Scanner(System.in);

    public FechaService() {
    }
     public Date fechaNacimiento(){
         System.out.println("Ingrese el numero del dia de nacimiento: ");
         int dia = leer.nextInt();
          System.out.println("Ingrese el numero del mes de nacimiento: ");
         int mes = leer.nextInt() - 1;
          System.out.println("Ingrese el año de la fecha de nacimiento: ");
         int anio = leer.nextInt()- 1900;
         
         return new Date (anio, mes, dia);
     }
 /* Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos
     el constructor
vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date. */  
     public Date fechaActual(){
         return new Date();
     }
     /*Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de
años entre una y otra (edad del usuario). */
     public int Diferencia(Date fechaNacimiento, Date fechaActual){
         
         return fechaActual.getYear()-fechaNacimiento.getYear();
         
     }
        
    
}
