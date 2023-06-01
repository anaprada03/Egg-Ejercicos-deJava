/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exej1guia8;

import Entidades.Raices;
import Servicios.Raices.ServiciosRaices;

/**
 *
 * @author ANAPR
 */
public class ExEj1Guia8 {

      public static void main(String[] args) {
          ServiciosRaices rsv = new ServiciosRaices();
          Raices r2 = rsv.crearRaiz();
          
          rsv.getDiscriminante();
          rsv.tieneRaices(r2);
          rsv.tieneRaiz(r2);
          rsv.obtenerRaices(r2);
          rsv.obtenerRaiz(r2);
          rsv.Calcular();
    }
    
}
