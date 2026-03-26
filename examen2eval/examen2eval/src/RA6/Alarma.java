package RA6;

import java.util.Objects;

public class Alarma {
    protected int dia;
    protected int numH;
    protected int numM;
    protected boolean activa;
    protected String mensaje;

    public Alarma(int dia, int numH, int numM, boolean activa, String mensaje) {
        this.dia = dia;
        this.numH = numH;
        this.numM = numM;
        this.activa = activa;
        this.mensaje = mensaje;
    }

    public Alarma() {
        this.dia = 0;
        this.numH = 0;
        this.numM = 0;
        this.activa = false;
        this.mensaje = null;
    }

    public Alarma(Alarma a) {
        this.dia = a.dia;
        this.numH = a.numH;
        this.numM = a.numM;
        this.activa = a.activa;
        this.mensaje = a.mensaje;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getNumH() {
        return numH;
    }

    public void setNumH(int numH) {
        this.numH = numH;
    }

    public int getNumM() {
        return numM;
    }

    public void setNumM(int numM) {
        this.numM = numM;
    }

    public boolean isActiva() {
        return activa;
    }

    public String changeWeek () {
        if(this.dia == 0){
            return "Domingo";
        } else if(this.dia == 1) {
            return "Lunes";
        } else if(this.dia == 2){
            return "Martes";
        } else if (this.dia == 3) {
            return "Miércoles";
        }else if (this.dia == 4) {
            return "Jueves";
        }else if (this.dia == 5) {
            return "Viernes";
        }else if (this.dia == 6) {
            return "Sábado";
        } else {
            return null;
        }
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    private String alarmaActiva(){
        if(this.activa){
            return "SI";
        }else {
            return "NO";
        }
    }

    public String sonar(){
        return "null";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Alarma)) return false;

        Alarma al = (Alarma) obj;

        return this.dia == al.dia &&
                this.numH == al.numH &&
                this.numM == al.numM &&
                this.activa == al.activa &&
                Objects.equals(this.mensaje, al.mensaje);
    }

    @Override
    public int hashCode(){
        return Objects.hash(dia, numH, numM, activa, mensaje);
    }

    public String toString(){
        return changeWeek() + " "+ this.numH + " "+ this.numM + " "+ alarmaActiva() + " "+ this.mensaje + " ";
    }
}
