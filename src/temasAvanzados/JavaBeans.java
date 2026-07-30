/*
* bean (o JavaBean) es simplemente una clase que sigue reglas de diseño estándar: sus atributos son privados, tiene un constructor vacío
*  y cuenta con métodos get y set públicos para acceder a ellos. Se utilizan para encapsular datos y facilitar la reutilización de código.
* */

package temasAvanzados;

import java.io.Serializable;

public class JavaBeans {
    static void main() {
        var persona = new Persona();
        persona.setNombre("fulanito");
        persona.setApellido("detal");
        System.out.println("persona = " + persona);
    }
}

class Persona implements Serializable {

    private String nombre;
    private String apellido;

    public Persona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
