package ciclos;

public class CicloFor {
    static void main() {
        for (int i =0; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("");
        //numeros pares
        for (int x=0; x<=20; x++){
            if(x % 2 ==0)
                System.out.print(x+", ");
        }
    }
}
