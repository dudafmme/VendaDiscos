/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DiscoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Disco;

/**
 *
 * @author Duda
 */
public class DiscoController {
    ResultSet rs;
    DiscoDAO discoDAO;
    public void criarDisco(Disco disco) throws SQLException, ClassNotFoundException{
//        Validação com regras
        discoDAO = new DiscoDAO();
        discoDAO.inserirNovoDisco(disco);
        
    }
    public ResultSet buscarDisco(String nomeDisco, String nomeAutor) throws ClassNotFoundException, SQLException {
        DiscoDAO discoDAO = new DiscoDAO();
        rs = discoDAO.buscarDisco(nomeDisco, nomeAutor);
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Disco não encontrado!");
        return rs;
    }
    
    public ResultSet buscarDiscoCompleto(String nomeDisco) throws ClassNotFoundException, SQLException {
        discoDAO = new DiscoDAO();
        rs = discoDAO.buscarDiscoCompleto(nomeDisco);
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Disco não encontrado!");
        return rs;
    }
    public ResultSet listarDiscos() throws ClassNotFoundException, SQLException {
        discoDAO = new DiscoDAO();
        rs = discoDAO.listarDiscos();
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Nenhum dado cadastrado!");
        return rs;
    }
}    