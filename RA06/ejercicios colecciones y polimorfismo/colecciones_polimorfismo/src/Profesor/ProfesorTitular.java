package Profesor;

public class ProfesorTitular extends Profesor{
    private int anyos_trabajados;
    private double sueldoBase;

    public ProfesorTitular(String dni, String nombre, String apellidos, String fecha_naciemiento, String titulacion, String especializacion, int anyos_trabajados) {
        super(dni, nombre, apellidos, fecha_naciemiento, titulacion, especializacion);
        this.anyos_trabajados = anyos_trabajados;
    }

    public int getAnyos_trabajados() {
        return anyos_trabajados;
    }

    public void setAnyos_trabajados(int anyos_trabajados) {
        this.anyos_trabajados = anyos_trabajados;
    }

    public double calculoDeSueldo (){
        return this.sueldoBase + (10 * anyos_trabajados);
    }

    @Override
    public String toString() {
        return "ProfesorTitular{" +
                "anyos_trabajados=" + anyos_trabajados +
                '}';
    }
}
