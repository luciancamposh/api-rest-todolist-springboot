package ufu.ej.democompacto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Note que não precisamos mais de "import ufu.ej.democompacto.Aluno;"
// pois a classe Aluno está no mesmo pacote.

public class AlunoDAO {

    public List<Aluno> findByPeriodo(int periodo) {
        String sql = "SELECT id, nome, curso, periodo FROM alunos WHERE periodo = ?";
        List<Aluno> alunos = new ArrayList<>();

        try (Connection conn = ConexaoMySQL.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, periodo);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Aluno aluno = new Aluno();
                    aluno.setId(rs.getInt("id"));
                    aluno.setNome(rs.getString("nome"));
                    aluno.setCurso(rs.getString("curso"));
                    aluno.setPeriodo(rs.getInt("periodo"));
                    alunos.add(aluno);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alunos;
    }
}