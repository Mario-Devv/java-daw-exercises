package test08;

public class Laptop extends Gadget{
    private String idiomaTeclado;
    private boolean estado;
    public Laptop(String marca, String modelo, String idiomaTeclado){
        super(marca, modelo);
        this.idiomaTeclado = idiomaTeclado;
    }

    @Override
    public boolean encender(){
        if(!estado){
            estado = true;
            System.out.println("Laptop encendido.");
        }
        return estado;
    }

    @Override
    public boolean apagar(){
        if(estado){
            estado = false;
            System.out.println("Laptop apagado.");
        }
        return estado;
    }

     public String toString(){
         return "Laptop{marca="+marca+","+ " modelo="+ modelo+", "+ "idiomaTeclado="+ idiomaTeclado+"}";

     }
}
