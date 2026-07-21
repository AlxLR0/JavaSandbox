package ciclos;

public class SumaAcumulativa {
    static void main() {
        final var Maximo = 5;
        var acumulado=0;

        //iterar valores

        var numero =1;

        while (numero<=Maximo){
            //imprimir lo que se va a sumar
            System.out.println("acomulado + numero ="+acumulado+" + "+numero);

            //realizar la suma acumulativa
            acumulado += numero++;

            //imprimir la sua parcial acumulada
            System.out.println("suma parcial acumulada "+ acumulado);
            System.out.println("");
        }
        System.out.println("acomulado = " + acumulado);
    }
}
