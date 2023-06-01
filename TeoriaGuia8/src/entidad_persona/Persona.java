/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad_persona;

import java.util.Scanner;

/**
 *
 * @author ANAPR
 */

    
    /*
 Crea un método void que reciba 
un objeto tipo persona como parámetro
y utilice el get para mostrar sus
atributos. Llama ese método desde el main
 */


public class Persona 
{
    String nombre;
    int edad; 

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public Persona() 
    {
        
    }

    public Persona(String nombre, int edad) 
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    
   public void crearPersona()
   {
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingrese nombre: ");
       nombre = leer.nextLine();
       
       System.out.println("Ingrese edad: ");
       edad = leer.nextInt();
   }

}



    

