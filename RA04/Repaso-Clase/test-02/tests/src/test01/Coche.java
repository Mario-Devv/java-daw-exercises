package test01;

class Coche{

    private int velocidad;

    public Coche() {

        velocidad = 0;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void acelera (int mas){
        velocidad = mas + velocidad;
    }

    public void frena (int menos){
        velocidad = menos - velocidad;
    }

    @Override
    public String toString() {
        return "La velocidad actual es: "+ velocidad+ " KM/H";
    }
}

