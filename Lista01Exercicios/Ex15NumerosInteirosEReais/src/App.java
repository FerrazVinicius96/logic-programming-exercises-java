
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Insira dois números inteiros e um número real: ");
            int n1 = sc.nextInt();

            int n2 = sc.nextInt();

            double n3 = sc.nextDouble();

            double primeiraOperacao = (n1 * 2) + (double) n2 / 2;
            System.out.println("Resultado da primeira operação: " + primeiraOperacao);

            double segundaOperacao = (n1 * 3) + n3;
            System.out.println("Resultado da segunda operação: " + segundaOperacao);

            double terceiraOperacao = n3 * n3 * n3;
            System.out.println("Resultado da terceira operação: " + terceiraOperacao);
        }
    }
}
