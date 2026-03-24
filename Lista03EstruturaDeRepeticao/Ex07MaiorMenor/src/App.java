import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int i = 0;
        int numero = 0;
        int maior = -1;
        int menor = 10000;

        while (i < 5) {
            System.out.printf("Insira o %d número: ", i + 1);
            numero = sc.nextInt();

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
