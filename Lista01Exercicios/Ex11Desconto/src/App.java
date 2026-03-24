import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        final double DESCONTO = 0.045;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insira o nome do produto: ");
            String produto = sc.nextLine();

            System.out.print("Insira o preço: ");
            double preco = sc.nextDouble();

            double precoAtualizado = preco - (preco * DESCONTO);

            System.out.printf("%s - R$ %.2f", produto, precoAtualizado);
        }

    }
}