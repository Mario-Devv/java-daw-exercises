package test04;

public class Main {
    public static void main(String[] args)
    {
        // Crear una instancia de Coche
        Coche miCoche = new Coche("Toyota", "Corolla", 2020);

        // Utilizar los métodos heredados de la clase Vehiculo
        System.out.println(miCoche);
        miCoche.arrancar();
        miCoche.detener();
    }
}
