package test04;

public class Vehiculo {
    private String marca, modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void arrancar(){
        System.out.println("El vehículo ha arrancado.");
    }


    public void detener(){
        System.out.println("El vehículo se ha detenido.");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "Marca: " + marca +
                ", Modelo: " + modelo +
                ", año:" + año +"}";
    }
}
