/*En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y
después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba 
que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso
ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado 
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 */
package servicios;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicios {
    Scanner leer = new Scanner(System.in);
    Persona p1 = new Persona();
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre");
        String nombre =(leer.next());
        System.out.println("Ingrese su edad");
        double edad =(leer.nextDouble());
        String sexo;
        do{
        System.out.println("Ingrese su sexo");
        sexo = leer.next();
                
       //
        }while(!"m".equals(sexo) && !"h".equals(sexo) && !"o".equals(sexo));
         p1.setSexo(sexo);
        System.out.println("Ingrese su peso");
        double peso =(leer.nextDouble());
        System.out.println("Ingrese su altura");
        double altura=(leer.nextDouble());
        return new Persona (nombre, edad,sexo, peso, altura);
    }
    
    public boolean esMayorDeEdad(Persona p1){
        if(p1.getEdad() >= 21){ 
            return  true;
        }else{
            return false;
            
        }
        
    }
    public int calcularIMC(Persona p1){
        double imc = p1.getPeso()/(Math.pow(p1.getAltura(), 2));
        if(imc <20){
            return -1;
        }else if(imc >= 20 && imc<= 25){
            return 0;
            
        }else{
            return 1;
            
        }
    }
}
        
  /* Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso
ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado 
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 */     
    
    
    

    

