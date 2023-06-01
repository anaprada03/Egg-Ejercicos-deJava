/*Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicios;

import Entidad.parDeNumeros;

/**
 *
 * @author ANAPR
 */
public class parDeNumerosServicios {
    public void CrearParDeNumeros (parDeNumeros numeros){
        System.out.println("Numero 1 es:" + numeros.getNumero1());
        System.out.println("Numero 2 es: " + numeros.getNumero2());
    }
    
    public void devolverMayor(parDeNumeros numeros){
        if(numeros.getNumero1()> numeros.getNumero2() ){
            System.out.println("El numero mayor es:" + numeros.getNumero1());
        }else{System.out.println("El numero mayor es:" + numeros.getNumero2());
        
        }
    }
        
/*Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
Previamente se deben redondear ambos valores.*/
    public double calcularPotencia(parDeNumeros numeros){ 
        numeros.setNumero1(Math.round(numeros.getNumero1()));
        numeros.setNumero2(Math.round(numeros.getNumero2()));
        
       double potencia1 = Math.pow((numeros.getNumero1()), numeros.getNumero2());
      double potencia2 = Math.pow(numeros.getNumero2(), numeros.getNumero1());
      
        if(numeros.getNumero1()> numeros.getNumero2()){
            System.out.println("La potencia de " + numeros.getNumero1() + " elevado a " + numeros.getNumero2()+ " es :" + potencia1);
         }else{
            System.out.println("La potencia de " + numeros.getNumero2() + " elevado a " + numeros.getNumero1()+ " es :" + potencia2);
                   
               }
           return potencia1;
        }
    public double calcularRaiz(parDeNumeros numeros){
        numeros.setNumero1(Math.abs(numeros.getNumero1()));
         numeros.setNumero2(Math.abs(numeros.getNumero2()));
         double raizNum1 = Math.sqrt(numeros.getNumero1());
         double raizNum2 = Math.sqrt(numeros.getNumero2());
          if(numeros.getNumero1()> numeros.getNumero2()){
            System.out.println("La raiz cuadrada del valor absoluto de " + numeros.getNumero1() + " es :" + raizNum1);
         }else{
            System.out.println("La raiz cuadrada del valor absoluto de " + numeros.getNumero2() + " es :" + raizNum2);
                   
               }
           return raizNum1;
       
    }
    
}
