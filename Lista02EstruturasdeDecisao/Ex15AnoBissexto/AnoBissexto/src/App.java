
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira ano: ");
        int ano = sc.nextInt();

        boolean anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 100 == 0) ? true : false;

        System.out.printf("Ano: %d, bissexto: %b%n", ano, anoBissexto);

        sc.close();
    }
}
