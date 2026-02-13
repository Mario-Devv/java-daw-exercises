package Numero;

public class Numero {
    //Creamos el atributo
    private int numero;

    //Creamos constructor por defecto con parametros
    public Numero(int numero) {
        this.numero = numero;
    }

    // metodos

    // Obtener numero
    public int getNumero(){
        return numero;
    }

    // Añadir valor de numero al atributo
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void suma(int mas) {
        int miSuma = numero + mas;

        // Actualizamos valor de numero
        numero = miSuma;
    }

    public void resta(int resta) {
        int miResta = numero - resta;

        // Actualizamos valor de numero
        numero = miResta;
    }

    // Doble del numero
    public int getDoble (){
        return getNumero() * 2;
    }

    // Obtener el triple
    public int getTriple () {
        return getNumero() * 3;
    }




}
