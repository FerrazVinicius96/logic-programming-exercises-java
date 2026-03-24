import java.util.Arrays;
import java.util.ArrayList;

public class Ex09Versao2 {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 4, 5, 6, 7, 9, 9 };
        ArrayList<Integer> arraySemDuplicados = new ArrayList<Integer>();
        boolean itemRepetido = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    itemRepetido = true;
                }
            }
            if (!itemRepetido) {
                arraySemDuplicados.add(array[i]);
            }
            itemRepetido = false;
        }

        System.out.println("Array original: " + Arrays.toString(array));
        System.out.println("Array sem duplicados: " + arraySemDuplicados.toString());
    }
}
