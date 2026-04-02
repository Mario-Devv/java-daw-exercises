package ext.Personas;
import Asignaturas.Asignaturas;
import Personas.Personas;


import java.util.HashSet;
import java.util.LinkedHashSet;

public class Alumno extends Personas{
    LinkedHashSet<Asignaturas> as;

    public Alumno(String dni, String nombre, String apellidos, String fecha_naciemiento) {
        super(dni, nombre, apellidos, fecha_naciemiento);
        this.as = new LinkedHashSet<Asignaturas>();
    }

    public void setAsignaturas(Asignaturas as){
        this.as.add(as);
    }

    public void deleteAsignatura() {
        this.as.removeLast();
    }

    public void getAsignatura(){
        for(Asignaturas a : as){
            System.out.println(a);
        }
    }

    private Asignaturas buscarASsignatura(String nombreAsignatura){
        for(Asignaturas a : as){
            if(nombreAsignatura.equals(a.getNombre())){
                return a;
            }
        }
        return null;
    }

    public double calcularImporteMatricula () {
        double total = 0;
        for(Asignaturas a : as){
            total = total + a.calculoPrecioHora();
        }

        return total;
    }

    @Override
    public String toString() {
        return "Alumno=" + as +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha_naciemiento='" + fecha_naciemiento;
    }
}
