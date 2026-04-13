package Persona.Tipos;

import Persona.Persona;

public class ProfesorInterino extends Persona {
    private int añosInterinidad;
    private boolean segundoTrabajo;

    public ProfesorInterino(String dni, String nombre, String apellidos, String fechaNacimiento, String telefono) {
        super(dni, nombre, apellidos, fechaNacimiento, telefono);
        añosInterinidad = 5;
        segundoTrabajo = false;
    }

    @Override
    public String getRol() {
        return "Profesor interino";
    }

    @Override
    public double getSueldo() {
        double total = 0;
        total = super.getSueldo() + 5 * añosInterinidad;
        if(!segundoTrabajo){
            return total;
        } else {
            return total - (total * 0.1);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " ProfesorInterino{" +
                "añosInterinidad=" + añosInterinidad +
                ", segundoTrabajo=" + segundoTrabajo +
                '}';
    }
}
