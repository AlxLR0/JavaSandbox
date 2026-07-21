package ciclos;

import java.util.Scanner;

public class CajeroAutomatico {
    static void main() {
        var consola = new Scanner(System.in);
        var saldo = 1000.0;
        var salir = false;
        while (!salir) {
            System.out.print("""
                    ***Cajero pro***
                    1- Consultar Saldo
                    2- Retirar
                    3- Despositar
                    4- Salir
                    
                    Escoge una opcion:\s""");
            var opc = consola.nextInt();

            switch (opc){
                case 1 -> System.out.println("Tu saldo es: $"+saldo);
                case 2 -> {
                    System.out.print("Ingresa monto a retirar: ");
                    var retiro = consola.nextDouble();

                    if (retiro<=saldo) {
                        saldo -= retiro;
                        System.out.println("Tu saldo es: $"+saldo);
                    }else {
                        System.out.println("Saldo insuficiente tienes solo $"+saldo);
                    }
                }
                case 3->{
                    System.out.print("Ingresa monto a Despositar: ");
                    var deposito = consola.nextDouble();
                    saldo += deposito;
                    System.out.println("Tu saldo es: $"+saldo);

                }
                case 4 -> {
                    System.out.println("Adios");
                    salir = true;
                }
                default -> System.out.println("ERROR X_X");
            }

        }
    }
}
