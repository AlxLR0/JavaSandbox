package POO.sistemaVentas;

public class PruebaVentas {
    static void main() {
        System.out.println("*** Sistema pro ***");
        var producto1 = new Producto("camisa",30.00);
        //System.out.println(producto1);

        var producto2 = new Producto("zapatos",40.00);

        //primera orden
        var orden1 = new Orden();
        orden1.agregarProductos(producto1);
        orden1.agregarProductos(producto2);
        orden1.mostrarOrden();

    }
}
