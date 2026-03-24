import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a 1ª nota: ");
        double primeiraNota = sc.nextDouble();

        System.out.print("Insira a 2ª nota: ");
        double segundaNota = sc.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        char conceito = 0;
        String status = null;

        if (media < 4) {
            conceito = 'E';
        } else if (media <= 6) {
            conceito = 'D';
        } else if (media <= 7.5) {
            conceito = 'C';
        } else if (media <= 9.0) {
            conceito = 'B';
        } else if (media <= 10) {
            conceito = 'A';
        }

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            status = "APROVADO";
        } else {
            status = "REPROVADO";
        }

        System.out.printf("Primeira nota: %.2f\nSegunda nota: %.2f\nMédia: %.2f\n%c\n%s\n", primeiraNota, segundaNota,
                media, conceito, status);

        sc.close();
    }
}
