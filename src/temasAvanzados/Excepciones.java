package temasAvanzados;

public class Excepciones {
    static void main() {
        int valor1= 10, valor2 =0;
        try{
            var res = valor1/valor2;
            System.out.println("ressultado = " + res);
        }catch(Exception e){
            System.out.println("error = " + e);
        }
    }

}
