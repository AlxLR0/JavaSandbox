package cadenas;

public class SubCadenas {
    static void main() {
        //subcadenas
        var cadena1= "hola mundo";
        System.out.println("cadena1 = " + cadena1);

        //indice de inicio (0) - indice final (4) este ultimo no se toma en cuenta
        var subCadena= cadena1.substring(0,4);
        System.out.println("subCadena = " + subCadena);

        //indice apatir del 5 hasta el final
        var subCadena2 = cadena1.substring(5);
        System.out.println("subCadena2 = " + subCadena2);


        //busqueda de subcadenas indexOf
        //sub cadena a buscar= "hola"
        var indice1= cadena1.indexOf("hola");
        System.out.println("indice1 = " + indice1);

        //lastIndexOf- devuelve el indice de la ultima aparicion de la subcadena
        var indice2 = cadena1.lastIndexOf("mundo");
        System.out.println("indice2 = " + indice2);
        
        //templazar "mundo" por "a todos"
        var nuevaCadena = cadena1.replace("mundo","a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
