import Recordatorio.Recordatorio;
import Recordatorio.Tipos.RecordatorioMusical;
import Recordatorio.Tipos.RecordatorioSonoro;
import Recordatorio.Tipos.RecordatorioVibracion;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica que tipo de recordatorio quiere crear: RecordatorioSonoro, RecordatorioVibracion, RecordatorioMusical (S, V, M)");
        String eleccionString = sc.nextLine();
        String eleccionToMayus = eleccionString.toUpperCase();

        char eleccionToChar = eleccionToMayus.charAt(0);

        System.out.println("Día(0-6)");
        int dia = sc.nextInt();

        System.out.println("Hora");
        int hora = sc.nextInt();

        System.out.println("Minuto");
        int minuto = sc.nextInt();

        System.out.println("¿Quiere que este activa? (true / false)");
        boolean actvia = sc.nextBoolean();
        sc.nextLine();

        System.out.println("¿Desea poner algun mensaje?");
        String mensaje  = sc.nextLine();

        Recordatorio recordatorio = null;
        
        if(eleccionToChar == 'S'){
            recordatorio = new RecordatorioSonoro(dia, hora, minuto, actvia, mensaje);
        }else if(eleccionToChar == 'V'){
            recordatorio = new RecordatorioVibracion(dia, hora, minuto, actvia, mensaje);

        }else if (eleccionToChar == 'M'){
            RecordatorioMusical rm = new RecordatorioMusical(dia, hora, minuto, actvia, mensaje);
            rm.setCancion("Himno de la alegria");
            recordatorio = rm;
        }

        System.out.println("---Resultado----");
        System.out.println(recordatorio);
        System.out.println(recordatorio.alertar());

        ArrayList<Recordatorio> lista = new ArrayList<Recordatorio>();
        RecordatorioSonoro r1 = new RecordatorioSonoro(1, 7, 30, true, "Despertador mañana");
        RecordatorioVibracion r2 = new RecordatorioVibracion(1, 22, 00, false, "Reunión silenciosa");
        RecordatorioMusical r3 = new RecordatorioMusical(1, 22, 00, true, "Cena sábado");
        r3.setCancion("My way");

        lista.add(r1);
        lista.add(r2);
        lista.add(r3);

        System.out.println("---RESULTADO ARRAYS---");
        for(Recordatorio r : lista){
            if(r.isActivo()) {
                System.out.println(r);
            }
        }

        HashSet<Recordatorio> listaND = new HashSet<Recordatorio>();
        RecordatorioSonoro rnd1 = new RecordatorioSonoro(1, 10, 30, false, null);
        RecordatorioVibracion rnd2 = new RecordatorioVibracion(2, 11, 45, false, null);
        RecordatorioMusical rnd3 = new RecordatorioMusical(1, 10, 30, false, null);

        listaND.add(rnd1);
        listaND.add(rnd2);
        listaND.add(rnd3);

        System.out.println("---Resultado ARRAYS SIN DUPLICADOS");
        for(Recordatorio r : listaND){
            System.out.println(r);
        }

    }
}
