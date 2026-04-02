package Personas;

public class Personas {
    protected String dni;
    protected String nombre;
    protected String apellidos;
    protected String fecha_naciemiento;

    public Personas(String dni, String nombre, String apellidos, String fecha_naciemiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_naciemiento = fecha_naciemiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_naciemiento() {
        return fecha_naciemiento;
    }

    public void setFecha_naciemiento(String fecha_naciemiento) {
        this.fecha_naciemiento = fecha_naciemiento;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha_naciemiento='" + fecha_naciemiento + '\'' +
                '}';
    }
}
