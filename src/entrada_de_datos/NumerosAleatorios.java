package entrada_de_datos;

import java.util.Random;

public class NumerosAleatorios {
    static void main() {
        var random = new Random();

        //num entre 0 y 9
        var num= random.nextInt(10); //se pone 10 porque el ultimo no cuenta e este caso sera de 0 a 9
        System.out.println("num = " + num);

        //num entre 0.0 y 1.0
        var numFloat= random.nextFloat();
        System.out.println("numFloat = " + numFloat);

        //un dado (1 a 6)
        var num2 = random.nextInt(6)+1;
        System.out.println("num2 = " + num2);
        
    }
}
