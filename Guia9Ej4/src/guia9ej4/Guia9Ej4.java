/*Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, 
que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor
vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de
años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package guia9ej4;

import java.util.Date;
import servicios.FechaService;

public class Guia9Ej4 {
    public static void main(String[] args) {
       FechaService c1 = new FechaService();
       Date cumple = c1.fechaNacimiento();
       Date hoy= c1.fechaActual();
        System.out.println(cumple);
        System.out.println("La fecha actual es : " + c1.fechaActual());
        System.out.println("El usuario tiene: " + c1.Diferencia(cumple, hoy));
    }
  
}
