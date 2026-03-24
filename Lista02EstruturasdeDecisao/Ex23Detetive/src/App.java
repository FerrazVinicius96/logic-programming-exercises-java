
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Integer contador = 0;
        String classificacao = "";

        System.out.print("Telefonou para a vítima? 1-Sim/0-Não");
        int telefonou = sc.nextInt();

        System.out.print("Esteve no local do crime? 1-Sim/0-Não");
        int local = sc.nextInt();

        System.out.print("Mora perto da vítima? 1-Sim/0-Não");
        int mora = sc.nextInt();

        System.out.print("Devia para a vítima? 1-Sim/0-Não");
        int debito = sc.nextInt();

        System.out.print("Já trabalhou com a vítima? 1-Sim/0-Não");
        int trabalho = sc.nextInt();

        contador = telefonou + local + mora + debito + trabalho;

        if (contador == 2) {
            classificacao = "Suspeito";
        } else if (contador <= 4) {
            classificacao = "Cúmplice";
        } else if (contador == 5) {
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }

        System.out.println(classificacao);
        sc.close();
    }
}
