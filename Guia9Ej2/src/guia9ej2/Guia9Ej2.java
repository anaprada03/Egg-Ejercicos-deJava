/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej2;

import Entidad.parDeNumeros;
import Servicios.parDeNumerosServicios;

/**
 *
 * @author ANAPR
 */
public class Guia9Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        parDeNumeros numerosAleatorios = new parDeNumeros();
        parDeNumerosServicios PN1 = new parDeNumerosServicios();
        PN1.CrearParDeNumeros(numerosAleatorios);
        PN1.devolverMayor(numerosAleatorios);
        PN1.calcularPotencia(numerosAleatorios);
        PN1.calcularRaiz(numerosAleatorios);
        
        
        
       
        
    }
    
}
