
import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Insira a quantidade de horas trabalhadas: ");
            int qtdHoras = sc.nextInt();

            System.out.print("Insira o valor da hora aula: ");
            double valorHora = sc.nextDouble();

            double salario = salario(qtdHoras, valorHora);
            System.out.println("R$ " + salario);
        } catch (InputMismatchException e) {
            System.err.print("Error: " + e.getMessage());
        }

    }

    public static double salario(int qtdHoras, double valorHora) {
        return qtdHoras * valorHora;
    }
}
