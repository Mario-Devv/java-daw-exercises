import Fecha.Fecha;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Fecha f= new Fecha(teclado.nextInt(),teclado.nextInt(), teclado.nextInt());

        if (f.fechaCorrecta()){
            f.diaSiguiente();
            System.out.println(f);}
        else
            System.out.println("Fecha incorrecta");

    }
}
