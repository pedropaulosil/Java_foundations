package entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GerenciarAlunos {

    private final String url = "jdbc:mysql://localhost:3306/escola";
    private final  String usuario = "root";
    private final String senha = "admin";

    //metodo para conectar o banco de dados
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);

    }
    //Cadastrar Aluno
    public void CadastrarAluno(Aluno aluno) {
        String sql = "INSERT INTO alunos(nome, nota1, nota2)" + "VALUES(?,?,?)";
        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setDouble(2, aluno.getNota1());
            stmt.setDouble(3, aluno.getNota2());

            stmt.executeUpdate();

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
    public void excluirAluno(Aluno aluno) {
        String sql = "DELETE FROM alunos WHERE id = ?";
        PreparedStatement stat = null;
        try {
            Connection conexao = conectar();
            stat = conexao.prepareStatement(sql);
            stat.setInt(1, id);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());


        }
    }

}
