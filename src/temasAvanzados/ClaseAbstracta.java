package temasAvanzados;

public class ClaseAbstracta {
    static void main() {

    }
}

//Clase Abstracta
abstract class FiguraGeometrica{ // no se pueden instanciar
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica{

    @Override
    public void dibujar(){
        System.out.println("se dibuja un rectangulo");
    }
}
