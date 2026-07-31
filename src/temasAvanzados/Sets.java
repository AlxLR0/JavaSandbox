package temasAvanzados;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    static void main() {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Fulano");
        conjunto.add("Fulano");
        conjunto.add("sutano");
        conjunto.add("Mangano");


        System.out.println("Elementos del set");
        conjunto.forEach(System.out::println);


        //remover elemento
        conjunto.remove("sutano");
        System.out.println("Nuevos elementos del set");
        conjunto.forEach(System.out::println);
    }
}
