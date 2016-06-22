package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Disco;
import model.Venda;

/**
 *
 * @author Duda
 */
public class VendaDAO {

    Connection conexao;
    PreparedStatement comando;

    //Método para inserir um novo autor
    public void inserirNovaVenda(Venda venda) throws SQLException, ClassNotFoundException {
        conexao = ConnectionFactory.createConnection();

        String sql = "INSERT INTO venda ("
                + "qtdeVendida, valorTotal, dataVenda, cliente_id, "
                + "disco_id, disco_valor) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        comando = conexao.prepareStatement(sql);

        comando.setInt(1, venda.getQtdeVenda());
        comando.setFloat(2, venda.getValorTotal());
        comando.setString(3, venda.getDataVenda());
        comando.setLong(4, venda.getCliente().getId());
        comando.setLong(5, venda.getDisco().getId());
        comando.setFloat(6, venda.getValorDsco());

        //Executando comando   
        int retorno = comando.executeUpdate();
        if (retorno > 0) {
            JOptionPane.showMessageDialog(null, "Venda Efetuada!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a venda!");
        }

        //fechando a conexao
        conexao.close();
    }

    public void atualizarEstoque(String qtde, String id) throws ClassNotFoundException, SQLException {
        conexao = ConnectionFactory.createConnection();
        String sql = "UPDATE disco SET qtdeDisponivel = " + qtde + " WHERE id = " + id + ";";
        comando = conexao.prepareStatement(sql);

        if (comando.executeUpdate(sql) > 0) {
            JOptionPane.showMessageDialog(null, "Estoque Atualizado!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar os dados do cliente");
        }
    }
}
