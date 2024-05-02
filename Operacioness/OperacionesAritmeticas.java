package Operacioness;

import java.util.Scanner;

/**
 * Esta clase proporciona métodos estáticos para realizar operaciones aritméticas básicas.
 * @author aNOUAR
 * @version 2.0
 * @since 1.0
 */
public class OperacionesAritmeticas {


    public static double Suma(double a, double b) {
        return a + b;
    }


    public static double Resta(double a, double b) {
        return a - b;
    }


    public static void HacerSuma(Scanner scanner) {
        System.out.println("Ingrese dos números para sumar:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("El resultado de la suma es: " + OperacionesAritmeticas.Suma(num1, num2));
    }


    public static void HacerResta(Scanner scanner) {
        System.out.println("Ingrese dos números para restar:");
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();
        System.out.println("El resultado de la resta es: " + OperacionesAritmeticas.Resta(num3, num4));
    }
}
