package Rectangulo;

import org.w3c.dom.css.Rect;

public class Rectangulo {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    private String nombre;
    private static int numRectangulos;
    private static final String nombreFigura = "Rectangulo";
    private final double PI = 3.14159265;

    public Rectangulo () {
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
        numRectangulos++;
    }

    public Rectangulo (double x1, double x2, double y1, double y2){
        this.x1 = x1;
        this.x2 = x2;

        this.y1 = y1;
        this.y2 = y2;
        numRectangulos++;
    }

    public Rectangulo (double base, double altura) {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = base;
        this.y2 = altura;
        numRectangulos++;
    }

    public Rectangulo (Rectangulo nuevoRectangulo){
        this.x1 = nuevoRectangulo.x1;
        this.x2 = nuevoRectangulo.x2;
        this.y1 = nuevoRectangulo.y1;
        this.y2 = nuevoRectangulo.y2;
        numRectangulos ++;
    }



    public double getX1() {return x1;}
    public double getX2() {return x2;}
    public double getY1() {return y1;}
    public double getY2() {return y2;}
    public static int getNumRectangulos () {
        return numRectangulos;
    }

    public static String getNombreFigura (){
        return nombreFigura;
    }

    public void setX1(double x1) { this.x1 = x1; }
    public void setX2(double x2) { this.x2 = x2; }
    public void setY1(double y1) { this.y1 = y1; }
    public void setY2(double y2) { this.y2 = y2; }

    public static void setNumRectangulos(int numRectangulos) {
        Rectangulo.numRectangulos = numRectangulos;
    }

    public double calcularSuperficie(){
        double base = x2 - x1;
        double altura = y2 - y1;

        return base * altura;
    }

    public double calcularPerimetro() {
        double base= x2 - x1;
        double altura = y2 - y1;

        return 2 * (base + altura);
    }

    public String toString () {
        return "El valor del rectangulo es: ";
    }

}
