package entrada_de_datos;

import java.util.Scanner;

public class SistemaEmpleados {
    static void main() {
        System.out.println("*** sistema empleados ***");

        var consola = new Scanner(System.in);

        //nombre empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        //edad empleado
        System.out.print("edad empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        //salario
        System.out.print("salario empleado: ");
        var salarioEmpleado = Float.parseFloat(consola.nextLine());

        //es jefe?
        System.out.print("es jefe de departemento? (true/false): ");
        var esJefe = Boolean.parseBoolean(consola.nextLine());


        //imprimir valores
        System.out.println("*** Datos del empleado ***");
        System.out.println(nombreEmpleado);
        System.out.println(edadEmpleado);
        System.out.println(salarioEmpleado);
        System.out.println(esJefe);
    }
}
