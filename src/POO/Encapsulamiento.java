package POO;

/*
* El encapsulamiento en la programación orientada a objetos es el principio que agrupa los datos y los métodos dentro de una clase,
*  y restringe el acceso directo a los componentes internos de un objeto.
* */
public class Encapsulamiento {


        private int operando1;
        private int operando2;

        //constructores
        public Encapsulamiento(int op1, int op2) {
            System.out.println("Ejecutando constructor");
            this.operando1=op1;
            this.operando2=op2;

        }

        void sumar() {
            var resultado = operando1 + operando2;
            System.out.println("Resultado de la suma:" + resultado);
        }

        void restar() {
            var resultado = operando1 - operando2;
            System.out.println("Resultado de la resta:" + resultado);
        }

        public int getOperando1(){
            return this.operando1;
        }
        public void setOperando1(int operando1){
            this.operando1=operando1;
        }

        public int getOperando2(int i) {
            return operando2;
        }

        public void setOperando2(int operando2) {
            this.operando2 = operando2;
        }



    static void main() {
        System.out.println("cLaSe ArItMeTiCa");

        var valor1= new Encapsulamiento(5,7);

        //obtener valor (get)
        System.out.println("valor operando1 = "+ valor1.getOperando1());

        //establecer valor (Set)
        valor1.setOperando1(10);
        valor1.getOperando2(15);



        valor1.sumar();
        valor1.restar();

    }
}
