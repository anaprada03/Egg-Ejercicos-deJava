
package guia9ej1;
 
import Entidades.Cadena;
import Servicios.CadenaServicios;



public class Guia9Ej1 {
    public static void main(String[] args) {
        
        CadenaServicios ca1 = new CadenaServicios();
        Cadena cadena1 = ca1.crearFrase();        
        
       System.out.println("Las vocales de la cadena son:" + ca1.mostrarVocales(cadena1));
       ca1.invertirFrase(cadena1);
        ca1.vecesRepetido(cadena1);
        ca1.compararLongitud(cadena1);        
       ca1.unirFrases(cadena1);
}
}