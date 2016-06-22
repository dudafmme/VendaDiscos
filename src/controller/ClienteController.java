package controller;

import dao.AutorDAO;
import dao.ClienteDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author Duda
 */
public class ClienteController {

    public void criarCliente(Cliente cliente) throws SQLException, ClassNotFoundException {
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.inserirNovoCliente(cliente);
    }

    public ResultSet buscarCliente(String cpf) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        ClienteDAO clienteDAO = new ClienteDAO();
        rs = clienteDAO.buscarCliente(cpf);
        if (!rs.first()) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
        }
        return rs;
    }
}
