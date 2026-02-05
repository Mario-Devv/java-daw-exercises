package Fecha;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha () {
        dia = 1;
        mes = 1;
        anio = 2000;
    }

    public Fecha (int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void setDia (int dia) {
        this.dia = dia;
    }

    public void setMes (int mes) {
        this.mes = mes;
    }

    public void setAnio (int anio) {
        this.anio = anio;
    }

    public boolean fechaCorrecta() {
        try {
            LocalDate.of(anio, mes, dia);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }

    public String diaSiguiente() {
        LocalDate misFechas = LocalDate.of(anio, mes, dia);
        LocalDate addOne = misFechas.plusDays(1);
        DateTimeFormatter misFechasFormat = DateTimeFormatter.ofPattern("d 'de' M 'de' yyyy");
        String fromattedDate = addOne.format(misFechasFormat);

        return fromattedDate;
    }

    public String toString () {
        return diaSiguiente();
    }

}
