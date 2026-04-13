package Persona.Tipos;

import Persona.Persona;

public class ProfesorTitular extends Persona {
    private int añosTrabajados;


    public ProfesorTitular(String dni, String nombre, String apellidos, String fechaNacimiento, String telefono) {
        super(dni, nombre, apellidos, fechaNacimiento, telefono);
        añosTrabajados = 0;
    }

    @Override
    public String getRol() {
        return "ProfesorTitular";
    }

    @Override
    public double getSueldo() {
        return super.getSueldo() +10 * añosTrabajados;
    }

    @Override
    public String toString() {
        return super.toString() + " ProfesorTitular{" +
                "añosTrabajados=" + añosTrabajados +
                '}';
    }
}
