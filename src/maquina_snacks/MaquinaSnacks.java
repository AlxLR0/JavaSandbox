package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    static void main() {
        maquinaSnack();
    }

    public static void maquinaSnack(){
        var salir = false;
        var consola = new Scanner(System.in);

        // crear la lista de productos
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** maquina de snacks");
        Snacks.mostrarSnacks();// mostrar inventario de snacks disponibles

        while(!salir){
            try{
                var opcion = monstrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos);
            } catch (Exception e) {
                System.out.println("Error: "+e.getMessage());
            }
            finally {
                System.out.println();//imprime salto de linea en cada iteracion
            }
        }


    }

    private static int monstrarMenu(Scanner consola){
        System.out.print("""
                MENU:
                1. Comprar snack
                2. Mostar ticket
                3. Agregar Nuevo Snack
                4. Salir
                
                Elige una opcion: """);

        //leer y retomar la opcion seleccionada
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola,List<Snack>productos){
        var salir = false;

        switch (opcion){
            case 1 -> comprarSnack(consola, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> {
                System.out.println("✌");
                salir = true;
            }
            default -> System.out.println("Opcion invalida 🤦‍♂️");
        }
        return salir;
    }


    private static void comprarSnack(Scanner consola, List<Snack>productos){
        System.out.println("Introduce ID de snack a comprar: ");
        var idSnack = Integer.parseInt(consola.nextLine());

        //validar que e le snack exista en la lista de snacks
        var snackEncontrado = false;
        for (var snack: Snacks.getSnacks()){
            if (idSnack == snack.getIdSnack()){
                // agregar snack a la lista de productos
                productos.add(snack);
                System.out.println("snack agregado: "+snack);
                snackEncontrado = true;
                break;
            }
        }

        if (!snackEncontrado){
            System.out.println("snack no encontrado: "+idSnack);

        }

    }

    private static void mostrarTicket(List<Snack>productos){
        var ticket = "*** Ticket de venta ***";
        var total = 0.0;

        for (var producto: productos){
            ticket += "\n\t- "+producto.getNombre() + " - $"+ producto.getPrecio();
            total += producto.getPrecio();

        }

        ticket+="\n\tTotal -> $"+ total;
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner consola){
        System.out.print("Nombre del snack: ");
        var nombre = consola.nextLine();
        System.out.println("Precio del snack: ");
        var precio = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack(nombre,precio));

        System.out.println("Snack agregado!");
        Snacks.mostrarSnacks();
    }
}
