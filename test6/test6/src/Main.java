import Contar.Contar;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Contar c1 = new Contar();
        Contar c2 = new Contar();

        //Pedir al user que introduzca valores
        Scanner sc = new Scanner(System.in);

        // Llamada a los metodos  para el objeto C1 & C2
        System.out.println("Cuanto desea incrementar");
        int incrementame = sc.nextInt();
        c1.incrementar(incrementame);
        System.out.println("Cuanto desea decrementar: ");
        int decrementaUno = sc.nextInt();
        c1.decrementar(decrementaUno);
        //---------------------------
        System.out.println("Cuanto desea incrementar");
        int incrementameDos = sc.nextInt();
        c2.incrementar(incrementameDos);
        System.out.println("Cuanto desea decrementar: ");
        int decrementaDos = sc.nextInt();
        c2.decrementar(decrementaDos);

        //Mostramos el resultado por pantalla
        System.out.println("c1: Contar{"+"contador="+c1.getContador()+"}");
        System.out.println("c2: Contar{"+"contador="+c2.getContador()+"}");

        //Llama al metodo de la suma
        System.out.println("suma: "+ c1.suma(c2));

    }
}
