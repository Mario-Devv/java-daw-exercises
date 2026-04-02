package Profesor;

public class ProfesorInterino extends Profesor{
    private int anyosInterinidad;
    private boolean segundoTrabajo;


    public ProfesorInterino(String dni, String nombre, String apellidos, String fecha_naciemiento, String titulacion, String especializacion,
                            int anyosInterinidad, boolean segundoTrabajo) {
        super(dni, nombre, apellidos, fecha_naciemiento, titulacion, especializacion);
        this.anyosInterinidad = anyosInterinidad;
        this.segundoTrabajo = segundoTrabajo;
    }

    public int getAnyosInterinidad() {
        return anyosInterinidad;
    }

    public void setAnyosInterinidad(int anyosInterinidad) {
        this.anyosInterinidad = anyosInterinidad;
    }

    public boolean isSegundoTrabajo() {
        return segundoTrabajo;
    }

    public void setSegundoTrabajo(boolean segundoTrabajo) {
        this.segundoTrabajo = segundoTrabajo;
    }

    public double calculoDeSueldo (){
        return this.sueldoBase + (5 * anyosInterinidad);
    }

    @Override
    public String toString() {
        return "ProfesorInterino{" + super.toString() +
                "anyosInterinidad=" + anyosInterinidad +
                ", segundoTrabajo=" + segundoTrabajo +
                '}';
    }
}
