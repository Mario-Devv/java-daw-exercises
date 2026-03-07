package test06.Dinamic;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        LinkedList<Integer> numeros = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 12; i++){
            int misNumeros = sc.nextInt();

            numeros.add(misNumeros);
        }

        for(int i = numeros.size() -1; i >= 0; i--){
            System.out.print(
                    numeros.get(i)+ " " 
            );
        }
    }
}
