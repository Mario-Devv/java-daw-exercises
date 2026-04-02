import Asignaturas.Asignaturas;
import Personas.Personas;
import ext.Personas.Alumno;

public class Main {
    public static void main(String[] args){
        Asignaturas as = new Asignaturas("10", "PROG", 20, "Primero", 20);
        Alumno p = new Alumno("201929D", "Pedro", "Sierra", "10-20-2001");

        p.setAsignaturas(as);

        System.out.println(p);
    }
}
