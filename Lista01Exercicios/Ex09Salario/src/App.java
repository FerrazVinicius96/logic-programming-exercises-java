/*

A empresa Treina Recife remunera seus professores por hora, logo precisa que você escreva 
um programa que receba do teclado a quantidade de horas trabalhadas por um professor no mês 
e o valor da hora trabalhada.

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Insira o nome do professor: ");
            String nome = sc.nextLine();

            System.out.print("Insira o valor da hora aula: ");
            double valorHora = sc.nextDouble();

            Professor professor = new Professor(nome, valorHora);

            int mesRegistro;

            do {
                System.out.print("Insira o mês de registro ou 0 para encerrar: ");
                mesRegistro = sc.nextInt();

                if (mesRegistro != 0) {
                    System.out.print("Insira a quantidade de horas trabalhadas: ");
                    int qtdHoras = sc.nextInt();

                    if (!professor.getMesHrTrabalhada().containsKey(mesRegistro)) {
                        professor.addRegistro(mesRegistro, qtdHoras);
                    } else {
                        System.out.println("Mês já registrado.");
                    }
                }

            } while (mesRegistro != 0);

            System.out.print("Insira mês que deseja obter a remuneração mensal: ");
            int mesConsulta = sc.nextInt();

            if (professor.getMesHrTrabalhada().containsKey(mesConsulta)) {
                System.out
                        .println("Professor: " + professor.getNome() + "\n" + "Remuneção do mês: [" + mesConsulta
                                + "] R$"
                                + professor.getRemuneracaoMensal(mesConsulta));
            } else {
                System.out.println("Mês não registrado.");
            }

        } catch (InputMismatchException e) {
            System.err.print("Error: " + e.getMessage());
        }

    }
}
