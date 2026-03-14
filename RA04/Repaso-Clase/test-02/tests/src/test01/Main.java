package test01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quiere acelarar o frenar (A o F)");

        String accion = sc.nextLine();
        char getChar = accion.toUpperCase().charAt(0);

        System.out.println("Cuantos KM/H");
        int kmh = sc.nextInt();

        Coche ch = new Coche();
        if(getChar == 'A'){
            System.out.println(getChar);
            ch.acelera(kmh);
            System.out.println(ch);
        } else if (getChar == 'F') {
            System.out.println(getChar);
            ch.frena(kmh);
            System.out.println(ch);
            if(ch.getVelocidad() <= 0){
                System.out.println("Vas andando caballero");
            }
        }

    }
}
