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
               // salir = ejecutarOpciones(opcion, consola, productos);
            } catch (Exception e) {
                System.out.println("Error: "+e.getMessage());
            }
            finally {
                System.out.println();//imprime salto de linea en cada iteracion
            }
        }


    }

    private static int monstrarMenu(Scanner consola){
        System.out.println("""
                MENU:
                1. Comprar snack
                2. Mostar ticket
                3. Agregar Nuevo Snack
                4. Salir
                
                Elige una opcion:\s""");

        //leer y retomar la opcion seleccionada
        return Integer.parseInt(consola.nextLine());
    }
}
