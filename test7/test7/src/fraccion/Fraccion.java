package fraccion;

public class Fraccion {
    private int dividendo;
    private int divisor;

    public Fraccion () {
        dividendo = 0;
        divisor = 0;
    }

    public Fraccion (int dividendo, int divisor){
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    //Setters
    public void setDividendo (int dividendo) {
        this.dividendo = dividendo;
    }

    public void setDivisor (int divisor) {
        this.divisor = divisor;
    }

    //Getters
    public int getDividendo () {
        return dividendo;
    }

    public int getDivisor () {
        return divisor;
    }

    //Métodos
    public String sumar (Fraccion segundaFraccion) {
        int numerador = dividendo * segundaFraccion.divisor + divisor * segundaFraccion.dividendo;
        int denominador = divisor * segundaFraccion.divisor;
        return "Suma "+numerador +"/"+ denominador;
    }

    public String restar (Fraccion segundaFraccion) {
        int numerador = dividendo * segundaFraccion.divisor - divisor * segundaFraccion.dividendo;
        int denominador = divisor * segundaFraccion.divisor;
        return "Resta "+numerador +"/"+ denominador;
    }

    public String multiplicar(Fraccion segundaFraccion) {
        int numerador = dividendo * segundaFraccion.getDividendo();
        int denominador = divisor * segundaFraccion.getDivisor();
        return "Multiplicación "+numerador +"/"+ denominador;
    }

    public String fracciones (Fraccion segundaFraccion) {
        int numerador = dividendo * segundaFraccion.getDivisor();
        int denominador = divisor * segundaFraccion.getDividendo();
        return "División "+numerador +"/"+ denominador;
    }

    public String toString () {
        return "Esta fraccion es "+ dividendo + "/"+ divisor;
    }
}
