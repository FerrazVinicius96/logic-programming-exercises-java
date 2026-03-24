import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o dia da semana desejado: ");
        int diaInteiro = sc.nextInt();

        switch (diaInteiro) {
            case 1:
                System.out.printf("%d - Domingo\n", diaInteiro);
                break;
            case 2:
                System.out.printf("%d - Segunda\n", diaInteiro);
                break;
            case 3:
                System.out.printf("%d - Terça\n", diaInteiro);
                break;
            case 4:
                System.out.printf("%d - Quarta\n", diaInteiro);
                break;
            case 5:
                System.out.printf("%d - Quinta\n", diaInteiro);
                break;
            case 6:
                System.out.printf("%d - Sexta\n", diaInteiro);
                break;
            case 7:
                System.out.printf("%d - Sábado\n", diaInteiro);
                break;
            default:
                System.out.printf("%d Inválido - Insira um número de 1 - 7\n", diaInteiro);
                break;
        }
        sc.close();
    }
}
