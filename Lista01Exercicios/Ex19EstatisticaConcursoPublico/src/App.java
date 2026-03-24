
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insira a quantidade de participantes presentes homens: ");
            int homens = sc.nextInt();
            sc.nextLine();

            System.out.print("Insira a quantidade de participantes presentes mulheres: ");
            int mulheres = sc.nextInt();
            sc.nextLine();

            System.out.print("Insira a quantidade de ausentes: ");
            int ausentes = sc.nextInt();
            sc.nextLine();

            double p1 = (double) (homens * 100) / (homens + mulheres + ausentes);
            double p2 = (double) (ausentes * 100) / (homens + mulheres);

            System.out.printf("P1 = %.4f%%%n", p1);
            System.out.printf("P2 = %.4f%%%n", p2);

        }

    }
}
