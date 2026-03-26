package RA6;

public class AlarmaMusical extends Alarma {
    private String cancion;

    public AlarmaMusical(){
        super();
    }

    public AlarmaMusical(int dia, int numH, int numM, boolean activa, String alarma){
        super(dia, numH, numM, activa, alarma);
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String sonar() {
        return super.sonar().replace("null", "") + "Reproduciendo cancion " + cancion;
    }
}
