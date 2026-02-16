import java.util.Random;

public class EjercicioArrays {
    public static void main(String[] args) {
        Random random = new Random();

        // 1. Crea un array de 10 enteros
        int numeros[] = new int[10];

        // 2. Rellénalo con números aleatorios entre 1 y 50
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50) + 1;
        }

        // 3. Muestra todos los números
        System.out.println("Números generados:");
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        // 4. TODO: Encuentra y muestra el número MAYOR del array
        // Pista: crea una variable "mayor" y compárala con cada número
        int mayor = numeros[0];
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }

        System.out.println("El numero mayor es: "+mayor);


        // 5. TODO: Calcula y muestra la SUMA de todos los números
        // Pista: crea una variable "suma" e incrementala en cada vuelta
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }

        System.out.println("El valor de la suma de los arrays es: "+suma);
    }
}
