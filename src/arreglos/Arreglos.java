package arreglos;

public class Arreglos {
    static void main() {
        // declarar
        int[] enteros;

        //inizializar
        enteros = new int[3];

        //declarar e inicializar un arreglo
        int[] numeros = new int[2];
        // tambien se puede con var... var[] numeros = new int[2];

        //modificar valores
        enteros[0]=13;
        enteros[1]=1;
        enteros[2]=5;
        var suma = enteros[0]+enteros[1]+enteros[2];

        System.out.println("valor 1: "+enteros[0]);
        System.out.println("valor 2: "+enteros[1]);
        System.out.println("valor 3: "+enteros[2]);
        System.out.println("suma: "+suma);


        //Sintaxis Simplificada de Arreglos

        //primera forma
        int [] enteros2 = {100,200,300,400,500};

        //usando var
        var enteros3 = new int[]{100,200,300};


    }
}
