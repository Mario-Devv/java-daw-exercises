package test04.dinamico;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> edades = new LinkedList<Integer>();

        int contador = 0;
        for(int i = 0; i < 7; i++){
            int misEdades = sc.nextInt();
            edades.add(misEdades);
        }

        for (int i = 0; i < 7; i++) {
            if(edades.get(i) >= 18) {
                contador ++;
            }
        }

        System.out.println("Mayores de edad="+contador);
    }



}
