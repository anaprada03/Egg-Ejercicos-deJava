package pooej01;

import Entidad.Persona;

public class PooEj01 {
    public static void main(String[] args) {
        
       Persona p1 = new Persona ("Martin", 56, "NoBinario");
       Persona p2 = new Persona ("Pablo", 60, "Hombre");
       Persona p3 = new Persona ("Silvia", 64, "Mujer");
        System.out.println(p1.nombre  + " " + p1.edad + " " + p1.genero);
    }
    
}
