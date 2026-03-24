import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        final double GASOLINA = 2.50;
        final double ALCOOL = 1.90;

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira 'A' - Álcool/'G' - Gasolina: ");
        char combustivel = sc.next().toUpperCase().charAt(0);

        System.out.print("Insira a quantidade de litros: ");
        double qtdLitros = sc.nextDouble();

        Double valorSemDesconto = 0.0;
        Double valorComDesconto = 0.0;
        Double desconto = 0.0;

        switch (combustivel) {
            case 'A':
                if (qtdLitros < 20) {
                    valorSemDesconto = (qtdLitros * ALCOOL);
                    desconto = (0.03 * qtdLitros);
                    valorComDesconto = valorSemDesconto - desconto;
                } else if (qtdLitros >= 20) {
                    valorSemDesconto = (qtdLitros * ALCOOL);
                    desconto = (0.05 * qtdLitros);
                    valorComDesconto = valorSemDesconto - desconto;
                }
                break;
            case 'G':
                if (qtdLitros < 20) {
                    valorSemDesconto = (qtdLitros * GASOLINA);
                    desconto = (0.04 * qtdLitros);
                    valorComDesconto = valorSemDesconto - desconto;
                } else if (qtdLitros >= 20) {
                    valorSemDesconto = (qtdLitros * GASOLINA);
                    desconto = (0.06 * qtdLitros);
                    valorComDesconto = valorSemDesconto - desconto;
                }
                break;
            default:
                System.out.print("Tipo de combustível inserido é inválido.\n");
                break;
        }

        System.out.printf("Valor a ser pago pelo cliente: %.2f", valorComDesconto);

        sc.close();
    }
}
