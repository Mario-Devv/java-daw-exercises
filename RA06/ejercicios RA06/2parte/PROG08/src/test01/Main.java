package test01;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        LinkedList<Integer> numeros = new LinkedList<Integer>();

        Scanner sc = new Scanner(System.in);

        int maximo = 8;
        for(int i = 0; maximo > i; i++){
            //System.out.println("Introduce numeros");
            int miNumero = sc.nextInt();
            numeros.add(miNumero);
        }

        for(int v = 0; maximo > v; v++){
            System.out.print(numeros.get(v)+ " ");
        }
    }

}
