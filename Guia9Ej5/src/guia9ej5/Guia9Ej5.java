/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej5;

import Entidades.Persona;
import Servicios.ServicioPersona;

public class Guia9Ej5 {
    public static void main(String[] args) {
        ServicioPersona p1 = new ServicioPersona();
        Persona pers = p1.crearPesona();
        int saberEdad = p1.calcularEdad(pers);
        System.out.println("La edad de la persona es:" + saberEdad);
        System.out.println(p1.menorQue(pers, 45));
        p1.mostrarPersona(pers);
    }
    
}
