public class EjercicioArray {
    public static void main(String[] args){
        // 1. Crea un array de 3 Strings con tus 3 películas favoritas
        String[] peliculas = new String[3];

        peliculas[0] = "Rocky";
        peliculas[1] = "Rambo";
        peliculas[2] = "Tarzan";

        // 2. Muestra cada película con un bucle
        System.out.println("Listado de películas");
        for(int i = 0; i < peliculas.length; i++){
            System.out.println(peliculas[i]);
        }

        // 3. Cuenta cuántas películas hay (usa .length)
        System.out.println();
        System.out.println("Total de peliculas");
        System.out.println(peliculas.length);
    }
}
