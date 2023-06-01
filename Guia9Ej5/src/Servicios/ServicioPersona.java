package Servicios;

import Entidades.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author ANAPR
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    //Método crearPersona que pida al usuario Nombre y fecha de nacimiento
    //de la persona a crear. Retornar el objeto Persona creado.
    
    public Persona crearPesona(){
        Persona pe;
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese su fecha de nacimiento: aaaa-mm-dd ");
        String fNac = leer.next();
        LocalDate dateOfBirth = LocalDate.parse(fNac); 
     return new Persona(nombre, dateOfBirth);    
    }
    /*Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de 
            nacimiento y la fecha actual.*/
    
    public int calcularEdad(Persona pe) {
       LocalDate currDate = LocalDate.now();
        Period period = Period.between(currDate, pe.getNacimiento());
        //Isolate the number of years to get proper age format	 
        int age = Math.abs(period.getYears());
        return age;
    }
 /*Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es
menor que la edad consultada o false en caso contrario.*/
 public boolean menorQue(Persona pe, int edad){
     
     return ((calcularEdad( pe )) < edad);
 } 
 //Método mostrarPersona que muestra la información de la persona deseada.
 public void mostrarPersona(Persona pe){
     System.out.println(pe.toString());
 }
}