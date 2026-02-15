import Rectangulo.Rectangulo;

import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los valores del rectangulo ten en cuenta el siguiente orden:" +
                "ValorX1, ValorX2, ValorY1, ValorY2");

        //String nombreRectangulo01 = sc.nextLine();
        double valorX1 = sc.nextDouble();
        double valorX2 = sc.nextDouble();
        double valorY1 = sc.nextDouble();
        double valorY2 = sc.nextDouble();

        Rectangulo miRectangulo = new Rectangulo(valorX1, valorX2, valorY1, valorY2);
        //miRectangulo.setNombre(nombreRectangulo01);

        System.out.println("Ahora inserta los valores del siguiente rectangulo siguiendo la misma estructura de antes");
        Rectangulo miCopia = new Rectangulo(miRectangulo);

        System.out.println("Nombre del rectangulo: "+ Rectangulo.getNombreFigura());
        System.out.println("Área "+miRectangulo.calcularSuperficie());
        System.out.println("Perímetro " + miRectangulo.calcularPerimetro());
        System.out.println("Número total de rectángulos creados "+ Rectangulo.getNumRectangulos());

        System.out.println("Nombre del rectangulo 2: "+ Rectangulo.getNombreFigura());
        System.out.println("Área "+miCopia.calcularSuperficie());
        System.out.println("Perímetro " + miCopia.calcularPerimetro());
        System.out.println("Número total de rectángulos creados "+ Rectangulo.getNumRectangulos());

    }

}
