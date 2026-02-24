package Punto2D;

public class Punto2D {
    public int[] misPuntos = new int[2];

    private int x;
    private int y;
    private String punto;

    public Punto2D (String punto){
        this.punto = punto;
    }

    public String makeIntegerPunto () {
        String replaceOpen1 = punto.replaceAll("\\(", "");
        String replaceOpen2 = replaceOpen1.replaceAll("\\)", "");
        String[] division = replaceOpen2.split(",");
        int puntosEnterosX = Integer.parseInt(division[0]);
        int puntosEnterosY = Integer.parseInt(division[1]);

        x = puntosEnterosX;
        y = puntosEnterosY;

        misPuntos[0] = x;
        misPuntos[1] = y;

        return misPuntos[0] + ","+ misPuntos[1];
    }

    public String toString (){
        return "Punto2D{x="+misPuntos[0]+", "+ "y="+misPuntos[1]+"}";

    }


}
