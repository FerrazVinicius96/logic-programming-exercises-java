
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.printf("O número inserido '%d' é positivo%n", numero);
        } else {
            System.out.printf("O número inserido '%d' é negativo%n", numero);
        }

        sc.close();
    }
}
