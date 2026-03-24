/*

Implemente um programa que receba 8 números inteiros e os armazene em um array. O programa 
deve encontrar e exibir o maior e o menor valor presente no array.

*/

import java.util.Scanner;
import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira o " + i + " elemento");
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        int max = array[array.length - 1];
        int min = array[0];

        System.out.println("Maior valor: " + max);
        System.out.println("Menor valor: " + min);

        sc.close();
    }
}
