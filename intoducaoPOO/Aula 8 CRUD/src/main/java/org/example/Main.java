package org.example;
import entidades.Aluno;
import entidades.GerenciarAlunos;
import java.util.Scanner;

public class Main {
    // CORREÇÃO 1: Assinatura correta do main
    public static void main(String[] args) {
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();
        Scanner sc = new Scanner(System.in);
        int opcao;

        while(true){
            System.out.println("MENU OPÇÕES");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Aluno");
            System.out.println("3 - Atualizar Aluno");
            System.out.println("4 - Excluir Aluno");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            switch (opcao){
                case 1 -> {
                    System.out.println("Digite o nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite a nota 1: ");
                    double n1 = sc.nextDouble();

                    System.out.println("Digite a nota 2: ");
                    double n2 = sc.nextDouble();
                    sc.nextLine();

                    Aluno aluno = new Aluno(nome, n1, n2);
                    gerenciarAlunos.cadastrarAluno(aluno);
                }
                case 2 -> {
                    gerenciarAlunos.listarAlunos();
                }
                case 3 -> {
                    gerenciarAlunos.listarAlunos();
                    System.out.print("Digite o id do aluno que quer atualizar: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o novo nome: ");
                    String novoNome = sc.nextLine();

                    System.out.print("Digite a nova nota 1: ");
                    double nota1 = sc.nextDouble();

                    System.out.print("Digite a nova nota 2: ");
                    double nota2 = sc.nextDouble();
                    sc.nextLine();

                    gerenciarAlunos.alterarAluno(id, novoNome, nota1, nota2);
                }
                case 4 -> {
                    gerenciarAlunos.listarAlunos();
                    System.out.print("Digite o id do aluno que quer excluir: ");
                    int idExcluir = sc.nextInt();
                    sc.nextLine();
                    gerenciarAlunos.excluirAluno(idExcluir);
                }
                case 5 -> {
                    System.out.println("Saindo do programa...");
                    return;

                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}