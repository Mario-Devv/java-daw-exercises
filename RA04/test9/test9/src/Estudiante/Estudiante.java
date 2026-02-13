package Estudiante;

public class Estudiante {
    String nombre;
    String direccion;
    int edad;
    int nre;


    //Contructor
    public Estudiante (String nombre, String direccion, int edad, int nre){
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.nre = nre;
    }

    public Estudiante (){
        nombre = null;
        direccion = null;
        edad = 0;
        nre = 0;
    }

    //Getters && settters
    public void setNombre (String nombre) {this.nombre = nombre;}

    public void setDireccion (String direccion) {this.direccion = direccion;}

    public void setEdad (int edad) {this.edad = edad;}

    public void setNre (int nre) {this.nre = nre;}

    public String getNombre(){return nombre;}

    public String getDireccion(){return direccion;}

    public int getEdad(){return edad;}

    public int getNre(){return nre;}

    public String obtenUsuario () {
        return "Estudiante: Nombre: "+getNombre()+ ", direccion: "+getDireccion()+", edad: "+getEdad()+ ", nre:"+ getNre();
    }

    //to string
    public String toString () {
        return obtenUsuario();
    }


}
