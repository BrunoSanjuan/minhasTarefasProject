package org.bruno.gestaoTarefas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import static org.bruno.gestaoTarefas.GerenciadorDeTarefas.*;

public class Main {
    public static void main(String[] args) {
        //Criando objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Tarefa tarefasacoes = new Tarefa();
        GerenciadorDeTarefas gerenciadordetarefas = new GerenciadorDeTarefas();

        int opcao;

        do {
            System.out.println(" - - - - - GESTÃO DE TAREFAS - - - - - ");
            System.out.println("Menu de Opções");
            System.out.println("1. Adicionar nova tarefa ");
            System.out.println("2. Remover Tarefa ");
            System.out.println("3. Editar tarefa ");
            System.out.println("4. Exibir tarefas ");
            System.out.println("5. Sair do programa ");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o caractere de nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a Opção 1");
                    gerenciadordetarefas.adicionarTarefa();
                    break;
                case 2:
                    System.out.println("Você escolheu a Opção 2");
                    gerenciadordetarefas.removerTarefa();
                    break;
                case 3:
                    System.out.println("Você escolheu a Opção 3");
                    gerenciadordetarefas.editarTarefa();
                    break;
                case 4:
                    System.out.println("Você escolheu a Opção 4");
                    gerenciadordetarefas.listarTarefas();
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 5);

        scanner.close();

    }
}