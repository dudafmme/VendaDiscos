/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.VendaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Venda;

/**
 *
 * @author Duda
 */
public class VendaController {
    VendaDAO vendaDAO;
    Connection conexao;
    PreparedStatement comando;
    ResultSet rs;
    String sql;
       
    public void efetuarVenda(Venda venda) throws SQLException, ClassNotFoundException{
        vendaDAO = new VendaDAO();
        vendaDAO.inserirNovaVenda(venda);
    }
    
    public void atualizarEstoque(String qtde, String id) throws ClassNotFoundException, SQLException{
        vendaDAO = new VendaDAO();
        vendaDAO.atualizarEstoque(qtde, id);
    }
    
    public ResultSet listarVendas() throws ClassNotFoundException, SQLException {
        vendaDAO = new VendaDAO();
        rs = vendaDAO.listarVendas();
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Nenhum dado cadastrado!");
        return rs;
    }
    public ResultSet listarVendasPorCPF(String cpf) throws ClassNotFoundException, SQLException {
        vendaDAO = new VendaDAO();
        rs = vendaDAO.listarVendasPorCPF(cpf);
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Nenhum dado cadastrado!");
        return rs;
    }
}    

