package cadenas;

public class Indices {
    static void main() {
        var cadena1 = "hola mundo";

        //recuperar primer caracter
        var primerCaracter= cadena1.charAt(0);//recupera h
        System.out.println("primerCaracter = " + primerCaracter);
        
        var ultimoCaracter= cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);

        var letraM= cadena1.charAt(5);
        System.out.println("letra m = " + letraM);
    }
}
