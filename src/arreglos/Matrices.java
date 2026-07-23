package arreglos;

public class Matrices {
    static void main() {
        //definir matriz 2x3
        final var RENGLONES = 2;
        final var COLUMNAS = 3;

        int[][] matriz = new int[RENGLONES][COLUMNAS];

        //usando var
        var matriz2 = new int [2][3];

        //modificar valores

        //[fila][columna]
        matriz[0][0]=100;
        matriz[0][1]=200;
        matriz[0][2]=300;
        matriz[1][0]=400;
        matriz[1][1]=500;
        matriz[1][2]=600;

        //recorrer matriz

        //recorrer renglones
        for (var renglon=0; renglon<RENGLONES; renglon++ ){
            //recorrer columnas
            for (var columna = 0; columna<COLUMNAS; columna++){
                System.out.println("valor["+renglon+"]["+columna+"]= "+matriz[renglon][columna]);
            }
        }


        System.out.println(" ");

        //version simplificada
        var matrizSimple = new int [][]{
                {1,2,3},
                {4,5,6}
        };


        for (var renglon=0; renglon<matrizSimple.length; renglon++ ){
            //recorrer columnas
            for (var columna = 0; columna<matrizSimple[renglon].length; columna++){
                System.out.println("valor["+renglon+"]["+columna+"]= "+matrizSimple[renglon][columna]);
            }
        }
    }
}
