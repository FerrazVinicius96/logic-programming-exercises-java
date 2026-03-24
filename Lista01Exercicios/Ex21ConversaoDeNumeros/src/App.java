import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        final double PRECOLATA = 80.00;
        final double COBERTURA_POR_LATA = 54.0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insira o tamanho em metros quadrados da área a ser pintada: ");
            double areaParaPintar = sc.nextDouble();

            // cálculo bruto
            double latasCalculadas = areaParaPintar / COBERTURA_POR_LATA;

            // arredondamento para cima
            int quantidadeLatas = (int) Math.ceil(latasCalculadas);

            double precoTotal = quantidadeLatas * PRECOLATA;

            System.out.println("Quantidade de latas necessárias: " + quantidadeLatas);
            System.out.printf("Valor total: R$ %.2f%n", precoTotal);
        }
    }
}
