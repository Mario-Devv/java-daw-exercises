import Pajaro.Pajaro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Clase main
        Scanner sc = new Scanner(System.in);
        //Se comenta para el ejercicio
        //System.out.println("Introduce color del pajaro" +
          //      "v=verde, a=amarillo, g=gris, n=negro, b=blanco");

        String color = sc.nextLine();
        char abreviacion = color.charAt(0);

        //System.out.println("Decide la edad del pajarraco");
        int edad = sc.nextInt();

        Pajaro pj1 = new Pajaro(abreviacion, edad);

        System.out.println("Pajaro{color="+pj1.getColor()+", edad="+ pj1.getEdad()+"}");

        //Comentamos para el ejercicio
        //System.out.println(pj1);

    }
}
