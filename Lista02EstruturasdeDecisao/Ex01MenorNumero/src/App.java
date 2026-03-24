
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int valor1 = sc.nextInt();

        System.out.print("Insira o segundo número: ");
        int valor2 = sc.nextInt();

        if (valor1 > valor2) {
            System.out.printf("O maior número é: %d%n", valor1);
        } else {
            System.out.printf("O maior número é %d%n", valor2);
        }

        sc.close();
    }
}
