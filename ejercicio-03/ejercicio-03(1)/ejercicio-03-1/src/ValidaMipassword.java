import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaMipassword {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su contraseña");

        String miPass = sc.nextLine();

        String longitud = ".{8,}"; //mínimo 8 caracteres
        String mayus = ".*[A-Z].*"; // Al menos una mayúscula
        String minus = ".*[a-z].*"; // al menos una minúscula
        String numero = ".*\\d.*"; // AL menos un número
        String especiales = ".*[@#$%&].*";



        Pattern cumpleLongitud = Pattern.compile(longitud);
        Matcher logintudMatcher = cumpleLongitud.matcher(miPass);

        Pattern cumpleMayus = Pattern.compile(mayus);
        Matcher mayusMatcher = cumpleMayus.matcher(miPass);

        Pattern cumpleMinus = Pattern.compile(minus);
        Matcher minusMatcher = cumpleMinus.matcher(miPass);

        Pattern cumpleNumero = Pattern.compile(numero);
        Matcher numeroMatcher = cumpleNumero.matcher(miPass);

        Pattern cumpleEspecial = Pattern.compile(especiales);
        Matcher cumpleMatcher = cumpleEspecial.matcher(miPass);

        System.out.println("Longitud mayor a 8: "+ logintudMatcher.matches());
        System.out.println("Incluir Mayusculas: "+ mayusMatcher.matches());
        System.out.println("Incluir Minúsculas: "+ minusMatcher.matches());
        System.out.println("Incluir un número: "+ numeroMatcher.matches());
        System.out.println("Caracter especial: "+ cumpleMatcher.matches());

        boolean esSegura = logintudMatcher.matches() && mayusMatcher.matches()
                && minusMatcher.matches() && numeroMatcher.matches() && numeroMatcher.matches() && cumpleMatcher.matches();

        System.out.println("¿Es segura la contraseña? "+ esSegura);
    }

}
