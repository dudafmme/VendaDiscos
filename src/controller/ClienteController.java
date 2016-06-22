package controller;

import dao.ClienteDAO;
import java.sql.SQLException;
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

}
