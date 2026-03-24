import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as tres notas do aluno: ");

        double nota1 = sc.nextDouble();
        if (nota1 < 0 || nota1 > 10) {
            System.out.print("Entrada inválida.\n");
            return;
        }
        double nota2 = sc.nextDouble();
        if (nota1 < 0 || nota1 > 10) {
            System.out.print("Entrada inválida.\n");
            return;
        }
        double nota3 = sc.nextDouble();
        if (nota1 < 0 || nota1 > 10) {
            System.out.print("Entrada inválida.\n");
            return;
        }

        double media = (nota1 + nota2 + nota3) / 3;
        String status = " ";

        if (media < 7) {
            status = "Reprovado";
        } else if (media < 10) {
            status = "Aprovado";
        } else {
            status = "Aprovado com distinção.";
        }

        System.out.printf("Média: %.2f Aluno: %s", media, status);

        sc.close();
    }
}
