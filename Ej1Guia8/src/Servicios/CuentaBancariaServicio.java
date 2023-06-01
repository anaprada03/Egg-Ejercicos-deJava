/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no 
tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá ;mostrar todos los datos de la cuenta.
 */
package Servicios;

import Entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);
    
    
public void Crearcuenta(CuentaBancaria cuenta1){
    System.out.println("Ingrese su numero de cuenta");
     cuenta1.numeroCuenta = leer.nextInt();
    System.out.println("Ingrese su numero de DNI");
    cuenta1.dniCliente = leer.nextLong();
    System.out.println("Ingrese su saldo actual");
    cuenta1.saldoActual = leer.nextDouble();
}    
public double ingresar(CuentaBancaria cuenta1){
     System.out.println("ingrese deposito: ");
        
        double monto = leer.nextDouble();
        cuenta1.saldoActual =cuenta1.saldoActual + monto;
        System.out.println("El saldo actual de su cuenta es: " + cuenta1.saldoActual);
        return cuenta1.saldoActual;      
    

}
public double retirar(CuentaBancaria cuenta1){
    System.out.println("Ingrese el monto a reirar:");
    double monto = leer.nextDouble();
    if (monto <= cuenta1.saldoActual) {
    cuenta1.saldoActual = cuenta1.saldoActual - monto;
    }else{System.out.println("su retiro es: " + cuenta1.saldoActual); 
    cuenta1.saldoActual = 0;
    }
    System.out.println("El saldo en su cuenta es " + cuenta1.saldoActual);
    return cuenta1.saldoActual;
    
}
public double extraccionRapida(CuentaBancaria cuenta1){
    System.out.println("Ingrese el monto a retirar:");
    double monto = leer.nextDouble();
    if(monto <= cuenta1.saldoActual * 0.20){
        cuenta1.saldoActual -=monto;
        System.out.println("Su saldo actual luego del retiro es " + cuenta1.saldoActual);
        
    }else{System.out.println("El monto a retira solo puede ser menor a " + cuenta1.saldoActual * 0.20 );
   
    } return cuenta1.saldoActual - monto;
}
public void consultaSaldo(CuentaBancaria cuenta1){
    System.out.println("El saldo es "+ cuenta1.getSaldoActual());
}
public void consultaDatos(CuentaBancaria cuenta1){
    System.out.println("Los datos de su cuenta son " + cuenta1.toString());
}
}
