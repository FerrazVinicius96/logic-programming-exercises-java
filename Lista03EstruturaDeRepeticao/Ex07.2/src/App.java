import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double i = 1;
        double maior = 0;
        double menor = 10000;

        while (i <= 5) {
            System.out.printf("Insira o %d número: ", i);
            double numero = sc.nextDouble();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            i++;
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        sc.close();
    }
}
