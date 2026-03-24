
/*
Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja 
inválido e continue pedindo até que o usuário informe um valor válido.
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numero = -1;

        while (true) {
            System.out.print("Insira um numero entre 0 e 10: ");
            numero = sc.nextInt();
            if (numero >= 0 && numero <= 10) {
                System.out.printf("Número inserido: [%d] é válido.%n", numero);
                break;
            }
            System.out.println("Entrada inválida.");
        }

        sc.close();
    }
}
