package POO;

public class ClasePersona {
    String nombre;
    String apellido;

    void mostrarPersona(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }

    static void main() {
        System.out.println("*** creacion de clase y objs persona");

        var objeto1 = new ClasePersona();

        objeto1.nombre="fulanito";
        objeto1.apellido="zerep";

        objeto1.mostrarPersona();
    }

}
