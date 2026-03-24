/*

Implemente um programa que receba 10 números inteiros e os armazene em um array. O programa 
deve remover todos os elementos duplicados do array e exibir o array resultante, sem duplicatas. 

*/

import java.util.Arrays;
import java.util.ArrayList;

public class Ex09 {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 4, 5, 6, 7, 9, 9 };
        ArrayList<Integer> arraySemDuplicados = new ArrayList<Integer>();
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    contador += 1;
                }
            }
            if (contador == 1) {
                arraySemDuplicados.add(array[i]);
            }
            contador = 0;
        }

        System.out.println("Array original: " + Arrays.toString(array));
        System.out.println("Array sem duplicados: " + arraySemDuplicados.toString());
    }
}
