import java.util.Scanner;

public class ejercicio_03 {
    public static void main(String[] args){
        /*
        * Programa que lea 12 números enteros sobre un vector y los visualice al revés, es decir,
        * comienza por final del vector y termina por el elemento 0. ¡Ojo! El for tiene que decrementar la
        *  variable de control, no incrementarla.*/
        int[] misNumericos = new int[12];

        Scanner sc = new Scanner(System.in);

        for(int i =0; i < misNumericos.length; i++){
            System.out.println("Introduce los numeros que te plazca");
            int misvalores = sc.nextInt();
            misNumericos[i] = misvalores;
        }

        System.out.println("Valores");
        for(int v = misNumericos.length - 1; v >= 0; v--){
            System.out.println(misNumericos[v]);
        }

        }

    }

