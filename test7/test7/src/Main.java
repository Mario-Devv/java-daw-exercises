import fraccion.Fraccion;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce primer valor: ");

        int primerNum = sc.nextInt();

        System.out.println("Introduce el segundo valor: ");
        int segundoNum = sc.nextInt();

        System.out.println("Introduce el tercer valor: ");
        int tercerNum = sc.nextInt();

        System.out.println("Introduce el cuarto valor: ");
        int cuartoNum = sc.nextInt();
        Fraccion primeraOP = new Fraccion(primerNum, segundoNum);
        Fraccion segundOP = new Fraccion(tercerNum, cuartoNum);

        System.out.println(primeraOP.fracciones(segundOP));
        System.out.println(primeraOP.sumar(segundOP));
        System.out.println(primeraOP.restar(segundOP));
        System.out.println(primeraOP.multiplicar(segundOP));
    }

}
