package Empleado;

public class Empleado {

    //Declaramos atributos y uno de ellos estático
    private static int numEmpleados;

    private String dni;

    private String nombre;

    private double sueldo;

    public Empleado () {
        numEmpleados++;

        dni = null;

        nombre = null;

        sueldo = 0.0;
    }

    // Setters
    public void setDni (String dni) {
        this.dni = dni;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo (double sueldo) {
        this.sueldo = sueldo;
    }

    //getters
    public String getDni (){
        return dni;
    }

    public String getnombre (){
        return nombre;
    }

    public double getSueldo (){
        return sueldo;
    }

    public static int getNumEmpleados() {
        return numEmpleados;
    }
}
