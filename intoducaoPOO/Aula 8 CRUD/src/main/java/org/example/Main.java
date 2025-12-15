package org.example;
import entidades.Aluno;
import entidades.GerenciarAlunos;
import java.sql.SQLException;

public class Main {
    static void main() {
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();
        Aluno aluno = new Aluno("Diego",10, 8);

        gerenciarAlunos.CadastrarAluno(aluno);
        gerenciarAlunos.excluirAluno(2);

    }
}
