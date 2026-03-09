package test08;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        HashMap<String, String> t = new HashMap<String, String>();

        t.put("casa", "house");
        t.put("gato", "cat");
        t.put("perro", "dog");
        t.put("árbol", "tree");
        t.put("libro", "book");
        t.put("cielo", "sky");
        t.put("mar", "sea");
        t.put("sol", "sun");
        t.put("luna", "moon");
        t.put("estrella", "star");

        Scanner sc = new Scanner(System.in);



//        for(int i = 0; i < t.size(); i++){
            System.out.println("Introduce una palabra en español para traducir en inglés:");
            String resultadoUser = sc.nextLine();
            System.out.println("La tradcuccion de '"+resultadoUser+"' es: "+ t.get(resultadoUser));

//        }

    }
}
