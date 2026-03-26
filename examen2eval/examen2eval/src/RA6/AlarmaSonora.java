package RA6;

public class AlarmaSonora extends Alarma {
    public AlarmaSonora(int dia, int numH, int numM, boolean activa, String mensaje){
        super(dia, numH, numM, activa, mensaje);
    }

    public AlarmaSonora(){
        super();
    }

    @Override
    public String sonar() {

        return super.sonar().replace("null", "") + "BEEP BEEP";
    }
}
