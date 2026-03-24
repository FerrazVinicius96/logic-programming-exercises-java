import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número que deseja obter o fatorial: ");
        int numero = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println(fatorial);

        sc.close();
    }
}
