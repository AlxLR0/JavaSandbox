package cadenas;

public class Cadenas {
    static void main() {
        var cadena1= "hola";
        System.out.println("cadena1 = " + cadena1);
        
        var cadena2= new String("Mundo");
        System.out.println("cadena2 = " + cadena2);
        
        var cadena3 = cadena1 + " "+cadena2;
        System.out.println("cadena3 = " + cadena3);

        //cadena multi linea
        var cadena4 = """
                hola
                mundo
                """;
        System.out.println("cadena4 = " + cadena4);
    }
}
