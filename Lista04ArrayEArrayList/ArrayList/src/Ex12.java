/*

Desenvolva um programa que receba um array de 10 notas de alunos (valores entre 0 e 10). O 
programa deve identificar e exibir a segunda maior nota.

*/

import java.util.Arrays;

public class Ex12 {
    public static void main(String[] args) {

        int[] notas = { 4, 1, 6, 2 };

        Arrays.sort(notas);

        System.out.printf("Segunda maior nota: %d%n", notas[notas.length - 2]);

    }
}
