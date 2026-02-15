import java.util.regex.Pattern;
import java.util.regex.Matcher;

class ValidadorDatos {
    public static void main(String[] args) {
        String dni = "12345678Z";
        String email = "mario@gmail.com";
        String telefono = "666123456";

        String regexEmail = "\\d{8}[a-zA-Z]{1}";

        Pattern patter = Pattern.compile(regexEmail);
        Matcher matcher = patter.matcher(dni);

        if(matcher.matches()) {
            System.out.println("El dni insertado es valido");
            System.out.println(dni);
        } else {
            System.out.println("Parece que hay un pequeño error con el dni, revisalo");
        }
    }
}