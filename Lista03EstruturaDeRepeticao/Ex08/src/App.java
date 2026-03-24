import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int i = 0;
        double soma = 0;
        double media = 0;

        while (i < 5) {
            System.out.printf("Insira o %d número: ", i + 1);
            double numero = sc.nextDouble();

            soma += numero;

            i++;
        }

        media = soma / i;

        System.out.println(soma);
        System.out.println(media);

        sc.close();
    }
}
