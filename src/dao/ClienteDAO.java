/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    ResultSet rs;
    
    //Método para gravar um cliente no BD
    public void inserirNovoCliente(Cliente cliente) throws SQLException, ClassNotFoundException{
        conexao = ConnectionFactory.createConnection();
        
        //ver colunas das tabelas
        String sql = "INSERT INTO Cliente ("
                + "nome, cpf, idade, telefone, cep, logradouro, numero, "
                + "bairro, cidade, uf, complemento)" 
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        comando = conexao.prepareStatement(sql);
        
        comando.setString(1, cliente.getNome());
        comando.setString(2, cliente.getCpf());
        comando.setInt(3, cliente.getIdade());
        comando.setString(4, cliente.getTelefone());
        comando.setString(5, cliente.getCep());
        comando.setString(6, cliente.getLogradouro());
        comando.setInt(7, cliente.getNumero());
        comando.setString(8, cliente.getBairro());
        comando.setString(9, cliente.getCidade());
        comando.setString(10, cliente.getUf());
        comando.setString(11, cliente.getComplemento());

        //Executando comando   
        int retorno = comando.executeUpdate();
        if(retorno > 0)
            JOptionPane.showMessageDialog(null, "Dados Inseridos com sucesso!");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível inserir os dados do cliente!");

        //fechando a conexao
        conexao.close();
    }
    
    public ResultSet buscarCliente(String cpf) throws ClassNotFoundException, SQLException {
        conexao = ConnectionFactory.createConnection();
        String sql = "SELECT * FROM cliente WHERE cpf = '" + cpf + "'";
        comando = conexao.prepareStatement(sql);
        rs = comando.executeQuery(sql);
        return rs;
    }
    public ResultSet listarClientes() throws ClassNotFoundException, SQLException {        
        conexao = ConnectionFactory.createConnection();
        String sql = "SELECT * FROM cliente";
        comando = conexao.prepareStatement(sql);
        rs = comando.executeQuery(sql);
        return rs;
    }
}
