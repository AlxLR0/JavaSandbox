package entrada_de_datos;

import java.util.Scanner;

public class LeerTipoDatos {
    static void main() {
        //leer int
        var consola = new Scanner(System.in);
        System.out.print("ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        //leer double
        System.out.print("ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);

        //consumir el caracter de salto de linea
        consola.nextLine();

        //leer string
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        //conversion de datos
        
        //string a int
        System.out.print("ingresa valor entero");
        var enteroString=consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);

        //flotante
        System.out.print("ingresa valor flotante");
        var flotante=Float.parseFloat(consola.nextLine());//otra forma de convertir mas corta
        System.out.println("flotante = " + flotante);
    }
}
