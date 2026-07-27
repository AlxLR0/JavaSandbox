package POO;

public class ClaseAritmetica {
    int operando1;
    int operando2;

    //constructores
    public ClaseAritmetica(int op1, int op2){
        System.out.println("Ejecutando constructor");

    }

    void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("Resultado de la suma:" + resultado);
    }

    void restar(){
        var resultado = operando1 - operando2;
        System.out.println("Resultado de la resta:" + resultado);
    }

    void multiplicar(){
        var resultado = operando1 * operando2;
        System.out.println("Resultado de la multiplicacion:" + resultado);
    }

    void divicion(){
        var resultado = operando1 / operando2;
        System.out.println("Resultado de la divicion:" + resultado);
    }

    static void main() {
        System.out.println("cLaSe ArItMeTiCa");

        var valor1= new ClaseAritmetica(5,7);
        valor1.operando1 = 25;
        valor1.operando2=5;

        valor1.sumar();
        valor1.restar();
        valor1.multiplicar();
        valor1.divicion();
    }
}
