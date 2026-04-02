import Asignaturas.Asignaturas;
import Profesor.ProfesorInterino;
import ext.Personas.Alumno;

public class Main {
    public static void main(String[] args){
        Asignaturas as = new Asignaturas("10", "PROG", 20, "Primero", 20);
        Alumno p = new Alumno("201929D", "Pedro", "Sierra", "10-20-2001");
        ProfesorInterino profesorInterino = new ProfesorInterino("201928D", "Jose", "Marlon", "10-12-1988", "ingenieria", "Java",
                2, false);
        p.setAsignaturas(as);

        System.out.println(profesorInterino);
    }
}
