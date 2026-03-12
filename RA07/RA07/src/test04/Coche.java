package test04;

public class Coche extends Vehiculo{
    public Coche(String marca, String modelo, int año){
        super(marca, modelo, año);
    }

    @Override
    public String toString(){
        return super.toString().replace("Vehiculo", "Coche");
    }

}
