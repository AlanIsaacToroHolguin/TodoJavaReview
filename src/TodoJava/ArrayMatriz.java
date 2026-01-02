
package TodoJava;

import java.util.Scanner;

public class ArrayMatriz {

    public static void run() {

        // Declaración de la matriz
        int[][] matriz = new int[3][3];

        // Ingreso por teclado de los datos de la matriz
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== Carga de la matriz 3x3 ===");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print("Ingresa el valor para fila " + fila + ", columna " + columna + ": ");
                // Validación simple para asegurar enteros
                while (!teclado.hasNextInt()) {
                    System.out.print("Entrada inválida. Ingresa un número entero: ");
                    teclado.next(); // descarta lo que no sea entero
                }
                matriz[fila][columna] = teclado.nextInt();
            }
        }

        // Recorrido e impresión de la matriz (valor por posición)
        System.out.println("\n=== Datos de la matriz (por posición) ===");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.println("Fila " + fila + ", Columna " + columna + " -> Valor: " + matriz[fila][columna]);
            }
        }

        // Impresión formateada tipo tabla (opcional, útil para visualizar)
        System.out.println("\n=== Matriz en forma de tabla ===");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.printf("%4d", matriz[fila][columna]);
            }
            System.out.println();
        }

        teclado.close();
    }
}

