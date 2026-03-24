
/*

Desenvolva um programa que receba 10 números inteiros e os armazene em um array. O programa 
deve ordenar os números em ordem crescente e exibir o array ordenado.

*/
import java.util.Scanner;
import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira o número: ");
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        sc.close();
    }
}
