/*

Crie um programa que receba 10 números inteiros e os armazene em um array. Em seguida, o 
programa deve exibir os números na ordem inversa à que foram inseridos.

*/

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Integer[] lista = new Integer[10];

        for (int i = 0; i < lista.length; i++) {

            System.out.print("Insira o " + i + " elemento: ");
            lista[i] = sc.nextInt();

        }

        for (int j = lista.length - 1; j >= 0; j--) {
            System.out.println(lista[j]);
        }

        sc.close();
    }
}
