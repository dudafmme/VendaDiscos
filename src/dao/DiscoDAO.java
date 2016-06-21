package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Disco;

/**
 *
 * @author Duda
 */
public class DiscoDAO {

    Connection conexao;
    PreparedStatement comando;

    //Método para inserir um novo autor
    public void inserirNovoDisco(Disco disco) throws SQLException, ClassNotFoundException {
        conexao = ConnectionFactory.createConnection();

        String sql = "INSERT INTO disco ("
                + "nome, genero, anoLancamento, preco, "
                + "qtdeDisponivel, disponivel, autor_id) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        comando = conexao.prepareStatement(sql);

        //comando.setInt(1, autor.getId()); // mudar para adicionar codigo automaticamente
        comando.setString(1, disco.getNome());
        comando.setString(2, disco.getGenero());
        comando.setInt(3, disco.getAnoLancamento());
        comando.setFloat(4, disco.getPreco());
        comando.setInt(5, disco.getQtdeDisponivel());
        comando.setBoolean(6, disco.isDisponivel());
        comando.setInt(7, disco.getAutor().getId());

        //Executando comando   
        int retorno = comando.executeUpdate();
        if(retorno > 0)
            JOptionPane.showMessageDialog(null, "Dados Inseridos com sucesso!");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível inserir os dados do disco!");

        //fechando a conexao
        conexao.close();
    }
}