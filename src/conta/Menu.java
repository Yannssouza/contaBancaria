package conta;

import conta.util.Cores;

import java.util.Scanner;

public class Menu {

    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        while (true) {

            System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                BANCO MONEY, MONEY, MONEY            ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Criar Conta                          ");
            System.out.println("            2 - Listar todas as Contas               ");
            System.out.println("            3 - Buscar Conta por Numero              ");
            System.out.println("            4 - Atualizar Dados da Conta             ");
            System.out.println("            5 - Apagar Conta                         ");
            System.out.println("            6 - Sacar                                ");
            System.out.println("            7 - Depositar                            ");
            System.out.println("            8 - Transferir valores entre Contas      ");
            System.out.println("            9 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     ");
            opcao = leia.nextInt();

            if(opcao == 9) {
                System.out.println("\nBanco Money, Money, Money - Guarde seu dinheiro aqui!");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1 -> System.out.println("\n Criar Conta");
                case 2 -> System.out.println("\n Listar todas as Contas");
                case 3 -> System.out.println("\n Buscar Conta por número");
                case 4 -> System.out.println("\n Atualizar dados da Conta");
                case 5 -> System.out.println("\n Apagar Conta");
                case 6 -> System.out.println("\n Sacar");
                case 7 -> System.out.println("\n Depositar");
                case 8 -> System.out.println("\n Transferir");
                default -> System.out.println("\nOpção Inválida");
            }
        }
    }
    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Yann");
        System.out.println("github.com");
        System.out.println("*********************************************************");
    }
}
