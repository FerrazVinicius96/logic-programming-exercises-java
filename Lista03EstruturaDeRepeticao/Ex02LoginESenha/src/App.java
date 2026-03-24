/*
Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome 
do usuário, mostrando uma mensagem de erro e voltando a pedir as informações. 

*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String nome = "";
        String senha = "";

        while (true) {
            System.out.print("Insira o login do usuário: ");
            nome = sc.nextLine();

            System.out.print("Insira a senha do usuário: ");
            senha = sc.nextLine();

            if (nome.equals(senha)) {
                System.out.println("Senha inválida.");
            } else {
                System.out.println("Credenciais válidas.");
                break;
            }
        }
        sc.close();
    }
}
