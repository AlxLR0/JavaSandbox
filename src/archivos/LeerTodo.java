package archivos;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    static void main() {
        var nombreArchivo="mi_archivo.txt";
        var archivo = new File(nombreArchivo);

        try {

            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            for (String linea: lineas){
                System.out.println(linea);
            }



        } catch (Exception e) {
            System.out.println("error: "+e);
        }
    }
}
