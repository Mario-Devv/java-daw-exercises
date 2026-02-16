import java.util.regex.Pattern;
import java.util.regex.Matcher;

class ValidadorDatos {
    public static void main(String[] args) {
        String dni = "12345678Z";
        String email = "mario@gmail.com";
        String telefono = "666123456";

        //Regex para el dni
        String regexDNI = "\\d{8}[a-zA-Z]{1}"; //regex formato dni ESP

        Pattern patter = Pattern.compile(regexDNI);
        Matcher matcher = patter.matcher(dni);

        if(matcher.matches()) {
            System.out.println("El dni insertado es valido");
            System.out.println(dni);
        } else {
            System.out.println("Parece que hay un pequeño error con el dni, revisalo");
        }
        //Fin dni

        // Regex para email
        String regexEmail = "[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]+";

        Pattern pEmail = Pattern.compile(regexEmail);
        Matcher matcherEmail = pEmail.matcher(email);

        if(matcherEmail.matches()) {
            System.out.println("Formato del correo correcto: "+ email);
        } else {
            System.out.println("Formato del correo incorrecto, por favor intentelo de nuevo");
        }

        // FIN regex email

        // Regex tlf
        String regexTelefono = "[6-9]{1}\\d{8}";
        Pattern pTelefono = Pattern.compile(regexTelefono);
        Matcher matcherTelefono = pTelefono.matcher(telefono);

        if(matcherTelefono.matches()) {
            System.out.println("Número de teléfono aceptado "+ telefono);
        } else {
            System.out.println("Vaya parece que el número de teléfono no es correcto, por favor compruebelo");
        }
    }
}