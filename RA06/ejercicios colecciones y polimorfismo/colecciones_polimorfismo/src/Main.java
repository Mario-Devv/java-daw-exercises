import Asignaturas.Asignaturas;
import Profesor.ProfesorInterino;
import ext.Personas.Alumno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String information;
        char format;

        Scanner sc = new Scanner(System.in);
        information = sc.nextLine();
        String toMayus = information.toUpperCase();
        format = toMayus.charAt(0);


        //Pedir información al usuario
        System.out.println("¿Desea crear un alumno o un profesor?");
        System.out.println("S(SI) / N(NO) ");

        if(format == 'S' || format == 'Y'){
            System.out.println("Valores a introducir");
            System.out.println("dni, nombre, apellidos, fecha_nacimiento");

            String dni = sc.nextLine();
            String nombre = sc.nextLine();
            String apellidos = sc.nextLine();
            String fecha_nacimiento = sc.nextLine();

            Alumno alumno = new Alumno(dni, nombre, apellidos, fecha_nacimiento);
        }


    }
}
