import Empleado.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Abrimos scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre usuario: ");

        String nombre = sc.nextLine();

        System.out.println("DNI: ");

        String dni = sc.nextLine();

        System.out.println("Sueldo: ");

        Double sueldo = sc.nextDouble();

        // Llamamos a Empleado
        Empleado miEmpleado1 = new Empleado();
        Empleado miEmpleado2 = new Empleado();
        Empleado miEmpleado3 = new Empleado();

        System.out.println(Empleado.getNumEmpleados());

    }

}
