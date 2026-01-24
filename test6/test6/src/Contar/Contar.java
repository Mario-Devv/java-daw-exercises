package Contar;

import javax.print.DocFlavor;

public class Contar {

    // Atributo
    private int contador;

    // Constructor por defecto
    public Contar () {
        contador = 0;
    }

    // Constructor con parámetros
    public Contar (int contador) {
        this.contador = contador;
    }

    //Setters
    public void setContador (int contador) {
        this.contador = contador;
    }

    //Gets
    public int getContador () {
        return contador;
    }


    //Métodos
    public void incrementar (int incremento) {
        setContador(incremento + contador);
    }

    public void decrementar (int decremento) {
        setContador(contador - decremento);
    }

    public int suma (Contar cont1) {
        return contador + cont1.getContador();
    }

    public String toString () {
        return "Este es el resultado de incrementar: "+ getContador();
    }

}
