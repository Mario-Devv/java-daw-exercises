package Persona.Tipos;

import Persona.Persona;

public class Alumno extends Persona {
    public Alumno(String dni, String nombre, String apellidos, String fechaNacimiento, String telefono) {
        super(dni, nombre, apellidos, fechaNacimiento, telefono);
    }

    @Override
    public String getRol() {
        return "Alumno";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
