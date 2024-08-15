package org.bruno.gestaoTarefas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    private ArrayList<Tarefa> tarefas;

    public GerenciadorDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    //Esta função tem como objetivo adicionar uma nova tarefa caso deseje o usuário
    public void adicionarTarefa() {

        //Criando objeto Scanner
        Scanner scannear = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("- - - - - Adicionar nova tarefa - - - - - ");
        System.out.println("Informe o nome da tarefa desejada: ");
        String descricao = scannear.next();
        Tarefa tarefa = new Tarefa(descricao);
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void removerTarefa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            System.out.println((i + 1) + ". " + tarefa.getDescricao());
        }
        System.out.print("Digite o número da tarefa que você deseja remover: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine(); // Consumir o caractere de nova linha

        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void editarTarefa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            System.out.println((i + 1) + ". " + tarefa.getDescricao());
        }
        System.out.print("Digite o número da tarefa que você deseja editar: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine(); // Consumir o caractere de nova linha

        if (indice >= 0 && indice < tarefas.size()) {
            Tarefa tarefa = tarefas.get(indice);
            System.out.print("Digite a nova descrição da tarefa: ");
            String novaDescricao = scanner.nextLine();
            tarefa.setDescricao(novaDescricao);
            System.out.println("Tarefa editada com sucesso!");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void listarTarefas() {
        System.out.println("Tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            System.out.println((i + 1) + ". " + tarefa.getDescricao());
        }
    }
}
