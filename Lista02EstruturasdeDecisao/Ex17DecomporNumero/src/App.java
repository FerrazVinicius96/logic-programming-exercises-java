
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um  número menor que 1000: ");
        int numero = sc.nextInt();

        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = (numero % 10);

        if (numero < 0 || numero >= 1000) {
            System.out.println("Número inválido!");
        } else {
            centenas = numero / 100;
            dezenas = (numero % 100) / 10;
            unidades = numero % 10;

            if (centenas > 0) {
                System.out.println(centenas + (centenas > 1 ? " centenas" : " centena"));
            }
            if (dezenas > 0) {
                if (unidades > 0)
                    System.out.println(", ");
                else
                    System.out.println("e ");
                System.out.println(dezenas + (dezenas > 1 ? " dezenas " : " dezena"));
            }
            if (unidades > 0) {
                if (centenas > 0 || dezenas > 0) {
                    System.out.println("e ");
                }
                System.out.println(unidades + (unidades > 1 ? " unidades" : " unidade"));
            }

        }

        sc.close();
    }
}
