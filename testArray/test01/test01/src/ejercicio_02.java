import java.util.Scanner;

public class ejercicio_02 {
    public static void main (String[] args) {
        /* Leer 8 números con la clase ES, almacenarlos en un vector y visualizarlos.*/

        int[] misNumericos = new int[8];
        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduce un numero");

//        int numero1 = sc.nextInt();
//        System.out.println("Introduce otro numero");
//
//        int numero2 = sc.nextInt();
//
//        System.out.println("Introduce otro numero");
//        int numero3 = sc.nextInt();
//
//        System.out.println("Introduce otro numero");
//        int numero4 = sc.nextInt();
//
//        System.out.println("Introduce otro numero");
//        int numero5 = sc.nextInt();
//
//        System.out.println("Introduce otro numero");
//        int numero6 = sc.nextInt();
//
//        System.out.println("Introduce otro numero");
//        int numero7 = sc.nextInt();
//
//        System.out.println("Introduce otro numero");
//        int numero8 = sc.nextInt();

        // añadir numericos

        for(int i = 0; i < misNumericos.length; i++) {
            System.out.println("dame un valor");
            int miValor = sc.nextInt();
            misNumericos[i] = miValor;
        }

        // ver numericos pues
        System.out.println("Mira pues que hiciste");
        for(int v = 0; v < misNumericos.length; v++) {
            System.out.println(misNumericos[v]);
        }

    }
}
