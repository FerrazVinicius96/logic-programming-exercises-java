import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        final double PRECOLATA01 = 80.00;
        final double COBERTURA_POR_LATA01 = 108.0;

        final double PRECOLATA02 = 25.00;
        final double COBERTURA_POR_LATA02 = 21.6;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insira o tamanho em metros quadrados da área a ser pintada: ");
            double areaParaPintar = sc.nextDouble();

            String lata01 = calcularLata(areaParaPintar, PRECOLATA01, COBERTURA_POR_LATA01);
            System.out.println(lata01);

            String lata02 = calcularLata(areaParaPintar, PRECOLATA02, COBERTURA_POR_LATA02);
            System.out.println(lata02);

        }
    }

    public static String calcularLata(double areaParaPintar, double precoLata, double coberturaPorLata) {

        double latasCalculadas = areaParaPintar / coberturaPorLata;
        int quantidadeLatas = (int) Math.ceil(latasCalculadas);
        double precoTotal = quantidadeLatas * precoLata;

        return "Quantidade de latas necessárias: " + quantidadeLatas
                + "\nValor total: R$" + precoTotal;

    }
}
