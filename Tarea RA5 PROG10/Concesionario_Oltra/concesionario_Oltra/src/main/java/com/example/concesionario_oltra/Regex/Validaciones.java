package com.example.concesionario_oltra.Regex;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Toggle;

import java.time.LocalDate;

public class Validaciones {
    public static String validar(
            String marca,
            String modelo,
            LocalDate date,
            Toggle tipo,
            String voltaje,
            String potencia,
            String potenciaCombinada
    ){
        if (marca.isEmpty()){
            return "El campo MARCA no puede estar vacio";
        } else if (modelo.isEmpty()){
            return "El campo MODELO no puede estar vacio";
        } else if(date == null){
            return "La fecha no puede estar vacia";
        }else if(date.isAfter(LocalDate.now())){
            return "La fecha no puede ser superior al día de hoy";
        } else if (tipo == null) {
            return "Debes de seleccionar algún tipo";
        } else if(voltaje == null){
            return "Debes de seleccionar voltaje";
        } else if(potencia.isEmpty()){

            return "Debes de rellenar POTENCIA MÁXIMA";

        } else if(potenciaCombinada.isEmpty()){
           return "Debes de rellenar POTENCIA COMBINADA";
        }
        return null;
    }

}
