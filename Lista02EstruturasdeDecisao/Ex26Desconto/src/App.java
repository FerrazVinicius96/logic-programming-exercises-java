import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira 1-File Duplo | 2-Alcatra | 3-Picanha: ");
        int opcaoCarne = sc.nextInt();

        System.out.print("Insira quantos Kgs: ");
        double qtdCarne = sc.nextDouble();

        String carneEscolhida;
        double precoKg;

        switch (opcaoCarne) {
            case 1:
                carneEscolhida = "File Duplo";
                precoKg = (qtdCarne > 5) ? 5.80 : 4.90;
                break;
            case 2:
                carneEscolhida = "Alcatra";
                precoKg = (qtdCarne > 5) ? 6.80 : 5.90;
                break;
            case 3:
                carneEscolhida = "Picanha";
                precoKg = (qtdCarne > 5) ? 7.80 : 6.90;
                break;
            default:
                System.out.println("Opção inválida.");
                sc.close();
                return;
        }

        double totalBruto = qtdCarne * precoKg;

        System.out.print("Forma de pagamento (1-Cartão Tabajara | 2-Débito | 3-Crédito): ");
        int formaPagamento = sc.nextInt();

        String pagamentoExtenso;
        double desconto = 0.0;

        switch (formaPagamento) {
            case 1:
                pagamentoExtenso = "Cartão Tabajara";
                desconto = totalBruto * 0.05;
                break;
            case 2:
                pagamentoExtenso = "Débito";
                break;
            case 3:
                pagamentoExtenso = "Crédito";
                break;
            default:
                pagamentoExtenso = "Forma inválida";
        }

        double totalFinal = totalBruto - desconto;

        System.out.println("\n--- CUPOM FISCAL ---");
        System.out.println("Carne: " + carneEscolhida);
        System.out.println("Quantidade: " + qtdCarne + " Kg");
        System.out.printf("Preço total: R$ %.2f%n", totalBruto);
        System.out.println("Pagamento: " + pagamentoExtenso);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor a pagar: R$ %.2f%n", totalFinal);

        sc.close();
    }
}
