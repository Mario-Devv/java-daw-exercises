import java.util.Random;

public class Matrices {
    public static void main (String[] args){
        Random random = new Random();

        int[][] matriz = new int[4][4];

        // Rellenar matriz
        for(int i = 0; i < matriz.length; i++ ){ // Filas
            for(int c = 0; c < matriz[i].length; c++){ //columnas
                matriz [i][c] = random.nextInt(20);
            }
        }

        // Obtener matriz
        for(int i= 0; i < matriz.length; i++){//Filas de la matriz
            for(int c=0; c <matriz[i].length; c++){

                System.out.printf("%3d", matriz[i][c]);
            }
            System.out.println();
        }

        // Suma de cada fila
        for(int i=0; i<matriz.length; i++){
            int suma = 0;
            for(int c=0; c<matriz[i].length;c++){
                suma += matriz[i][c];
            }
            System.out.println("Suma de la fila "+ i +" | "+suma);
        }

        // Suma de cada columna
        for(int i=0; i<matriz.length; i++){
            int suma = 0;
            for(int c=0; c<matriz[i].length;c++){
                suma += matriz[c][i];
            }
            System.out.println("Suma de cada columna "+i+ " | "+suma);
        }

        // Numero mayor de la matriz
        int mayor=0;
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                if(matriz[i][j] > mayor){
                    mayor = matriz[i][j] ;
                }
            }
        }
        System.out.println(mayor);


    }
}
