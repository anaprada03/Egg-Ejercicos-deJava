/*
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author ANAPR
 */
public class CadenaServicios {
   
  
  Cadena c1 = new Cadena();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
public Cadena crearFrase(){
  System.out.println("Ingrese la frase: ");
  c1.setFrase(leer.nextLine());
  c1.setLongitud(c1.getFrase().length());
    System.out.println("La frase es " + c1.getFrase());
    System.out.println("Largo de la frase: " + c1.getLongitud());
  return c1;
       
   } 

    public int mostrarVocales(Cadena c1){  
    int vocales = 0;
    for (int i = 0; i < c1.getLongitud(); i++){    
     if (c1.getFrase().charAt(i)== 'a'||c1.getFrase().charAt(i)== 'e'||c1.getFrase().charAt(i)== 'i'||c1.getFrase().charAt(i)== 'o'||c1.getFrase().charAt(i)== 'u' ) {
          vocales++;
           }
        
       }
        return vocales;
    }
    

    public void invertirFrase(Cadena c1){

        StringBuilder builder=new StringBuilder(c1.getFrase());
        String fraseInvertida = builder.reverse().toString();
        System.out.println("La frase invertida se lee:" + fraseInvertida);
    }
    public int vecesRepetido(Cadena c1){
     char letra = 0;
        
        System.out.println("ingrese letra a buscar: ");
        letra = leer.next().charAt(letra);
        
        int cantidadLetras = 0;
        
        
        for (int i = 0; i < c1.getFrase().length(); i++) 
        {
            char caracter = c1.getFrase().charAt(i);
            
            if (caracter == letra) 
            {
                cantidadLetras ++;                
            } 
        
        }
        System.out.println("la letra se encontro: "+
                cantidadLetras + " veces");
           return cantidadLetras;   
        
    
    }

   public void compararLongitud(Cadena c1){
       System.out.println("Ingrese la frase a comparar");
       String frase1 = leer.next();
       
       if (c1.getFrase().length() > frase1.length())
        {
            System.out.println(c1.getFrase() + " es mayor");            
        }
        else if (c1.getFrase().length() < frase1.length())
        {
            System.out.println(frase1 + " es mayor");            
        }
        else
        {
            System.out.println("Ambas tienen igual cantidad de caracteres");
        }
   }
       /*
       Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una 
       nueva frase ingresada por el usuario y mostrar la frase resultante.

       */
    public void unirFrases(Cadena c1){
        System.out.println("Ingrese frase a concatenar");
        String frase2 = leer.next(); 
        System.out.println(frase2);
        System.out.println(c1.getFrase().concat(frase2));          
       
   } 
  /*Método reemplazar(String letra), deberá reemplazar todas las
letras “a” que se encuentren en la frase, por algún otro carácter 
seleccionado por el usuario y mostrar la frase resultante.*/
  

}
