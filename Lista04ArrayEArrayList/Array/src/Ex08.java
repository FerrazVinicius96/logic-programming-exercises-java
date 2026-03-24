import java.util.Scanner;
import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        int[] array3 = new int[10];

        for (int i = 0; i < 5; i++) {

            System.out.print("Insira o " + i + " elemento da primeira lista:");
            array1[i] = sc.nextInt();

            array3[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {

            System.out.print("Insira o " + i + " elemento da segunda lista: ");
            array2[i] = sc.nextInt();

            array3[i + 5] = array2[i];
        }

        System.out.print(Arrays.toString(array3));

        sc.close();
    }
}
