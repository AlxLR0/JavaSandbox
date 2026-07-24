package funciones;

public class Funciones {
    static void saludar(String nombre){
        System.out.println("Hola "+nombre);
    }

    static int sumar(int n1, int n2){
        var resultado = n1+n2;
        return resultado;
    }

    static boolean esPar(int numero){
       // if (numero %2==0)
       //     return true;
       // else
        //    return false;

        //forma simple
        return (numero % 2 == 0)? true: false;

    }

    //una funcion recursiva es una funcion que se llama a si misma
    static void recursiva(int n){
        if (n==1)
            System.out.println(n+ " ");
        else {
            //caso recursivo
            recursiva(n-1);
            System.out.println(n+" ");
        }
    }


    static void main() {
        saludar("fulano");
        System.out.println(sumar(5,5));

        System.out.println(esPar(2));

        recursiva(5);
    }
}
