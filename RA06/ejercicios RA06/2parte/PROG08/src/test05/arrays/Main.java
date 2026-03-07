package test05.arrays;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        char[] abecedario = new char[7];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < abecedario.length; i++) {
            String getPhrase = sc.nextLine();
            String minusPhrase = getPhrase.toLowerCase();
            char getVocals = minusPhrase.charAt(0);

            abecedario[i] = getVocals;
        }

        int contador = 0;

        for(int i = 0; i < abecedario.length; i++){
//            System.out.println(alfabeto.get(i));

            if(abecedario[i] == 'a' | abecedario[i] == 'e' | abecedario[i] == 'i' | abecedario[i] == 'o' | abecedario[i] == 'u'){
                contador++;
            }
        }
        System.out.println("Vocales="+contador);
    }
}
