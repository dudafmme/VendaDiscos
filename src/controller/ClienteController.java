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
    ResultSet rs;
    public void criarCliente(Cliente cliente) throws SQLException, ClassNotFoundException {
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.inserirNovoCliente(cliente);
    }

    public ResultSet buscarCliente(String cpf) throws ClassNotFoundException, SQLException {
        ClienteDAO clienteDAO = new ClienteDAO();
        rs = clienteDAO.buscarCliente(cpf);
        if (!rs.first()) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
        }
        return rs;
    }
        public ResultSet listarClientes() throws ClassNotFoundException, SQLException {
        ClienteDAO clienteDAO = new ClienteDAO();
        rs = clienteDAO.listarClientes();
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Nenhum dado cadastrado!");
        return rs;
    }
}
