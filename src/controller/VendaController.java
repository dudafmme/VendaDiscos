/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DiscoDAO;
import dao.VendaDAO;
import java.sql.SQLException;
import model.Disco;
import model.Venda;

/**
 *
 * @author Duda
 */
public class VendaController {
     
    public void efetuarVenda(Venda venda) throws SQLException, ClassNotFoundException{
        VendaDAO vendaDAO = new VendaDAO();
        vendaDAO.inserirNovaVenda(venda);
    }
    
    public void atualizarEstoque(String qtde, String id) throws ClassNotFoundException, SQLException{
        VendaDAO vendaDAO = new VendaDAO();
        vendaDAO.atualizarEstoque(qtde, id);
    }
}    

