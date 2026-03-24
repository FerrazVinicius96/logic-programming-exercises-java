/*

Escreva um programa que receba 20 números inteiros e os armazene em um array. O programa 
deve calcular e exibir quantas vezes cada número aparece no array.

*/

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        int qtdItem = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira o " + i + " elemento: ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] == array[j]) {
                    qtdItem += 1;
                }
            }
            System.out.println("Elemento: " + array[i] + " aparece " + qtdItem + " vezes");
            qtdItem = 0;
        }

        sc.close();
    }
}
