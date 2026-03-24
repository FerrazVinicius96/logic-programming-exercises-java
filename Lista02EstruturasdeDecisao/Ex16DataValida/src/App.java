import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a data (dd/mm/aaaa): ");
        String data = sc.nextLine();

        boolean dataValida = true;

        int dia = 0, mes = 0, ano = 0;

        String[] partes = data.split("/");

        if (partes.length != 3) {
            dataValida = false;
        } else {
            dia = Integer.parseInt(partes[0]);
            mes = Integer.parseInt(partes[1]);
            ano = Integer.parseInt(partes[2]);
        }

        if (ano <= 0) {
            dataValida = false;
        }

        if (mes < 1 || mes > 12) {
            dataValida = false;
        }

        if (dataValida) {

            int maxDias = 0;

            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
                    mes == 8 || mes == 10 || mes == 12) {

                maxDias = 31;

            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

                maxDias = 30;

            } else if (mes == 2) {

                boolean bissexto;

                if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
                    bissexto = true;
                } else {
                    bissexto = false;
                }

                if (bissexto) {
                    maxDias = 29;
                } else {
                    maxDias = 28;
                }
            }

            if (dia < 1 || dia > maxDias) {
                dataValida = false;
            }
        }

        if (dataValida) {
            System.out.println("Data válida!");
        } else {
            System.out.println("Data inválida!");
        }

        sc.close();
    }
}
