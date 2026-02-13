package Pajaro;

public class Pajaro {
    private char color;
    private String miColor;
    private int edad;

    //Constructor con valores por defecto
    public Pajaro(){
        this.color = 'e'; // Hacemos referencia con la e a color no establecido
        this.edad = 0;
    }

    public Pajaro(char abreviacion, int edad) {
        this.color = abreviacion;
        this.edad = edad;
    }

    public String getColor() {
    // Hacemos un switch con todas las posibilidades
        switch (color){
            case 'v':
                return "Verde";

            case 'a':
                return "Amarillo";

            case 'g':
                return "Gris";

            case 'n':
                return "Negro";

            case 'b':
                return "Blanco";

            default:
                return "Color no establecido";
        }
    }

    public int getEdad() {return edad;}

    public String toString(){
        return "Pajaro{color="+this.color+", "+"edad="+this.edad+"}";
    }
}
