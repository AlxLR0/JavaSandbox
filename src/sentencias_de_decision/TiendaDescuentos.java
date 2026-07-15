package sentencias_de_decision;
import java.util.Scanner;

public class TiendaDescuentos {
    static void main() {
        System.out.println("*** Tienda PRO ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingresa cantidad comprada: $");
        var montoCompra = Double.parseDouble(consola.nextLine());

        System.out.println("eres miebro? si=s, no=n");
        var miembro=consola.nextLine().toLowerCase();

        var descuento = 0.0;
        if (montoCompra>=1000){
            //descuento de 100
            descuento = 0.1;//descuento de 10%
        } else if (miembro=="s") {
            descuento = 0.05; //descuento de 5%

        }else {
            descuento=0; //descuento del 0%
        }

        if (descuento !=0){
            var montoDescuento = montoCompra * descuento;
            var montoFinal = montoCompra - montoDescuento;
            System.out.printf("""
                    %nFelicidades!, has obtenido un descuento del %.0f%%
                    monto de la compra: $%.2f
                    Monto descuento: $%.2f
                    Monto Final con descuento: $%.2f
                    """,descuento*100, montoCompra,montoDescuento, montoFinal);
        }else {
            System.out.println("😪");
        }


    }
}
