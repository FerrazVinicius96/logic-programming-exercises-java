
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insira a altura de uma pessoa: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            System.out.print("Insira: \n[M] - Masculino\n[F] - Feminino\n-->");
            char sexo = sc.next().toUpperCase().charAt(0);
            sc.nextLine();

            Double pesoIdeal = null;
            switch (sexo) {
                case 'M':
                    pesoIdeal = (72.7 * altura) - 58;
                    break;
                case 'F':
                    pesoIdeal = (62.1 * altura) - 44.7;
                    break;
                default:
                    System.out.print("Insira uma opção válida.\n");
                    break;
            }
            System.out.printf("Peso ideal: %.1f Kg", pesoIdeal);
        }

    }
}
