package operadores;

import java.util.Scanner;

public class SistemaPrestamoLibros {
    static void main() {
        System.out.println("*** Prestamo Libros ***");

        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.println("Cuenta con credencial de estudiante (true/false)");
        var tieneCredencial = Boolean.parseBoolean(consola.nextLine());


        System.out.println("A cuantos km vives de la biblioteca?: ");
        var distanciaBiblioteca = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo = tieneCredencial || distanciaBiblioteca <= DISTANCIA_PERMITIDA_KM;
        System.out.println("esElegiblePrestamo = " + esElegiblePrestamo);
    }
}
