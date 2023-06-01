/*
 */
package exguia7ej4;

import Entidad_cuenta.cuenta;

public class ExGuia7Ej4 {
    public static void main(String[] args) {
        cuenta cuenta1 = new cuenta();
        cuenta1.ingreso_usuario();
        cuenta1.retirar_dinero();
        System.out.println("El saldo actual en su cuenta es: " +  cuenta1.retirar_dinero());
    }
    
}
