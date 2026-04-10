package Recordatorio.Tipos;

import Recordatorio.Recordatorio;

public class RecordatorioMusical extends Recordatorio {
    private String cancion;

    public RecordatorioMusical(int dia, int hora, int minuto, boolean activo, String mensaje) {
        super(dia, hora, minuto, activo, mensaje);
        this.cancion = null;
    }

    public void setCancion (String cancion) {
        this.cancion = cancion;
    }

    @Override
    public String alertar() {
        return "Reproduciendo Canción " + this.cancion;
    }

    @Override
    public String toString() {
        return super.toString() +" RecordatorioMusical{" +
                "cancion='" + cancion + '\'' +
                '}';
    }
}
