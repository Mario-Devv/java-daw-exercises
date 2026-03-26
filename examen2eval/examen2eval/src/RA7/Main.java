package RA7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Creación de los tipos de alarma
        Scanner sc = new Scanner(System.in);

        System.out.println("Alarma que se desea crear");

        // Recoger valor del usuario
        String valorUser = sc.nextLine();
        String upperUser = valorUser.toUpperCase();
        char shortUser = upperUser.charAt(0);

        // poner filtros
        if(shortUser == 'S'){
            AlarmaSonora as = new AlarmaSonora();

            System.out.println(as.sonar());
        } else if(shortUser == 'V'){
            System.out.println("Alooo");
        } else if (shortUser == 'M') {
            System.out.println("SIUU");
        } else {
            System.out.println("Valores no validos solo son validos: S, V, M");
        }


    }
}
