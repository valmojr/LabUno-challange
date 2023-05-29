package desafio.lab1;

import java.util.Scanner;

public class Menu {
    public void iniciar() {
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("Bem vindo ao sistema de lojas\n");
            System.out.println("1 - Criar loja");
            System.out.println("2 - Criar produto");
            System.out.println("3 - Sair");
            System.out.println("\n\nDigite a opção desejada: ");
            opcao = new Scanner(System.in).nextInt();

            if (opcao > 3 || opcao < 1) {
                System.out.println("Opção inválida");
                continue;
            }
        }
    }
}
