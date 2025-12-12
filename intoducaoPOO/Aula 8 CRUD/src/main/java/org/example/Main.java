package org.example;
import entidades.GerenciarAlunos;
import java.sql.SQLException;

public class Main {
    static void main() {
        GerenciarAlunos alunos = new GerenciarAlunos();

        try {
            alunos.conectar();
            System.out.println("Conectado com sucesso");
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }

    }
}
