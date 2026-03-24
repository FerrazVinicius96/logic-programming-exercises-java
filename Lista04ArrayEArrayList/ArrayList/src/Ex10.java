/*

Crie um programa que receba 5 números inteiros, armazene-os em um array, e em seguida, 
converta esse array para um ArrayList. Exiba o ArrayList resultante. 

*/

import java.util.ArrayList;

public class Ex10 {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5 };

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int item : array) {
            arrayList.add(item);
        }

        System.out.print(arrayList.toString());

    }
}
