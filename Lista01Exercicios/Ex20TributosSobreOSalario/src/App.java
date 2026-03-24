
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        final double IR = 0.11;
        final double INSS = 0.08;
        final double SINDICATO = 0.05;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insira o valor recebido da hora trabalhada: ");
            double valorHora = sc.nextDouble();
            sc.nextLine();

            System.out.print("Insira a quantidade de horas trabalhadas no mês: ");
            double totalHorasMes = sc.nextDouble();
            sc.nextLine();

            double salarioBruto = valorHora * totalHorasMes;

            double valorIR = salarioBruto * IR;
            double valorINSS = salarioBruto * INSS;
            double valorSindicato = salarioBruto * SINDICATO;
            double salarioLiquido = salarioBruto - (valorIR + valorINSS + valorSindicato);

            System.out.printf("Salário bruto: R$ %.2f\n", salarioBruto);
            System.out.printf("Valor devido ao INSS: R$ %.2f\n", valorINSS);
            System.out.printf("Valor devido ao sindicato: R$ %.2f\n", valorSindicato);
            System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);

        }

    }
}
