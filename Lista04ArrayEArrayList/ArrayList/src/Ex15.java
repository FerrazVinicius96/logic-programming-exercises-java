/*

Desenvolva um programa em Java que permita ao usuário inserir números inteiros em um ArrayList. 
O programa deve garantir que os números sejam inseridos na posição correta para manter o 
ArrayList sempre ordenado em ordem crescente.

*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        boolean programaEmExecucao = true;

        while (programaEmExecucao) {
            if (lista.isEmpty()) {
                System.out.print("Insira o primeiro número da lista ordenada: ");
                int primeiroNumero = sc.nextInt();

                lista.add(primeiroNumero);
            } else {
                System.out.println("Lista atual: " + lista.toString());

                System.out.print("Insira o próximo número da lista ordenada (maior que o antecessor): ");
                int proximoNumero = sc.nextInt();

                if (proximoNumero < lista.getLast()) {
                    System.out.println("Número inválido. Adicione número maior que o antecessor.");
                } else {
                    lista.add(proximoNumero);
                }
            }
        }

        sc.close();
    }

}
