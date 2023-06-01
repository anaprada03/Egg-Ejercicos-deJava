package Entidad;

import java.util.Scanner;
public class Libro {
     public int iSBN;
    public String titulo;
    public String autor;
    public int numeroPaginas;

    public Libro() {
    }

    public Libro(int iSBN, String titulo, String Autor, int NumeroPaginas) {
        this.iSBN = iSBN;
        this.titulo = titulo;
        this.autor = Autor;
        this.numeroPaginas = NumeroPaginas;
        
    }

    public int getiSBN() {
        return iSBN;
    }

    public void setiSBN(int iSBN) {
        this.iSBN = iSBN;
    }

    public String gettitulo() {
        return titulo;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
       
    
    public void crearLibro(){
            Scanner leer= new Scanner(System.in);
            System.out.println("Ingrese el codigo ISBN");
            this.iSBN = leer.nextInt();
            System.out.println("Ingrese el titulo");
            this.titulo = leer.next();
            System.out.println("Ingrese el Autor");
            this.autor = leer.next();
            System.out.println("Ingrese cantidad de pagina");
            this.numeroPaginas = leer.nextInt();   
    }
   public void informeLibro(){
       System.out.println("ISBN: " + this.iSBN);
       System.out.println("Titulo: " + this.titulo);
       System.out.println("Autor: " + this.autor);
       System.out.println("Numero de paginas: " + this.numeroPaginas);
   }
}
