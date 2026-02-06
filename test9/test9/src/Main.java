import Estudiante.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Introduce datos del usuario en este orden (nombre, direccion, calle, nre): ");

        Estudiante miEstudiante = new Estudiante(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());

        System.out.println(miEstudiante);
    }
}
