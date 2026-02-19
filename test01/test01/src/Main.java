import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        String miPunto1;
        String miPunto2;
        String miPunto3;
        String miPunto4;
        int contador = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("1º Introduce valor de x e y");
        String element1 = sc.nextLine();

        System.out.println("2º Introduce valor de x e y");
        String element2 = sc.nextLine();

        System.out.println("3º Introduce valor de x e y");
        String element3 = sc.nextLine();

        System.out.println("4º Introduce valor de x e y");
        String element4 = sc.nextLine();

        miPunto1 = element1;
        miPunto2 = element2;
        miPunto3 = element3;
        miPunto4 = element4;

        String regexs = "\\(-?\\d+,-?\\d+\\)";


        Pattern pattern = Pattern.compile(regexs);
        Matcher matcher1 = pattern.matcher(miPunto1);
        Matcher matcher2 = pattern.matcher(miPunto2);
        Matcher matcher3 = pattern.matcher(miPunto3);
        Matcher matcher4 = pattern.matcher(miPunto4);


        if(matcher1.matches()) {
            System.out.println("Valor correcto rey: "+ element1);
            contador++;
        }
        if (matcher2.matches()) {
            System.out.println("Valor correcto rey: "+ element2);
            contador++;
        }
        if (matcher3.matches()) {
            System.out.println("Valor correcto rey: "+ element3);
            contador++;
        }
        if (matcher4.matches()) {
            System.out.println("Valor correcto rey: "+ element4);
            contador++;
        }

        System.out.println(contador);


    }

}
