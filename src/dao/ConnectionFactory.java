/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Duda
 */
public class ConnectionFactory {
    public static Connection createConnection() {

        String stringDeConexao = "jdbc:mysql://localhost:3306/lojadiscos";
        String usuario = "root";
        String senha = "root";
        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexao;
    }
}
