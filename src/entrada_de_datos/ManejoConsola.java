package entrada_de_datos;

import java.util.Scanner;

public class ManejoConsola {
    static void main() {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();

        System.out.println("nombre = " + nombre);
    }
    
    
}
