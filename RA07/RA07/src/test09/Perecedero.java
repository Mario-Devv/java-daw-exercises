package test09;

import java.util.Objects;

public class Perecedero extends Producto{
    private String fechaCaducidad;

    public Perecedero(String nombre, double precio ,String descripcion, int cantidadStock, String fechaCaducidad){
        super(nombre, precio, descripcion, cantidadStock);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad){
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public int hashCode(){
        return Objects.hash(nombre,
                descripcion,
                precio,
                cantidadStock,
                fechaCaducidad
        );
    }

    @Override
    public boolean equals (Object o){
        Perecedero p = (Perecedero) o;

        return this.nombre.equals(p.nombre)
                && this.descripcion.equals(p.descripcion)
                && this.precio == p.precio
                && this.cantidadStock == p.cantidadStock
                && this.fechaCaducidad.equals(p.fechaCaducidad);
    }

    @Override
    public String toString(){
        return super.toString().replace("Producto", "Perecedero") + "fechaCaducidad='"+fechaCaducidad+"'}";
    }
}
