/*a-Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la 
siguiente fórmula: (b^2)-4*a*c
b-Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra,
el discriminante debe ser mayor o igual que 0.
c-Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, 
el discriminante debe ser igual que 0.
d-Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
e- Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga
una única solución posible.
f
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
package Servicios.Raices;

import Entidades.Raices;
import java.util.Scanner;


/**
 *
 * @author ANAPR
 */
public class ServiciosRaices {
    Raices r1 = new Raices();
    Scanner leer = new Scanner(System.in);
    
    public Raices crearRaiz(){
        System.out.println("Ingrese el valor de a ");
        r1.setA(leer.nextDouble());
        System.out.println("Ingrese el valor de b");
        r1.setB(leer.nextDouble());
        System.out.println("Ingrese el valor de c");
        r1.setC(leer.nextDouble());
        return r1;
        
    }
    public void getDiscriminante(){
        
        r1.setDiscriminante(Math.pow(r1.getB(), 2)- 4 * r1.getA()* r1.getC());
        System.out.println("El discriminate es " + r1.getDiscriminante());
        
    }
    
    public boolean tieneRaiz(Raices r1){
        boolean verif= false;
        if(r1.getDiscriminante() >= 0){
            verif = true;
        }
            return verif;
        
    }
     public boolean tieneRaices(Raices r1){
        boolean verif= false;
        if(r1.getDiscriminante() == 0){
            verif = true;
        }
            return verif;
}
    public void obtenerRaices(Raices r1){
        // (-b±√((b^2)-(4*a*c)))/(2*a)
        if(tieneRaiz(r1)){
            double solucion1 = (-r1.getB()+ Math.sqrt(r1.getDiscriminante())/(2*r1.getA()));
            double solucion2 = (-r1.getB()- Math.sqrt(r1.getDiscriminante())/(2*r1.getA())); 
            System.out.println("Solución 1 es :" + solucion1);
            System.out.println("Solución 2 es :" + solucion2);
        }
        
    } 
    public void obtenerRaiz(Raices r1){
        if(tieneRaiz(r1)){
            double solucion1 = (-r1.getB()/(2*r1.getA()));
           System.out.println("La única posible solucion es :" + solucion1);
            
        }
        
    }/*-Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones
que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos
y en caso de no existir solución, se mostrará un mensaje.*/
    public void Calcular(){
        if(this.tieneRaices(r1)){
            obtenerRaices(r1);
        }else if(this.tieneRaiz(r1)){
            obtenerRaiz(r1);
        }else{
            System.out.println("No tiene raiz");
        }
        
        
    }
}