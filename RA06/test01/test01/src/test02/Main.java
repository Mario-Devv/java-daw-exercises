package test02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Punto2D[] misPuntos = new Punto2D[4];

        // Crear nuevos objetos para punto
        for(int i = 0; i < 4; i++){
            String miRegex = "\\(-?\\d+,-?\\d+\\)";
            Pattern patter = Pattern.compile(miRegex);


//            System.out.println("Dame los valores en este formato\" +\n" +
//                    "                \"(n,n) <-- n hace referencia numero\"");
            String miNuevoValor = sc.nextLine();
            Matcher matcher = patter.matcher(miNuevoValor);
            if(matcher.matches()){
                misPuntos[i] = new Punto2D(miNuevoValor);
            }
        }

        for(var p = 0; p < misPuntos.length; p++){
            if(misPuntos[p] == null){
                System.out.println("El punto introducido no es válido");
                break;
            } else{
            System.out.println(misPuntos[p]);
            }
        }

    }
}
