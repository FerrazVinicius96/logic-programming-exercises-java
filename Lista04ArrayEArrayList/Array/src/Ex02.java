/*

Escreva um programa que receba um array de 5 números inteiros, calcule e exiba a soma e a média 
dos valores armazenados no array. 

*/

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int media = 0;

        Integer[] array = new Integer[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira o " + i + " elemento: ");
            array[i] = sc.nextInt();
        }

        for (Integer item : array) {

            soma += item;

        }

        media = soma / array.length;

        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);

        sc.close();
    }
}
