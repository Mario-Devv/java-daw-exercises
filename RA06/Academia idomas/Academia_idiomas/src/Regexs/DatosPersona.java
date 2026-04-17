package Regexs;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatosPersona {
    public static boolean regexDNI (String dni) {
        Pattern pattern = Pattern.compile("[0-9]{8}[A-Z]");
        Matcher matcher = pattern.matcher(dni);

        if(matcher.matches()){
            return true;
        }else {
            System.err.println("Datos del DNI erroneos");
            return false;
        }


    }

    public static boolean regexNombre (String nombre) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{1,20}");
        Matcher matcher = pattern.matcher(nombre);

        if(matcher.matches()){
            return true;

        } else{
            System.err.println("Valor de nombre incorrecto");
            return false;
        }
    }

    public static boolean regexApellidos (String apellidos) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{1,20}");
        Matcher matcher = pattern.matcher(apellidos);

        if(matcher.matches()){
            return true;
        } else {
            System.err.println("Valor de los apellidos incorrecto");
            return false;
        }
    }

    public static boolean regexFecha (String fecha) {
        try{
            LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return true;
        } catch (DateTimeException e){
            System.err.println("Fecha introducida incorrecta");
            return false;
        }
    }

    public static boolean regexTlf (String telefono) {
        Pattern pattern = Pattern.compile("[0-9]{9}");
        Matcher matcher = pattern.matcher(telefono);

        if(matcher.matches()){
            return true;
        } else {
            System.err.println("Teléfono incorrecto");
            return false;
        }

    }

    public static boolean regexSueldo (String sueldo) {
        Pattern pattern = Pattern.compile("[0-9]{1,4},[0-9]{1,2}");
        Matcher matcher = pattern.matcher(sueldo);

        if(matcher.matches()){
            return true;
        } else {
            System.err.println("sueldo incorrecto");
            return false;
        }

    }
}
