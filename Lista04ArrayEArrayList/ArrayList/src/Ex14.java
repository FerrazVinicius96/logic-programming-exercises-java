/*

Escreva um programa que receba dois arrays de inteiros, cada um com 5 elementos, e crie um 
terceiro array contendo os elementos que aparecem em ambos os arrays originais. Exiba o array 
resultante da interseção. 

*/

import java.util.ArrayList;

public class Ex14 {
    public static void main(String[] args) {

        int[] array1 = { 1, 2, 3, 4, 8 };
        int[] array2 = { 1, 2, 6, 7, 8 };

        ArrayList<Integer> elementosIguais = new ArrayList<>();

        int maiorArray = (array1.length > array2.length ? array1.length : array2.length);

        for (int i = 0; i < maiorArray; i++) {
            for (int j = 0; j < maiorArray; j++) {
                if (array1[i] == array2[j]) {
                    elementosIguais.add(array1[i]);
                }
            }
        }

        System.out.print(elementosIguais.toString());

    }
}
