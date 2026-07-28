package POO.herencia;

public class Animal {
    //protected quiere decir que no puede ser accedido a otras clases que no sean clases hijas
    protected void comer(){
        System.out.println("🍔");
    }

    protected void dormir(){
        System.out.println("💤");
    }
}


class Perro extends Animal{
    public void hacersonido(){
        System.out.println("🐶GUAU!");
    }

    //sobre escritura en los metodos heredados
    @Override
    protected void comer(){
        System.out.println("🐶🍔");
    }

    @Override
    protected void dormir(){
        System.out.println("🐶💤");

        //acceder al metodo original de la clase padre
        super.dormir();
    }

}

class pruebaAnimal{
    static void main() {
        System.out.println("*** HERENCIA PRO ***");

        //acceder a clase padre
        var animal1= new Animal();
        animal1.comer();
        animal1.dormir();

        //acceder a clase hija
        var perro1 = new Perro();
        perro1.comer();
        perro1.dormir();

        //acceder a metodos propios de clase hija
        perro1.hacersonido();

    }
}
