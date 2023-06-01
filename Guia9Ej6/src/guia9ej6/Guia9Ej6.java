package guia9ej6;

import Entidad.Curso;
import Servicio.CursoServicios;

public class Guia9Ej6 {
    public static void main(String[] args) {
        CursoServicios miCurso= new CursoServicios();
        Curso C2 = miCurso.crearCurso();
        miCurso.calcularGananciaSemana(C2);
        
        
    }
    
}
