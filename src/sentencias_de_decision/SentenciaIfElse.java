package sentencias_de_decision;

public class SentenciaIfElse {
    static void main() {
        var edad = 30;
        if (edad >= 18){
            System.out.println("puede votar");
        }else {
            System.out.println("no puede votar");
        }

        var calificacion =70;
        if (calificacion == 100){
            System.out.println("calificacion perfecta");
        } else if (calificacion>=70 || calificacion<=99) {
            System.out.println("aprobado");
        }else {
            System.out.println("reprobado");
        }


    }
}
