package RA7;

public class AlarmaSonora extends Alarma {
    public AlarmaSonora(){
        super();
    }

    @Override
    public String sonar() {

        return super.sonar().replace("null", "") + "BEEP BEEP";
    }
}
