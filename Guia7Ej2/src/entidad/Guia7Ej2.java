package entidad;

/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, 
se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).


 */

public class Guia7Ej2 {
    public static void main(String[] args) {
        //Circunferencia circunferencia = new Circunferencia(0.0);
    //circunferencia.crearCircunferencia();
    Circunferecia circunferencia = new Circunferecia(0.0);
        circunferencia.crearCircunferencia();
        System.out.println("El area de la circunferencia es: " + circunferencia.area());
        System.out.println("El Perimetro de la circunferencia es: " + circunferencia.perimetro());
    }
    
}
