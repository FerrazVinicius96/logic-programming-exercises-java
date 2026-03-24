
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insira o valor de a: ");
            double a = sc.nextDouble();

            if (a == 0) {
                System.out.print("Não é equação do segundo grau.\n");
                return;
            }

            System.out.print("Insira o valor de b: ");
            double b = sc.nextDouble();

            System.out.print("Insira o valor de c: ");
            double c = sc.nextDouble();

            double delta = Math.pow(b, 2) - (4 * a * c);
            Double x, x1, x2 = 0.0;

            if (delta < 0) {
                System.out.print("A equação não possui raízes.");
                return;
            } else if (delta == 0) {
                x = (-b) / (2 * a);
                System.out.printf("Possui uma raíz real: %.2f", x);
            } else {
                x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Possui duas raízes reais:\nx1= %.2f\nx2= %.2f", x1, x2);
            }
        }
    }
}
