package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Autor;

/**
 *
 * @author Duda
 */
public class AutorDAO {

    Connection conexao;
    PreparedStatement comando;

    //Método para inserir um novo autor
    public void inserirNovoAutor(Autor autor) throws SQLException, ClassNotFoundException {
        conexao = ConnectionFactory.createConnection();

        String sql = "INSERT INTO autor (nome, origem, banda) VALUES (? , ? , ?)";
        comando = conexao.prepareStatement(sql);
        comando.setString(1, autor.getNome());
        comando.setString(2, autor.getOrigem());
        comando.setBoolean(3, autor.isBanda());

        //Executando comando   
        int retorno = comando.executeUpdate();
        if (retorno > 0) {
            JOptionPane.showMessageDialog(null, "Dados Inseridos com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível inserir os dados do autor!");
        }
        //fechando a conexao
        conexao.close();
    }

    public ResultSet buscarAutor(String nome, String origem) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        conexao = ConnectionFactory.createConnection();
        String sql = "SELECT * FROM autor WHERE nome = '" + nome + "' AND origem = '" + origem + "'";
        comando = conexao.prepareStatement(sql);
        rs = comando.executeQuery(sql);
        return rs;
    }
}