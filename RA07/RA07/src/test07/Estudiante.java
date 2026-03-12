package test07;

public class Estudiante extends Persona {
    protected String cicloFormativo;

    public Estudiante(){
        super();
        this.cicloFormativo = "Desarrollo de Aplicaciones Multiplataforma";
    }

    public Estudiante(String nombre, int edad, String cicloFormativo){
        super(nombre, edad);
        this.cicloFormativo = cicloFormativo;
    }

    public Estudiante(Estudiante e){
        super(e.nombre, e.edad);
        this.cicloFormativo = e.cicloFormativo;
    }

    @Override
    public String toString(){
        return super.toString()+ ", Ciclo Formativo: "+ this.cicloFormativo;
    }
}
