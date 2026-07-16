package sentencias_de_decision;

public class OperadorTernario {
    static void main() {
        /*operador ternario es una forma de realizar una operacion if-else en una sola linea de codigo

         Sintaxis

        *condicion ? expresion1 : expresion2;

        condicion: es una expresion booleana que se evalua
        expresion1: es el valor que se devuelve si la condicion es verdadera
        expresion2: es el valor que se devuelve si la condicion es falsa
        * */

        var edad = 18;

        var resultado= (edad>=18) ? "puede votar": "no puede votar";
        System.out.println("resultado = " + resultado);
    }
}
