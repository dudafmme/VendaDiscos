/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AutorDAO;
import java.sql.SQLException;
import model.Autor;

/**
 *
 * @author Duda
 */
public class AutorController {
    public void criarAutor(Autor autor) throws SQLException{
        
//        Validação com regras
        AutorDAO autorDAO = new AutorDAO();
        autorDAO.inserirNovoAutor(autor);
        
    }
}
