package SistemaCrud;

import SistemaCrud.entidades.Aluno;
import SistemaCrud.entidades.GerenciarAlunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GerenciarAlunos gerenciarAluno = new GerenciarAlunos();

        Scanner sc = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("SISTEMA CRUD DE ALUNOS");
            System.out.println("1 - Cadastrar Alunos");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Atualizar o cadastro do SistemaCrud.entidades.Aluno");
            System.out.println("4 - Remover SistemaCrud.entidades.Aluno");
            System.out.println("5 - Sair do Programa");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Informe o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.print("Informe a nota do aluno: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Informe a segunda nota do aluno: ");
                    double nota2 = sc.nextDouble();
                    sc.nextLine();

                    Aluno aluno = new Aluno(nome, nota, nota2);

                    gerenciarAluno.adicionarAluno(aluno);
                }

                case 2 -> {
                    gerenciarAluno.listarAlunos();
                }

                case 3 -> {
                    gerenciarAluno.listarAlunos();
                    System.out.println("Informe o id do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Informe o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.print("Informe a nota do aluno: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Informe a segunda nota do aluno: ");
                    double nota2 = sc.nextDouble();
                    sc.nextLine();

                    gerenciarAluno.alterarAluno(idAluno, nome, nota, nota2);
                }

                case 4 -> {
                    gerenciarAluno.listarAlunos();
                    System.out.println("Informe o id do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();

                    gerenciarAluno.removerAluno(idAluno);
                }

                case 5 -> {
                    System.out.println("Saindo do programa");
                    return;
                }

                default -> {
                    System.out.println("Opção inválida");
                }
            }


        }
    }
}