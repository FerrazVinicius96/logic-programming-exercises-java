/*

Desenvolva um programa que receba uma palavra do usuário e a armazene em um array de 
caracteres. O programa deve verificar se a palavra é um palíndromo (ou seja, se é igual quando lida 
de trás para frente) e exibir o resultado. 

*/

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = sc.nextLine();

        String textoLimpo = texto.replace(" ", "").toLowerCase();

        char[] caracteres = textoLimpo.toCharArray();

        boolean simPalindromo = true;
        int textoTotal = caracteres.length;

        for (int i = 0; i < textoTotal / 2; i++) {
            if (caracteres[i] != caracteres[textoTotal - 1 - i]) {
                simPalindromo = false;
                break;
            }
        }

        System.out.println("Palavra/texto original: " + texto);
        if (simPalindromo) {
            System.out.println("É palíndromo.");
        } else {
            System.out.println("Não é palíndromo.");
        }

        sc.close();
    }
}
