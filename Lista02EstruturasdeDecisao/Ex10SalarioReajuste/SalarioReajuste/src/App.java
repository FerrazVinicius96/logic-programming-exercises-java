
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o salário do colaborador: ");
        double salario = sc.nextDouble();

        Double reajuste;
        Double salarioAtualizado;

        if (salario <= 280) {
            reajuste = 0.2;
            salarioAtualizado = salario * (reajuste + 1);
        } else if (salario <= 700) {
            reajuste = 0.15;
            salarioAtualizado = salario * (reajuste + 1);
        } else if (salario <= 1500) {
            reajuste = 0.10;
            salarioAtualizado = salario * (reajuste + 1);
        } else {
            reajuste = 0.05;
            salarioAtualizado = salario * (reajuste + 1);
        }

        System.out.printf(
                "Salário antes do ajuste: %.2f\nPercentual de ajuste: %.2f\nValor de ajuste: %.2f\nSalário pós ajuste: %.2f\n",
                salario, reajuste * 100, salarioAtualizado - salario, salarioAtualizado);

        sc.close();
    }
}
