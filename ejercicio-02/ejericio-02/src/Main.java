public class Main {
    public static void main(String[] args) {
        String nombre = "Mario Oltra Herrero";
        String nombreMayus = nombre.toUpperCase();

        StringBuilder st = new StringBuilder(nombreMayus);

        int contador = 0;
        for(int i = 0; i < nombre.length(); i++){
            char caracter = nombreMayus.charAt(i);

            if(caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
                contador ++;
            }
        }

        System.out.println(st.reverse());
        System.out.println(contador);
    }
}
