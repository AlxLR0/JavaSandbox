package sentencias_de_decision;

import java.util.Scanner;

public class FitApp {
    static void main() {
        System.out.println("*********");
        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04;
        var consola = new Scanner(System.in);

        System.out.print("Ingresa nombre de usuario: ");
        var usuario = consola.nextLine();

        System.out.print("Ingresa pasos caminados: ");
        var pasos = Integer.parseInt(consola.nextLine());

        var calorias_quemadas = pasos * CALORIAS_POR_PASO;

        System.out.println();
        System.out.println("Usuario: "+usuario);
        System.out.println("Calorias quemadas: "+ calorias_quemadas);

        var meta= (pasos>=META_PASOS_DIARIO) ? "✔": "❌";
        System.out.println("meta de 10000 pasos alcanzada: "+meta);


    }
}
