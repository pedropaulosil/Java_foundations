package entidades;

import java.sql.*;
import entidades.Aluno;

public class GerenciarAlunos {

    private final String url = "jdbc:mysql://localhost:3306/escola";
    private final String usuario = "root";
    private final String senha = "admin";

    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }

    public void cadastrarAluno(Aluno aluno) {
        String sql = "INSERT INTO alunos(nome, nota1, nota2) VALUES(?,?,?)";
        // Try-with-resources: fecha conexao e stmt automaticamente
        try (Connection conexao = conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, aluno.getNome());
            stmt.setDouble(2, aluno.getNota1());
            stmt.setDouble(3, aluno.getNota2());
            stmt.executeUpdate();
            System.out.println("Aluno cadastrado!");

        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar: " + e.getMessage());
        }
    }

    public void excluirAluno(int id) {
        String sql = "DELETE FROM alunos WHERE id = ?";
        try (Connection conexao = conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Aluno excluído!");
        } catch (SQLException e) {
            System.err.println("Erro ao excluir: " + e.getMessage());
        }
    }

    public void alterarAluno(int id, String nome, double nota1, double nota2) {
        // Corrigido de 'nota' para 'nota1'
        String sql = "UPDATE alunos SET nome = ?, nota1 = ?, nota2 = ? WHERE id = ?";

        try (Connection conexao = conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setDouble(2, nota1);
            stmt.setDouble(3, nota2);
            stmt.setInt(4, id);

            stmt.executeUpdate();
            System.out.println("Alterado com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao alterar: " + e.getMessage());
        }
    }

    public void listarAlunos() {
        String sql = "SELECT * FROM alunos";

        try (Connection conexao = conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        " | Nome: " + rs.getString("nome") +
                        " | Nota 1: " + rs.getDouble("nota1") +
                        " | Nota 2: " + rs.getDouble("nota2"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar: " + e.getMessage());
        }
    }


    public double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }
}