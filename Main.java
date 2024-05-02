
import Operacioness.OperacionesAritmeticas;
import Operacioness.OperacionesEstadisticas;

import java.util.Scanner;

/**
 * Esta clase proporciona un programa de consola para realizar varias operaciones aritméticas y estadísticas.
 */
public class Main {

    /**
     * El método principal del programa.
     *
     * @param args Los argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Media");
        System.out.println("4. Mediana");

        int aux = scanner.nextInt();

        switch (aux) {
            case 1:
                OperacionesAritmeticas.realizarSuma(scanner);
                break;
            case 2:
                OperacionesAritmeticas.realizarResta(scanner);
                break;
            case 3:
                OperacionesEstadisticas.realizarMedia(scanner);
                break;
            case 4:
                OperacionesEstadisticas.realizarMediana(scanner);
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }
}