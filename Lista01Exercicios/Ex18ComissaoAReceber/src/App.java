
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insira o salário fixo do vendedor: ");
            double salarioFixo = sc.nextDouble();
            sc.nextLine();

            System.out.print("Insira o valor total de vendas do vendedor no mês: ");
            double vendaMes = sc.nextDouble();
            sc.nextLine();

            double comissaoVendas = vendaMes * 0.15;

            double salarioFinal = salarioFixo + comissaoVendas;

            System.out.printf("R$ %.2f", salarioFinal);
        }

    }
}
