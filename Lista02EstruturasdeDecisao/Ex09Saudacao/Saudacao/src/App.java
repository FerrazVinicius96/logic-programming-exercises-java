import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seu turno\n[M] - Manhã\n[V] - Vespertino\n[N] - Noturno\n-->");
        char turno = sc.next().toUpperCase().charAt(0);
        String saudacao = "";

        switch (turno) {
            case 'M':
                saudacao = "Bom dia.\n";
                break;
            case 'V':
                saudacao = "Boa tarde.\n";
                break;
            case 'N':
                saudacao = "Boa noite.\n";
                break;
            default:
                saudacao = "Turno inválido.\n";
                break;
        }

        System.out.printf("%s\n", saudacao);

        sc.close();
    }
}
