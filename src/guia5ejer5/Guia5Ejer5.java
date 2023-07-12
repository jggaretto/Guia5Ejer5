/*
En un nuevo proyecto, en el método main de su clase principal, se pide realice un algoritmo que
compruebe si una matriz dada es anti simétrica. Se dice que una matriz A es anti simétrica cuando

ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica si A = -
AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por
columnas (o viceversa).


 */
package guia5ejer5;



public class Guia5Ejer5 {

    public static void main(String[] args) {
        int[][] matriz = {
            {0, -2, 4},
            {2, 0, 2},
            {-4, -2, 0}
        };
        
        boolean esAntisimetrica = verificarAntisimetrica(matriz);
        
        System.out.println("Matriz:");
        imprimirMatriz(matriz);
        
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }
    
    public static boolean verificarAntisimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        if (filas != columnas) {
            return false; // La matriz no es cuadrada, por lo que no puede ser antisimétrica
        }
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false; // La matriz no cumple la condición de antisimetría
                }
            }
        }
        
        return true; // La matriz es antisimétrica
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
 }

    

