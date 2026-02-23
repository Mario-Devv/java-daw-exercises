import java.util.Scanner;

public class ejercicio_04 {
    public static void main (String[] args) {
        int[] misNumeros = new int[20];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i < misNumeros.length; i++) {
            int misValores = sc.nextInt();

            misNumeros[i] = misValores;

        }

        int contador7 = 0;
        int numMayoresA7 = 0;
        int numMenoresA7 = 0;

        for (int v = 0; v < misNumeros.length; v++){
            if(misNumeros[v] == 7){
                contador7 ++;
            }

            if(misNumeros[v] > 7) {
                numMayoresA7++;
            }

            if(misNumeros[v] < 7 ){
                numMenoresA7 ++;
            }
        }
        System.out.println("Numero de sietes que se han visto: "+ contador7);
        System.out.println("Numero mayores a 7: "+ numMayoresA7);
        System.out.println("Numero menor a 7: "+ numMenoresA7);

    }

}
