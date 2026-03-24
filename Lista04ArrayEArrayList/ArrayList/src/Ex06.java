/*

Crie um programa que adicione, liste, pesquise e remova nomes

*/

import java.util.Scanner;
import java.util.ArrayList;

public class Ex06 {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {

            ArrayList<String> listaNomes = new ArrayList<>();
            boolean programaEmExecucao = true;

            while (programaEmExecucao) {
                System.out.println("--- MENU ---");
                System.out.println("1 - Adicionar nome");
                System.out.println("2 - Listar nomes");
                System.out.println("3 - Pesquisar nome");
                System.out.println("4 - Remover nome");
                System.out.println("0 - Sair");
                System.out.print("Insira: ");

                int opcao;

                if (sc.hasNextInt()) {
                    opcao = sc.nextInt();
                    sc.nextLine();
                } else {
                    System.out.println("Insira uma opção válida.");
                    continue;
                }

                switch (opcao) {
                    case 1:
                        System.out.print("Insira o nome para inserir: "); // CRIAR VERIFICAÇÃO SE É STRING
                        String nome = sc.nextLine();

                        listaNomes.add(nome);

                        System.out.printf("Nome '%s' inserido com sucesso!", nome);
                        System.out.println();
                        // Adicionar nome
                        break;
                    case 2:
                        if (listaNomes.isEmpty()) {
                            System.out.println("Lista vazia.");
                            break;
                        } else {
                            System.out.println("Lista de nomes: ");
                            for (String nomeNaLista : listaNomes) {
                                System.out.println(nomeNaLista);
                            }
                        }
                        System.out.println();
                        // Listar nomes
                        break;
                    case 3:
                        // Pesquisar nome
                        break;
                    case 4:
                        // Remover nome
                        break;
                    case 0:
                        programaEmExecucao = false;
                        break;
                    default:
                        // Opção inválida
                        break;
                }
            }
        }
    }
}
