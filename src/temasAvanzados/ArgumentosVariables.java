/*
Los argumentos variables en Java (conocidos como varargs) son una función que permite a un método recibir una cantidad flexible de valores o parámetros
(desde cero hasta muchos) del mismo tipo, usando tres puntos (...). Evitan crear arreglos manuales o duplicar métodos con distinta cantidad de datos.
* */
package temasAvanzados;

public class ArgumentosVariables {
    static void main() {
        imprimirNumeros(1,2,3,4,5);
        variosParametros("fulanito", 10,20,30);
    }

    private static void variosParametros(String nombre, int...numeros) {
        System.out.println("Nombre: "+nombre);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int...numeros) {
        for (var i =0; i<numeros.length; i++)
            System.out.println(numeros[i]+" ");
    }
}
