package test02.array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] numeros = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; numeros.length > i; i++){
//            System.out.println("Añade los numeros que consideres necesarios");
            int misNumeros = sc.nextInt();
            numeros[i] = misNumeros;
        }

        int contador = 0;
        for(int v = 0; numeros.length > v; v++){
//          System.out.println(numeros[v]);
            if(numeros[v] > numeros.length - 1){
                contador++;
            }
        }

       System.out.println("Hay "+contador+ " mayores que el último");

    }

}
