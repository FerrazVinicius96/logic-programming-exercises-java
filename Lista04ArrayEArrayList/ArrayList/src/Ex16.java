/*

Escreva um programa que receba uma string do usuário e armazene cada caractere em um array de 
caracteres. O programa deve contar e exibir o número de vogais (a, e, i, o, u) presentes na string.

*/

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
        int[] frequenciaVogais = new int[5];

        System.out.print("Insira um nome: ");
        String nome = sc.nextLine();

        char[] nomeArray = nome.toCharArray();

        for (int i = 0; i < nomeArray.length; i++) {
            for (int j = 0; j < vogais.length; j++) {
                if (nomeArray[i] == vogais[j]) {
                    ++frequenciaVogais[j];
                }
            }
        }

        System.out.println("Letra   Frequência");

        for (int i = 0; i < vogais.length; i++) {
            System.out.printf("%c%10d\n", vogais[i], frequenciaVogais[i]);
        }

        sc.close();
    }
}
