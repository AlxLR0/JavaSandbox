package cadenas;

public class ComparacionCadenas {
    static void main() {
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        //comparacion de las cadenas en referencia en memoria (no en valor)
        System.out.println(cadena1 == cadena2);

        System.out.println(cadena1==cadena3);

        //comparacion en contenido(valor) con equals
        System.out.println(cadena1.equals(cadena3));
    }
}
