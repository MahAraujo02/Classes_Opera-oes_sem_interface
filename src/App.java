import java.util.Scanner;

public class App {

    static div rDiv = new div();
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        int x, y;

        float resultado;

        System.out.println("digite um valor:");
        x = n.nextInt();
        System.out.println("digite um valor:");
        y = n.nextInt();

        resultado = rDiv.divisao(x,y);

        System.out.println(+resultado);
        


    }
}
