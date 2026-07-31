package temasAvanzados;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    static void main() {
        Map<String, String> persona = new HashMap<>();
        persona.put("Nombre", "fulanito");
        persona.put("apellido","detal");
        persona.put("edad", "100");

        System.out.println("valores del mapa");
        persona.entrySet().forEach(System.out::println);

    }
}
