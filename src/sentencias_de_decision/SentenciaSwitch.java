package sentencias_de_decision;

public class SentenciaSwitch {
    static void main() {
        //dia de la semana
        var dia = 1;

        switch (dia){
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;

            case 3:
                System.out.println("miercoles");
                break;

            case 4:
                System.out.println("jueves");
                break;

            case 5:
                System.out.println("viernes");
                break;

            case 6:
                System.out.println("sabado");
                break;

            case 7:
                System.out.println("domingo");
                break;

            default:
                System.out.println("dia no valido");
                break;
        }

        //switch mejorado y simplificado disponible desde la version 12
        int dia2 = 3;
        String nombreDia;
        nombreDia= switch (dia2){
            case 1 ->"lunes";
            case 2-> "martes";
            case 3-> "miercoles";
            case 4-> "jueves";
            case 5-> "viernes";
            case 6-> "sabado";
            case 7-> "domingo";
            default -> "dia invalido";
        };
        System.out.println("nombreDia = " + nombreDia);

        //otra forma de imprimir
        switch (dia){
            case 1 -> System.out.println("lunes");
            default -> System.out.println("otro dia");
        }

        var mes = 1;
        switch (mes){
            case 1,2,12-> System.out.println("invierno");
                    //
             //
            default -> System.out.println("otro mes");
        }
                
    }
}
