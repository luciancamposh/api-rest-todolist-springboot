
package ufu.ej.democompacto;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConexaoMySQL {

    public static Connection getConexao() throws SQLException {
        Properties props = new Properties();

        try (FileInputStream fis = new FileInputStream("src/main/resources/database.properties")) {
            props.load(fis);
        } catch (IOException e) {
            // Lançando SQLException com a causa original para não perder a informação do erro
            throw new SQLException("Erro ao ler o arquivo de propriedades: " + e.getMessage(), e);
        }

        String url = props.getProperty("db.url");
        String user = props.getProperty("db.user");
        String password = props.getProperty("db.password");

        return DriverManager.getConnection(url, user, password);
    }
}