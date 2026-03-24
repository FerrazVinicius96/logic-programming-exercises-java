import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade em kgs de morango: ");
        double qtdMorango = sc.nextDouble();

        System.out.print("Insira a quantidade em kgs de maçã: ");
        double qtdMaca = sc.nextDouble();

        double precoMorango = qtdMorango * (qtdMorango <= 5 ? 2.5 : 2.2);
        double precoMaca = qtdMaca * (qtdMaca <= 5 ? 1.8 : 1.5);

        double totalQtd = qtdMorango + qtdMaca;
        double total = precoMorango + precoMaca;

        if (totalQtd > 8 || total > 25) {
            total *= 0.9;
        }

        System.out.printf("O cliente terá que pagar: %.2f%n", total);

        sc.close();
    }
}
