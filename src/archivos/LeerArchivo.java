package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    static void main() {
        var nombreArchivo="mi_archivo.txt";
        var archivo = new File(nombreArchivo);

        try {
            System.out.println("contenido del archivo: ");
            //abrir el archivo para lectura
            var entrada = new BufferedReader(new FileReader(archivo));
            //leer linea a linea el archivo
            var linea = entrada.readLine();
            //leer todas
            while (linea !=null){
                System.out.println(linea);
                //antes de terminar el cilo, se mueve a la siguiente linea
                linea = entrada.readLine();

            }
            //cerrar archivo
            entrada.close();

        } catch (Exception e) {
            System.out.println("error: "+e);
        }
    }
}
