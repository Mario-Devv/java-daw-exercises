package Profesor;

import Personas.Personas;

public class Profesor extends Personas {
    protected String titulacion, especializacion;

    public Profesor(String dni, String nombre, String apellidos, String fecha_naciemiento, String titulacion, String especializacion) {
        super(dni, nombre, apellidos, fecha_naciemiento);
        this.titulacion = titulacion;
        this.especializacion = especializacion;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
}
