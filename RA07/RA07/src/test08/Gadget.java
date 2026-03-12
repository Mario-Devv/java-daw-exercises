package test08;

public abstract class Gadget {
    protected String marca;
    protected String modelo;
    public Gadget(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract boolean encender();
    public abstract boolean apagar();

}
