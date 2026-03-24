/*

Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de 
crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento 
de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a 
população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a população de A: ");
        double populacaoA = sc.nextDouble();

        System.out.print("Insira a população de B: ");
        double populacaoB = sc.nextDouble();

        System.out.print("Insira a taxa de crescimento de A: ");
        double taxaCrescimentoA = sc.nextDouble();
        taxaCrescimentoA = taxaCrescimentoA / 100;
        System.out.println(taxaCrescimentoA);

        System.out.print("Insira a taxa de crescimento de B: ");
        double taxaCrescimentoB = sc.nextDouble();
        taxaCrescimentoB = taxaCrescimentoB / 100;
        System.out.println(taxaCrescimentoB);

        int contador = 0;

        while (populacaoA < populacaoB) {
            populacaoA += (populacaoA * taxaCrescimentoA);
            populacaoB += (populacaoB * taxaCrescimentoB);
            contador += 1;
        }

        System.out.printf("Foram necessários %d anos", contador);

        sc.close();
    }
}
