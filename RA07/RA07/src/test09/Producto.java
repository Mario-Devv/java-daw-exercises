package test09;

import java.util.Objects;

public abstract class Producto {
    protected String nombre, descripcion;
    protected double precio;
    protected int cantidadStock;

    public Producto(String nombre, double precio, String descripcion, int cantidadStock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion, precio, cantidadStock);
    }

    @Override
    public boolean equals(Object o) {
        Producto p = (Producto) o;

        return this.nombre.equals(p.nombre)
                && this.descripcion.equals(p.descripcion)
                && this.precio == p.precio
                && this.cantidadStock == p.cantidadStock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion +'\''+
                ", cantidadStock=" + cantidadStock+" ,";
    }
}
