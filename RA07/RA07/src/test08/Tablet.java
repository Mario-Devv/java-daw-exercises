package test08;

public class Tablet extends Gadget{
    private boolean encendido = false;
    private float tamPantalla;

    public Tablet(String marca, String modelo, float tamPantalla) {
        super(marca, modelo);
        this.tamPantalla = tamPantalla;
    }

    @Override
    public boolean encender () {
        if(!encendido){
            encendido = true;
            System.out.println("Tablet encendida.");
        }
        return encendido;
    }

    @Override
    public boolean apagar () {
        if(encendido){
            encendido = false;
            System.out.println("Tablet apagada.");
        }
        return encendido;
    }

    @Override
    public String toString() {
        return "Tablet{marca="+marca+","+ " modelo="+ modelo+", "+ "tamPantalla="+ tamPantalla+"}";
    }
}