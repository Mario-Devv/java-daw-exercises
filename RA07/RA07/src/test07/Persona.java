package test07;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona () {
        this.nombre = "Carmen Gaña";
        this.edad = 30;
    }

    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(Persona p){
        this.nombre = p.nombre;
        this.edad = p.edad;
    }

    public String toString(){
        return "Nombre: "+ this.nombre+", Edad: "+ this.edad;
    }
}
