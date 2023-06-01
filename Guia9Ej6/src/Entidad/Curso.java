/*Un profesor particular está dando cursos para grupos de cinco alumnos y necesita 
un programa para organizar la información de cada curso. Para ello, crearemos una 
clase entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia, 
cantidadDiasPorSemana, turno (mañana o tarde),  precioPorHora y alumnos. Donde alumnos 
es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los nombres de 
cada alumno.
 */
package Entidad;
public class Curso {
    private String nombreCurso;
    private int cantHorasPorDia;
    private int cantDiasPorSem;
    private String turno;
    private double precioHora;
    private String[] alumno;

    public Curso() {
        this.alumno= new String[5];
    }

    public Curso(String nombreCurso, int cantHorasPorDia, int cantDiasPorSem, String turno, double precioHora, String[] alumno) {
        this.nombreCurso = nombreCurso;
        this.cantHorasPorDia = cantHorasPorDia;
        this.cantDiasPorSem = cantDiasPorSem;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumno = alumno;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantHorasPorDia() {
        return cantHorasPorDia;
    }

    public void setCantHorasPorDia(int cantHorasPorDia) {
        this.cantHorasPorDia = cantHorasPorDia;
    }

    public int getCantDiasPorSem() {
        return cantDiasPorSem;
    }

    public void setCantDiasPorSem(int cantDiasPorSem) {
        this.cantDiasPorSem = cantDiasPorSem;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumno() {
        return alumno;
    }

    public void setAlumno(String[] alumno) {
        this.alumno = alumno;
    }
    
    
}
