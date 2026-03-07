package test04.Array;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] edades = new int[7];

        int contador = 0;
        for(int i = 0; i < edades.length; i++){
            int misEdades = sc.nextInt();
            edades[i]  = misEdades;
        }

        for (int i = 0; i < edades.length; i++) {
            if(edades[i] >= 18) {
                contador ++;
            }
        }

        System.out.println("Mayores de edad="+contador);
    }



}
