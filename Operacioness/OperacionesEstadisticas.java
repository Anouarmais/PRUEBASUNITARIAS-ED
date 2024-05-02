package Operacioness;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase proporciona métodos estáticos para realizar operaciones estadísticas básicas sobre conjuntos de números.
 */
public class OperacionesEstadisticas {

    /**
     * Calcula la media aritmética de un conjunto de números.
     *
     * @param numeros Un array de números para calcular la media.
     * @return La media aritmética de los números en el array.
     */
    public static double Media(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    /**
     * Calcula la mediana de un conjunto de números.
     *
     * @param numeros Un array de números para calcular la mediana.
     * @return La mediana de los números en el array.
     */
    public static double Mediana(double[] numeros) {
        Arrays.sort(numeros);
        int n = numeros.length;
        if (n % 2 == 0) {
            return (numeros[n / 2 - 1] + numeros[n / 2]) / 2;
        } else {
            return numeros[n / 2];
        }
    }

    /**
     * Realiza el cálculo de la media aritmética de un conjunto de números ingresados por el usuario.
     *
     * @param scanner El objeto Scanner para leer la entrada del usuario.
     */
    public static void HacerMedia(Scanner scanner) {
        System.out.println("Ingrese los números para calcular la media (separados por espacios):");
        double[] numeros = new double[5];
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextDouble();
        }
        System.out.println("La media de los números ingresados es: " + OperacionesEstadisticas.Media(numeros));
    }

    /**
     * Realiza el cálculo de la mediana de un conjunto de números ingresados por el usuario.
     *
     * @param scanner El objeto Scanner para leer la entrada del usuario.
     */
    public static void HacerMediana(Scanner scanner) {
        System.out.println("Ingrese los números para calcular la mediana (separados por espacios):");
        double[] nums = new double[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = scanner.nextDouble();
        }
        System.out.println("La mediana de los números ingresados es: " + OperacionesEstadisticas.Mediana(nums));
    }
}
   