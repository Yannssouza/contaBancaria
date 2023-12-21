package conta;

import conta.controller.ContaController;
import conta.util.Cores;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        ContaController contas = new ContaController();

        Scanner leia = new Scanner(System.in);

        int opcao, numero, agencia, tipo, aniversario;
        String titular;
        float saldo, limite;

        while (true) {

            System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND +
                               "*****************************************************");
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
            System.out.println("                                                     " + Cores.TEXT_RESET);

            try {
                opcao = leia.nextInt();
            }catch(InputMismatchException e){
                System.out.println("\nDigite valores inteiros!");
                leia.nextLine();
                opcao=0;
            }

            if(opcao == 9) {
                System.out.println("\nBanco Money, Money, Money - Guarde seu dinheiro aqui!");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1 -> {
                    System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
                    keyPress();
                }
                case 2 -> {
                    System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
                    contas.listarTodas();
                    keyPress();
                }
                case 3 -> {
                    System.out.println(Cores.TEXT_WHITE + "Buscar Conta por número\n\n");
                    keyPress();
                }
                case 4 -> {
                    System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
                    keyPress();
                }
                case 5 -> {
                    System.out.println(Cores.TEXT_WHITE + "Apagar Conta\n\n");
                    keyPress();
                }
                case 6 -> {
                    System.out.println(Cores.TEXT_WHITE + "Sacar\n\n");
                    keyPress();
                }
                case 7 -> {
                    System.out.println(Cores.TEXT_WHITE + "Depositar\n\n");
                    keyPress();
                }
                case 8 -> {
                    System.out.println(Cores.TEXT_WHITE + "Transferir\n\n");
                    keyPress();
                }
                default -> {
                    System.out.println(Cores.TEXT_RESET + "Opção Inválida\n\n");
                    keyPress();
                }
            }
        }
    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Yann");
        System.out.println("github.com");
        System.out.println("*********************************************************");
    }

    public static void keyPress() {

        try {

            System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
            System.in.read();

        } catch (IOException e) {

            System.out.println("Você pressionou uma tecla diferente de enter!");

        }
    }
}