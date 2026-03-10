package test02;

public class Automovil {
    private Motor miMotor;

    public Automovil () {
        this.miMotor = new Motor();
    }

    public void encenderMotor () {
        System.out.println(miMotor.Encender());
    }

    public void apagarMotor () {
        System.out.println(miMotor.Apagar());
    }


}
