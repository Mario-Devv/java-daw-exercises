package test09;

import java.util.Objects;

public class NoPerecedero extends Producto{
    private String fechaConsumoPreferente;

    public NoPerecedero(String nombre, double precio, String descripcion, int cantidadStock, String fechaConsumoPreferente){
        super(nombre, precio, descripcion, cantidadStock);
        this.fechaConsumoPreferente = fechaConsumoPreferente;
    }

    public String getFechaConsumoPreferente() {
        return fechaConsumoPreferente;
    }

    public void setFechaConsumoPreferente(String fechaConsumoPreferente) {
        this.fechaConsumoPreferente = fechaConsumoPreferente;
    }

    @Override
    public int hashCode(){
        return Objects.hash(nombre, precio, descripcion, cantidadStock, fechaConsumoPreferente);
    }

    @Override
    public boolean equals(Object o){
        NoPerecedero NP = (NoPerecedero) o;

        return this.nombre.equals(NP.nombre)
                && this.precio == NP.precio
                && this.descripcion.equals(NP.descripcion)
                && this.cantidadStock ==  NP.cantidadStock
                && this.fechaConsumoPreferente.equals(NP.fechaConsumoPreferente);
    }

    @Override
    public String toString() {
        return super.toString().replace("Producto", "NoPerecedero") + "fechaConsumoPreferente='"+this.fechaConsumoPreferente+"'}";
    }
}
