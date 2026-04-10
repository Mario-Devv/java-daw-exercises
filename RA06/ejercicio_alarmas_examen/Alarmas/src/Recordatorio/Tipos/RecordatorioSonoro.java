package Recordatorio.Tipos;

import Recordatorio.Recordatorio;

public class RecordatorioSonoro extends Recordatorio {
    public RecordatorioSonoro(int dia, int hora, int minuto, boolean activo, String mensaje) {
        super(dia, hora, minuto, activo, mensaje);
    }

    @Override
    public String alertar() {
        return "BEEP BEEP";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
