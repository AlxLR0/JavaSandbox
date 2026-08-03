package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenido {

    static void main() {
        boolean anexar = false;
        var nombreArchivo="mi_archivo.txt";
        var archivo = new File(nombreArchivo);

        try {

            //revisar si existe el archivo
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            var nuevoContenido = "Nuevo\ncontenido";

            salida.println(nuevoContenido);
            salida.close();

            System.out.println("nuevo contenido agregado");



        } catch (Exception e) {
            System.out.println("error: "+e);
        }
    }
}
