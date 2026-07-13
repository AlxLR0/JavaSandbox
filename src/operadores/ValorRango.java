package operadores;

import java.util.Scanner;

public class ValorRango {
    static void main() {
        //limites
        final var MINIMO = 0;
        final var MAXIMO = 5;

        System.out.print("Ingresa valor entre 1 y 5: ");
        var valor = Integer.parseInt(new Scanner(System.in).nextLine());

        //dentro de rango
        var DentroRango = valor >= MINIMO && valor <= MAXIMO;
        System.out.println("DentroRango = " + DentroRango);


    }
}
