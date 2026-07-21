package ciclos;

import java.util.Scanner;

public class DibujaTriangulo {
    static void main() {
        var consola = new Scanner(System.in);

        System.out.println("ingresa numero de filas");
        var numeroFilas= consola.nextInt();

        //iterar sobra cada fila del triangulo
        for (var fila = 1; fila <=numeroFilas; fila++){

            var espaciosBlanco = " ".repeat(numeroFilas-fila);
            var asteriscos= "*".repeat(2*fila-1);

            System.out.println(espaciosBlanco+asteriscos);
        }
    }
}
