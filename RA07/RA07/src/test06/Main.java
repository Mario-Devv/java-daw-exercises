package test06;

public class Main {
    public static void main(String[] args)
    {
        Empleado empleado = new Empleado("Juan Perez", 30000);
        System.out.println(empleado);  // Llama implícitamente a toString()

        Gerente gerente = new Gerente("Ana Gomez", 50000, "Sistemas");
        System.out.println(gerente);  // Llama implícitamente a toString(), mostrando también el departamento
    }
}
