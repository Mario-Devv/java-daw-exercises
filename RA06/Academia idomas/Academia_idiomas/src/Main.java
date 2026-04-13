import Persona.Persona;
import Persona.Tipos.Alumno;
import Persona.Tipos.ProfesorInterino;
import Persona.Tipos.ProfesorTitular;
import Regexs.DatosPersona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que tipo de persona quiere crear?(A, T, I)");
        String tipoPersona = sc.nextLine();
        String tipoPersonaUpper = tipoPersona.toUpperCase();
        char tipoPersonaToChar = tipoPersonaUpper.charAt(0);

        String dni;
        do {
            System.out.println("DNI: ");
            dni = sc.nextLine();
        } while (!DatosPersona.regexDNI(dni));

        String nombre;
        do {
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
        } while (!DatosPersona.regexNombre(nombre));

        String apellidos;
        do {
            System.out.println("Apellidos: ");
            apellidos = sc.nextLine();
        } while (!DatosPersona.regexApellidos(apellidos));

        String fecha_nacimiento;
        do {
            System.out.println("Fecha nacimiento: ");
            fecha_nacimiento = sc.nextLine();
        } while (!DatosPersona.regexNombre(fecha_nacimiento));

        System.out.println("Teléfono: ");
        String telefono = sc.nextLine();


        String sueldo;
        do {
            System.out.println("Sueldo (si procede): ");
            sueldo = sc.nextLine();
        } while (!DatosPersona.regexSueldo(sueldo));

        Persona persona;

        if (tipoPersonaToChar == 'A') {
            persona = new Alumno(dni, nombre, apellidos, fecha_nacimiento, telefono);
            System.out.println(persona);
            System.out.println(persona.getRol());
        } else if (tipoPersonaToChar == 'T') {
            persona = new ProfesorTitular(dni, nombre, apellidos, fecha_nacimiento, telefono);
            persona.setSueldo(1000);
            System.out.println(persona.getRol());
        } else if (tipoPersonaToChar == 'I') {
            persona = new ProfesorInterino(dni, nombre, apellidos, fecha_nacimiento, telefono);
            persona.setSueldo(1000);
            System.out.println(persona.getRol());
        }


    }
}
