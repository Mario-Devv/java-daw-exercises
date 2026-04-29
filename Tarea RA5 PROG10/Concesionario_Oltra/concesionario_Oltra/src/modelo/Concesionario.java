package modelo;

import java.util.Arrays;
import java.util.Objects;

public class Concesionario {
    private String nombre;
    private String localizacion;
    private VehiculoElectrificado[] coches;
    private int indice;

    public Concesionario() {
        this.coches = new VehiculoElectrificado[50];
        this.indice = 0;
    }

    public Concesionario(String nombre, String localizacion, int capacidad) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.coches = new VehiculoElectrificado[capacidad];
        this.indice = 0;
    }

    public Concesionario(Concesionario otro) {
        this.nombre = otro.nombre;
        this.localizacion = otro.localizacion;
        this.coches = Arrays.copyOf(otro.coches, otro.coches.length);
        this.indice = otro.indice;
    }

    // Getters y Setters (Sin get/set para el atributo coches)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getLocalizacion() { return localizacion; }
    public void setLocalizacion(String localizacion) { this.localizacion = localizacion; }
    public int getIndice() { return indice; }

    public void añadirCoche(VehiculoElectrificado coche) {
        if (indice < coches.length) {
            coches[indice] = coche;
            indice++;
        } else {
            System.out.println("Error: No hay espacio en el stock del concesionario.");
        }
    }

    public int numCoches() {
        return indice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concesionario that = (Concesionario) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(localizacion, that.localizacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, localizacion);
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Concesionario: ").append(nombre).append(" (").append(localizacion).append(")\n");
        sb.append("Stock disponible (").append(numCoches()).append("):\n");
        for (int i = 0; i < indice; i++) {
            sb.append("- ").append(coches[i].toString()).append("\n");
        }
        return sb.toString();
    }
}