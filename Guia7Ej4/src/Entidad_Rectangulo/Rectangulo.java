/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un 
atributo privado altura. La clase incluirá un método para crear el rectángulo con los datos 
del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie 
del rectángulo y un método para calcular el perímetro del rectángulo. Por último, tendremos
un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán
además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

*/
package Entidad_Rectangulo;

import java.util.Scanner;
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);     
      
        System.out.println("Ingrese la base del rectangulo: ");
        base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        altura = leer.nextDouble();
    }
    public double superficie(){
        return base * altura;
    }
    public double perimetro(){
        return (base + altura)*2;
        
    }
     public void dibujarRectangulo(){
        
        for(int fila = 1; fila <= base; fila++)
     {
            for(int columna = 1; columna <= altura; columna++)
         {
                 if((fila == 1) || (fila == base)||(columna ==1) || (columna == altura))
                  System.out.print("*");
                  else 
                    System.out.print(" ");
         
        }
            System.out.println("");
    }
     }
}
     

     
   
        
        
        
        
        
        
        
        
        
    
    

