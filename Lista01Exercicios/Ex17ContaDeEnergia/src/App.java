
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Insira o valor do salário mínimo: ");
            double salarioMinimo = sc.nextDouble();
            sc.nextLine();

            System.out.print("Insira a quantidade de Kw consumida: ");
            int energiaConsumida = sc.nextInt();
            sc.nextLine();

            double valorKw = salarioMinimo / 1000;
            double contaDeEnergia = energiaConsumida * valorKw;
            double contaDeEnergiaDescontada = contaDeEnergia - (contaDeEnergia * 0.15);

            System.out.printf("Valor kw: R$ %.3f\n", valorKw);
            System.out.printf("Valor da conta: R$ %.2f\n", contaDeEnergia);
            System.out.printf("Valor com desconto: R$ %.2f", contaDeEnergiaDescontada);

        }

    }
}
