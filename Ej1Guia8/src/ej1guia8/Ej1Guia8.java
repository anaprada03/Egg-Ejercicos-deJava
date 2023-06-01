/*Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package ej1guia8;

import Entidad.CuentaBancaria;
import Servicios.CuentaBancariaServicio;




public class Ej1Guia8 {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
       CuentaBancariaServicio cb1 = new CuentaBancariaServicio();
       
         cb1.Crearcuenta(cuenta1);
         cb1.ingresar(cuenta1);
         cb1.retirar(cuenta1);
         cb1.extraccionRapida(cuenta1);         
         cb1.consultaSaldo(cuenta1);
         cb1.consultaDatos(cuenta1);
         
        
           
       }
        
       
                
                
    
    
}
