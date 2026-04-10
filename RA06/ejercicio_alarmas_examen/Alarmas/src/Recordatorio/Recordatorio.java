package Recordatorio;

import java.util.Objects;

public abstract class Recordatorio {
    private int dia;
    private int hora;
    private int minuto;
    private boolean activo;
    private String mensaje;

    public Recordatorio(int dia, int hora, int minuto, boolean activo, String mensaje) {
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
        this.activo = activo;
        this.mensaje = mensaje;
    }

    public Recordatorio() {
        this.dia = 0;
        this.hora = 0;
        this.minuto = 0;
        this.activo = false;
        this.mensaje = null;
    }

    public Recordatorio(Recordatorio recordatorio) {
        this.dia = recordatorio.dia;
        this.hora = recordatorio.hora;
        this.minuto = recordatorio.minuto;
        this.activo = recordatorio.activo;
        this.mensaje = recordatorio.mensaje;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String formatDiasSemana () {
        if(dia == 0){
            return "Domingo";
        }
        if(dia == 1){
            return "Lunes";
        }
        if(dia == 2){
            return "Martes";
        }
        if(dia == 3){
            return "Miércoles";
        }
        if(dia == 4){
            return "Jueves";
        }
        if(dia == 5){
            return "Viernes";
        }
        if(dia == 6) {
            return "Sábado";
        }

        return null;
    }

    private String formatActive(){
        if(!activo){
            return "NO";
        } else {
            return "SI";
        }
    }

    public abstract String alertar();

    @Override
    public String toString() {
        return "Recordatorio{" +
                "dia=" + formatDiasSemana() +
                ", hora=" + hora +
                ", minuto=" + minuto +
                ", activo=" + formatActive() +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        boolean iguales = false;
        if(obj instanceof Recordatorio){
            Recordatorio recordatorio = (Recordatorio) obj;
            iguales = recordatorio.dia == this.dia && recordatorio.hora == this.hora && recordatorio.minuto == this.minuto;
        }

        return iguales;
    }

    public int hashCode(){
        return Objects.hash(this.dia, this.hora, this.minuto);
    }
}
