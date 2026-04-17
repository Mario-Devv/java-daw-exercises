import Curso.Curso;
import Persona.Persona;
import Persona.Tipos.Alumno;
import Persona.Tipos.ProfesorInterino;
import Persona.Tipos.ProfesorTitular;
import Regexs.DatosPersona;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Parte pedimos valores al usuario*/
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
        } while (!DatosPersona.regexFecha(fecha_nacimiento));

        String telefono;
        do{
            System.out.println("Teléfono: ");
            telefono = sc.nextLine();
        } while (!DatosPersona.regexTlf(telefono));

        String sueldo;
        do {
            System.out.println("Sueldo (si es alumno introduzca 0,0): ");
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
        /*-----------------------------FIN-----------------------------*/
        /*Segunda parte ;D*/
        ArrayList<Curso> listaCursos = new ArrayList<Curso>();

        Curso c1 = new Curso("IG","Inglés" ,"B2", true, 4, 8);
        Curso c2 = new Curso("FR", "Francés", "A1", false, 3, 7);
        Curso c3 = new Curso("AL", "Aleman", "C1", true, 5, 10);

        listaCursos.add(c1);
        listaCursos.add(c2);
        listaCursos.add(c3);

        //Mostrar solo los que están activos:
        System.out.println("----Cursos activos----");
        for(Curso curso : listaCursos){
            if(curso.isActivo()){
                System.out.println(curso);
            }
        }

        HashSet<Curso> listaCursoNoDuplicado = new HashSet<Curso>();
        Curso c1nd = new Curso("1","Inglés" ,"B2", false, 0, 0);
        Curso c2nd = new Curso("2","Japonés" ,"A1", false, 0, 0);
        Curso c3nd = new Curso("1","Inglés" ,"B2", false, 0, 0);

        listaCursoNoDuplicado.add(c1nd);
        listaCursoNoDuplicado.add(c2nd);
        listaCursoNoDuplicado.add(c3nd);

        //Comprar lista de cursos sin duplicados
        System.out.println("----Lista de cursos sin duplicados----");
        for(Curso curso : listaCursoNoDuplicado){
            System.out.println(curso);
        }
    }
}
