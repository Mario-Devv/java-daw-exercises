package Recordatorio.Tipos;

import Recordatorio.Recordatorio;

public class RecordatorioVibracion extends Recordatorio {
    public RecordatorioVibracion(int dia, int hora, int minuto, boolean activo, String mensaje) {
        super(dia, hora, minuto, activo, mensaje);
    }

    @Override
    public String alertar() {
        return "La vibración alerta";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
