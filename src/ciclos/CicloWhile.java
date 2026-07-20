package ciclos;

public class CicloWhile {
    static void main() {
        var i = 1;
        while (i <=5){
            System.out.println(i);
            i++;
        }
        System.out.println("");
        //numero pares
        var x =1;
        while (x <=20){
            if (x % 2 ==0)
                System.out.print(x+", ");
            x++;
        }

        System.out.println("");
        //do while
        var y = 1;
        do {
            System.out.println(y++);
        } while (y<=3);
    }
}
