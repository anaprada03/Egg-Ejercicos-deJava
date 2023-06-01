/*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo
después de realizar una transacción de retiro.
 */
package Entidad_cuenta;

import java.util.Scanner;

public class cuenta {
  public double saldo;
  public String titular;
  public double retiro;
  public String usuario_comp;
  public String clave_comp;

    public cuenta() {
    }

    public cuenta(double saldo, String titular, String usuario_comp, String clave_comp) {
        this.saldo = saldo;
        this.titular = titular;
        this.usuario_comp = usuario_comp;
        this.clave_comp = clave_comp;
    }

    public cuenta(double retiro) {
        this.retiro = retiro;
    }
    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getUsuario_comp() {
        return usuario_comp;
    }

    public void setUsuario_comp(String usuario_comp) {
        this.usuario_comp = usuario_comp;
    }

    public String getClave_comp() {
        return clave_comp;
    }

    public void setClave_comp(String clave_comp) {
        this.clave_comp = clave_comp;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }
    
    

  public void ingreso_usuario(){
      Scanner leer = new Scanner(System.in);
      String usuario = "Ana03";
      String clave = "anaP";
      int i = 0;
      
      do{
      System.out.println("Por favor ingrese su usuario");
      String usuario_comp = leer.next();
      System.out.println("Ingrese su contraseña");
      String clave_comp = leer.next();
      i++;
        if(!usuario.equals(usuario_comp) || !clave.equals(clave_comp)){
          System.out.println("El usuario y/o contraseña son incorrectos");
          System.out.println("Intente nuevamente");
         }
       }while(usuario.equals(usuario_comp) || clave.equals(clave_comp)|| i >=3);
      
     System.out.println("Bienvenido a su cuenta del Banco Pepito");
       
  }  
        
    public double retirar_dinero(){
        
    Scanner leer = new Scanner(System.in);
    saldo  = (Math.random() * 10000);

    System.out.println ( "El saldo en pesos de su cuenta es:" + saldo );
    
        do{
            System.out.println ("Ingrese la cantidad a retirar");
           retiro = leer.nextInt();
      
         }while(saldo <= retiro );
  
      return saldo - retiro;
        
    }
      
}
  
  

