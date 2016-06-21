/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    public void inserirNovoCliente(Cliente cliente) throws SQLException, ClassNotFoundException{
        conexao = ConnectionFactory.createConnection();
        
        //ver colunas das tabelas
        String sql = "INSERT INTO Cliente (id, nome, cpf, idade, telefone, endereco) " 
                + "VALUES (?,?,?,?,?,?)";
        
        comando = conexao.prepareStatement(sql);
        
        comando.setLong(1, cliente.getId());
        comando.setString(2, cliente.getNome());
        comando.setString(3, cliente.getCpf());
        comando.setInt(4, cliente.getTelefone());
        comando.setInt(5, cliente.getIdade());
        comando.setString(6, cliente.getEndereco());

        //Executando comando        
        if(comando.execute() == true)
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível inserir os dados do cliente");
        
        //fechando a conexao
        conexao.close();
    }
}
