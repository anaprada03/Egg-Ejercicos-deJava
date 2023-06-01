/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, 
se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a 
multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace 
la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una 
división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. 
Si no, se hace la división y se devuelve el resultado al main.

 */
package operaciones_entidad;

import java.util.Scanner;

public class operaciones {
    private int numero1;
    private int numero2;

    public operaciones() {
        crearOperacion();
    }

    public operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Ingrese el primer valor");
        numero1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo valor");      
        numero2 = leer.nextInt();
        
    }
    public int sumar(){
    return  numero1 + numero2;
       
} 
    public int resta(){
      return  numero1 - numero2;      
           
    }
    
    public int multip(){
        if(numero2 ==0 || numero1 == 0){
            System.out.println("Uno de los dos valores es igual a cero");
            return 0;
        }
        return numero1 *numero2;
        
    }
    public double div(){
        if(numero2 ==0 || numero1 == 0){
            System.out.println("Uno de los dos valores es igual a cero");
            return 0;
        }
       
        return numero1 / numero2;
    }
    
}

