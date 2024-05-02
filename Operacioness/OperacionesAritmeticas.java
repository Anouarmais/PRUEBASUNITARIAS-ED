package Operacioness;

import java.util.Scanner;

/**
 * Esta clase proporciona métodos estáticos para realizar operaciones aritméticas básicas.
 * @author aNOUAR
 * @version 2.0
 * @since 1.0
 */
public class OperacionesAritmeticas {

    /**
     * Realiza la suma de dos números.
     *
     * @param a El primer número a sumar.
     * @param b El segundo número a sumar.
     * @return La suma de los dos números.
     */
    public static double Suma(double a, double b) {
        return a + b;
    }

    /**
     * Realiza la resta de dos números.
     *
     * @param a El número del cual se restará el segundo número.
     * @param b El número que será restado.
     * @return La resta de los dos números.
     */
    public static double Resta(double a, double b) {
        return a - b;
    }

    /**
     * Realiza la suma de dos números ingresados por el usuario.
     *
     * @param scanner El objeto Scanner para leer la entrada del usuario.
     */
    public static void HacerSuma(Scanner scanner) {
        System.out.println("Ingrese dos números para sumar:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("El resultado de la suma es: " + OperacionesAritmeticas.Suma(num1, num2));
    }

    /**
     * Realiza la resta de dos números ingresados por el usuario.
     *
     * @param scanner El objeto Scanner para leer la entrada del usuario.
     */
    public static void HacerResta(Scanner scanner) {
        System.out.println("Ingrese dos números para restar:");
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();
        System.out.println("El resultado de la resta es: " + OperacionesAritmeticas.Resta(num3, num4));
    }
}
