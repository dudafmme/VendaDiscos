/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DiscoDAO;
import java.sql.SQLException;
import model.Disco;

/**
 *
 * @author Duda
 */
public class DiscoController {
     
    public void criarDisco(Disco disco) throws SQLException, ClassNotFoundException{
//        Validação com regras
        DiscoDAO discoDAO = new DiscoDAO();
        discoDAO.inserirNovoDisco(disco);
        
    }
}    

