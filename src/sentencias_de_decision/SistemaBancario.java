package sentencias_de_decision;

import java.util.Scanner;

public class SistemaBancario {
    static void main() {
        System.out.println("*** BANCO PRO ***");
        var consola = new Scanner(System.in);

        System.out.print("Desea salir del sistema? (true/false): ");
        var salirSistema = Boolean.parseBoolean(consola.nextLine());

        if (!salirSistema){
            System.out.println("seguir dentro del sistema");
        }
        else{
            System.out.println("salir del sistema");
        }
    }
}
