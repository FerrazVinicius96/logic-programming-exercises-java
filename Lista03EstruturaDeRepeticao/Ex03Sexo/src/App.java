/*
Faça um programa que leia e valide as seguintes informações: 
a) Nome: maior que 3 caracteres; 
b) Idade: entre 0 e 150; 
c) Salário: maior que zero; 
d) Sexo: 'f' ou 'm'; 
e) Estado Civil: 's', 'c', 'v', 'd'; 
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String nome = "";
        int idade = 0;
        double salario = 0.0;
        char sexo;
        char estadoCivil;

        while (true) {
            do {
                System.out.print("Insira o nome do usuário: ");
                nome = sc.nextLine();
            } while (nome.length() < 3);

            do {
                System.out.print("Insira a idade do usuário: ");
                idade = sc.nextInt();
            } while (idade < 0 || idade > 150);

            do {
                System.out.print("Insira o salário: ");
                salario = sc.nextDouble();
            } while (salario < 0);

            do {
                System.out.print("Insira o sexo M ou F: ");
                sexo = sc.next().toLowerCase().charAt(0);
            } while (sexo != 'm' && sexo != 'f');

            do {
                System.out.print("Insira o estado civil (S/C/V/D): ");
                estadoCivil = sc.next().toLowerCase().charAt(0);
            } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

            System.out.printf("Nome: %s%nIdade: %d%nSalário: %.2f%nSexo: %c%nEstado Civil: %c%n", nome, idade, salario,
                    sexo, estadoCivil);

            break;
        }

        sc.close();
    }
}
