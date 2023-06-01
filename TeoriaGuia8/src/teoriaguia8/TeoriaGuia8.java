/*
 */
package teoriaguia8;

import entidad_persona.Persona;

public class TeoriaGuia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Persona p1 = new Persona(); 
       p1.crearPersona();
       
       System.out.println("su edad es: " + p1.getEdad());
       System.out.println("su nombre es: " + p1.getNombre());       
    }
    // TODO code application logic here
    }
    
