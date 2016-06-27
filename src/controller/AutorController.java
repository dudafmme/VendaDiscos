/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AutorDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Autor;

/**
 *
 * @author Duda
 */
public class AutorController {
    ResultSet rs;
    AutorDAO autorDAO;
    
    public void criarAutor(Autor autor) 
            throws SQLException, ClassNotFoundException{
        
//        Validação com regras
        autorDAO = new AutorDAO();
        autorDAO.inserirNovoAutor(autor);   
    }
    
    public ResultSet buscarAutor(String nome, String origem) 
            throws ClassNotFoundException, SQLException {
        autorDAO = new AutorDAO();
        rs = autorDAO.buscarAutor(nome, origem);
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Autor não encontrado!");
        return rs;
    }
    
    public ResultSet buscarAutorPorNome(String nome) 
            throws ClassNotFoundException, SQLException{
        autorDAO = new AutorDAO();
        rs = autorDAO.buscarAutorPorNome(nome);
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Autor não encontrado!");
        return rs;
    }
}
