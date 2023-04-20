/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intorjava;

import static java.time.Clock.system;

/**
 *
 * @author ANAPR
 */
public class Hola_Mundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // se crea una variable scanner para leer que se uiliza para leer datos por consola
        scanner leer = new scanner (system.in);
        
        // se crea una variable cadena que se utiliza para leer datos
        String nombre;
        
        //muestra un mensaje por pantalla
        System.out.println("Ingrese su nombre: ");
        // leemos el nombre de la persona en la variable nombre
        nombre=next.nombre()
        // mostramos por consola un saludo personalizado
        System.out.println("Hola mundo soy"+ nombre + " , y estoy programando en Javaa!!" );
        
    }

    private static class scanner {

        public scanner() {
        }
    }
    
}
