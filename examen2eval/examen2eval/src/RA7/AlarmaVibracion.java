package RA7;

public class AlarmaVibracion extends Alarma{
        public AlarmaVibracion(int dia, int numH, int numM, boolean activa, String alarma){
            super(dia, numH, numM, activa, alarma);
        }

        @Override
        public String sonar() {
            return super.sonar() + "La alarma vibra";
        }
}
