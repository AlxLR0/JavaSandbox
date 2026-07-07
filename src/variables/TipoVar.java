package variables;

public class TipoVar {
    static void main() {
        System.out.println("*** uso de var ***");
        // con var no hace falta poner el tipo de dato
        //var se recomenda su uso dentro de metodos (funciona apartir de java 10)
        var nombre = "fulanito";
        System.out.println("nombre = " + nombre);

        var edad = 80;
        System.out.println("edad = " + edad);
        
        var sueldo = 500f; // f = float, d = double
        System.out.println("sueldo = " + sueldo);

        var casado = true;
        System.out.println("casado = " + casado);


    }
}
