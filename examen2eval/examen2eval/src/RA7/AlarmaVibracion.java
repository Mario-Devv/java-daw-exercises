package RA7;

public class AlarmaVibracion extends Alarma{
        public AlarmaVibracion(){
            super();
        }

        @Override
        public String sonar() {
            return super.sonar().replace("null", "") + "La alarma vibra";
        }
}
