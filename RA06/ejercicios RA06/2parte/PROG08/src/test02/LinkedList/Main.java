package test02.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        LinkedList<Integer> numeros = new LinkedList<Integer>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0; 5 > i; i++){
//            System.out.println("Añade los numeros que consideres necesarios");
            int misNumeros = sc.nextInt();
            numeros.add(misNumeros);
        }

        int contador = 0;
        for(int v = 0; 5 > v; v++){
//            System.out.println(numeros.get(v));
            if(numeros.get(v) > numeros.getLast()){
                contador++;
            }
        }

        System.out.println("Hay "+contador+ " mayores que el último");

    }
}
