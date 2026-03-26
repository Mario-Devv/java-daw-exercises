package RA6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alarma> alarmas = new ArrayList<Alarma>();
       // Creación de los tipos de alarma
        Scanner sc = new Scanner(System.in);

        System.out.println("Alarma que se desea crear");

        // Recoger valor del usuario
        String valorUser = sc.nextLine();
        String upperUser = valorUser.toUpperCase();
        char shortUser = upperUser.charAt(0);

        // poner filtros


        if(shortUser == 'S'){
            AlarmaSonora as = new AlarmaSonora();
            as.setDia(1);
            as.setActiva(true);
            as.setNumH(7);
            as.setNumM(00);
            as.setMensaje("Despertador mañana");

            alarmas.add(as);
        } else if(shortUser == 'V'){
            AlarmaVibracion av = new AlarmaVibracion();
            av.setDia(1);
            av.setActiva(false);
            av.setNumH(8);
            av.setNumM(00);


            alarmas.add(av);

        } else if (shortUser == 'M') {
            AlarmaMusical am = new AlarmaMusical();
            am.setDia(1);
            am.setActiva(true);
            am.setNumH(22);
            am.setNumM(00);
            am.setMensaje("Cenando sábado");
            am.setCancion("My way");


        } else {
            System.out.println("Valores no validos solo son validos: S, V, M");
        }

        for(int i = 0; i < alarmas.size(); i++) {
            if(alarmas.get(i).isActiva()){
                System.out.println(alarmas.get(i));
            }
        }


    }
}
