package test03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        int[][] elementosPunto = new int[4][4];
        Scanner sc = new Scanner(System.in);
        Punto2D[] punto2D = new Punto2D[4];
        String regex = "\\(-?\\d+,-?\\d+\\)";


        for(int i = 0; i < punto2D.length; i++){
            Pattern pattern = Pattern.compile(regex);

//            System.out.println("Introduce el valor de punto2D");
            String miNuevoValor = sc.nextLine();
            Matcher matcherX = pattern.matcher(miNuevoValor);

            if(matcherX.matches()) {
                String[] aparte = miNuevoValor.split(",");
                String parteIZQ = aparte[0].replace("(", "");
                String parteDER = aparte[1].replace(")", "");

                int transformX = Integer.parseInt(parteIZQ);
                int transformY = Integer.parseInt(parteDER);

                punto2D[i] = new Punto2D(transformX, transformY);
            }
        }


        for (int i = 0; i < elementosPunto.length; i++){
            for (int c = 0; c < elementosPunto[i].length; c++){
                System.out.printf("%4d",
                        elementosPunto[i][c] = (int) Math.round(Math.sqrt(Math.pow(punto2D[c].getX() - punto2D[i].getX(), 2) + Math.pow(punto2D[c].getY() - punto2D[i].getY(), 2)))
                );
            }
            System.out.println();
        }

    }
}
