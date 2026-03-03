package test03;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        LinkedList<Integer> numeros = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);

        int maximo = 9;
        for(int i = 0; maximo > i; i++){
//            System.out.println("Introduce los numeros");
            int misNumeros = sc.nextInt();
            numeros.add(misNumeros * 2);

            if(i == 8){
                System.out.print(numeros.get(i));
            } else
            {

                System.out.print(numeros.get(i)+ ", ");
            }

        }

    }
}
