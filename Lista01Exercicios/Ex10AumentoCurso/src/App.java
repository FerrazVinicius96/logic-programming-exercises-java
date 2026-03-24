
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        final double AUMENTO = 1.075;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insira o nome do curso: ");
            String curso = sc.nextLine();

            System.out.print("Insira o valor do curso: ");
            double mensalidade = sc.nextDouble();

            double valorCursoAtualizado = mensalidade * AUMENTO;

            System.out.printf("%s - %.2f", curso, valorCursoAtualizado);
        }

    }
}
