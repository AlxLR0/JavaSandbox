package archivos.maquina_snacks_archivos.servicio;

import archivos.maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos  implements IServicioSnacks{

    private final String NOMBRE_ARCHIVO = "snacks.txt";
    //crear lista de snacks
    private List<Snack> snacks = new ArrayList<>();


    // constructor clase
    public ServicioSnacksArchivos(){
        //crear el archivo en caso de no existir
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try {
            existe = archivo.exists();
            if (existe){
                //this.snacks= obtenerSnacks();
            }else {//crear archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Archivo creado ✔");

            }
        }catch (Exception e){
            System.out.println(e);
        }

        //si no existe, cargamos alguno snacks iniciales
        if (!existe){
            cargarSnacksIniciales();
        }

    }

    private void cargarSnacksIniciales(){
        this.agregarSnack(new Snack("papas",70));
        this.agregarSnack(new Snack("refresco",50));
        this.agregarSnack(new Snack("sandwich",120));
    }

    @Override
    public void agregarSnack(Snack snack) {
        //agregar snack, 1. a la lista en memoria
        this.snacks.add(snack);
        //2 guardar snack en archivo
        this.agregarSnackArchivo(snack);
    }

    private void agregarSnackArchivo(Snack snack){
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try{
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(snack.escribirSnack());
            salida.close();
        }catch (Exception e){
            System.out.println("Error "+e);
        }
    }

    @Override
    public void mostrarSnacks() {

    }

    @Override
    public List<Snack> getSnacks() {
        return List.of();
    }
}
