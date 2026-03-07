package test05.dinamico;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        LinkedList<Character> alfabeto = new LinkedList<Character>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 7; i++) {
            String getPhrase = sc.nextLine();
            String minusPhrase = getPhrase.toLowerCase();
            char getVocals = minusPhrase.charAt(0);

            alfabeto.add(getVocals);
        }

        int contador = 0;

        for(int i = 0; i < 7; i++){
//            System.out.println(alfabeto.get(i));

            if(alfabeto.get(i) == 'a' | alfabeto.get(i) == 'e' | alfabeto.get(i) == 'i' | alfabeto.get(i) == 'o' |alfabeto.get(i) == 'u'){
                contador++;
            }
        }
        System.out.println("Vocales="+contador);
    }
}
