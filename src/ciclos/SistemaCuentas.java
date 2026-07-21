package ciclos;

import java.util.Scanner;

public class SistemaCuentas {
    static void main() {
        var consola = new Scanner(System.in);
        var salir = false;

        //iteracion de numeros
        while (!salir){
            System.out.print("""
                    ***Sistema admin pro***
                    1- Crear cuenta
                    2- Eliminar cuenta
                    3- Salir
                    
                    Escoge una opcion:\s""");
            var opc = consola.nextInt();

            switch (opc){
                case 1 -> System.out.println("Creando cuenta...\n");
                case 2 -> System.out.println("Eliminando cuenta...\n");
                case 3 -> {
                    System.out.println("Adios");
                    salir = true;
                }
                default -> System.out.println("ERROR X_X");
            }

        }
    }
}
