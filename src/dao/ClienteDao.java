/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import db.DB;
import model.Cliente;

import java.sql.*;
import java.text.ParseException;

/**
 *
 * @author curso
 */
public class ClienteDao {

    Connection conn = null;
    Statement st = null; //interface que representa uma instrução em sql para execultar em um banco de dados
    ResultSet rs = null; //interface que representa o conjuto dos resultados de uma conculta em um banco de dados

    public ClienteDao() {

    }

    public void cadastrar(Cliente cliente){
        PreparedStatement ps = null;//para inserir dados no banco
        try{
            conn = DB.getConnection();//tenta iniciar a conexão
            ps = conn.prepareStatement(
                    "INSERT INTO cliente"
                            + "(cpf, nome, email, telefone, cnh, senha, credito, id_end)"
                            + "VALUES "
                            + "(?, ?, ?, ?, ?, ?, ?, ?)"
            );

            ps.setString(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getTelefone());
            ps.setString(5, cliente.getCnh());
            ps.setString(6, cliente.getSenha());
            ps.setDouble(7, cliente.getCredito());
            ps.setInt(8, cliente.getEndereco().getId());


            int rowsAffected = ps.executeUpdate(); //para executar

            //System.out.println("Finalizando linha alterada " + rowsAffected);


        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            DB.closeStatment(ps);
            DB.closeConnection();
            DB.closeResultSet(rs);
        }
    }


    /*public void cadastrar(String nome, String cpf, String telefone, String email, String senha, String cnh, double credito){
        PreparedStatement ps = null;//para inserir dados no banco
        try{
            conn = DB.getConnection();//tenta iniciar a conexão
            ps = conn.prepareStatement(
                    "INSERT INTO seller"
                            + "(cpf, nome, email, telefone, cnh, senha, credito)"
                            + "VALUES "
                            + "(?, ?, ?, ?, ?, ?, ?)"
            );

            ps.setString(1, cpf);
            ps.setString(2, nome);
            ps.setString(3, email);
            ps.setString(4, telefone);
            ps.setString(5, cnh);
            ps.setString(6, senha);
            ps.setDouble(7, credito);

            int rowsAffected = ps.executeUpdate(); //para executar

            //System.out.println("Finalizando linha alterada " + rowsAffected);


        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            DB.closeStatment(ps);
            DB.closeConnection();
            DB.closeConnection();
        }
    }*/
}
