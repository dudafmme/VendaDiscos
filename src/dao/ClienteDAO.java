/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author Duda
 */
public class ClienteDAO {
    Connection conexao;
    PreparedStatement comando;
    
    //Método para gravar um cliente no BD
    public void inserirNovoCliente(Cliente cliente) throws SQLException{
        conexao = ConnectionFactory.createConnection();
        
        String sql = "INSERT INTO Cliente (id, nome, cpf, idade, telefone, endereco_cep) " 
                + "VALUES (?,?,?,?,?,?)";
        
        comando = conexao.prepareStatement(sql);
        
        comando.setLong(1, cliente.getId());
        comando.setString(2, cliente.getNome());
        comando.setString(3, cliente.getCpf());
        comando.setInt(4, cliente.getTelefone());
        comando.setInt(5, cliente.getIdade());
        comando.setInt(6, cliente.getEndereco().getCep());

        //Executando comando        
        if(comando.execute() == true)
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível inserir os dados do cliente");
        
        //fechando a conexao
        conexao.close();
    }
}
