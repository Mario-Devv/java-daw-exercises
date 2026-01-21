import Numero.Numero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Abrimos scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");

        // Almacenamos valor del scanner
        int valorUser = sc.nextInt();

        // Llamos a nuestro objeto y le asignamos el valor del scanner
        Numero miNumero = new Numero(valorUser);


        System.out.println("EL doble es: "+ miNumero.getDoble());
        System.out.println("El triple es: "+ miNumero.getTriple());

        // Le añadimos 15 más como pide
        miNumero.suma(15);
        System.out.println("Y le sumo 15, son: "+ miNumero.getNumero());
    }
}
