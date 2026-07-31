package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;

    //bloque static inicializador
    static {
        snacks=new ArrayList<>();
        snacks.add(new Snack("papas",70));
        snacks.add(new Snack("refresco",50));
        snacks.add(new Snack("sandwich",120));
    }

    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public static void mostrarSnacks(){
        var inventarioSnacks = "";
        for (var snack: snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }

        System.out.println("*** snacks en el inventario ***");
        System.out.println(inventarioSnacks);

    }

    public static List<Snack> getSnacks(){
        return snacks;
    }
}
