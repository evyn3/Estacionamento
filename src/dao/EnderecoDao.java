/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import db.DB;
import model.Cliente;
import model.Endereco;

import java.sql.*;

/**
 *
 * @author curso
 */
public class EnderecoDao {
    Connection conn = null;
    Statement st = null; //interface que representa uma instrução em sql para execultar em um banco de dados
    ResultSet rs = null; //interface que representa o conjuto dos resultados de uma conculta em um banco de dados

    public EnderecoDao() {

    }

    public void cadastrar(Endereco endereco){

        PreparedStatement ps = null;//para inserir dados no banco

        try{
            conn = DB.getConnection();//tenta iniciar a conexão
            ps = conn.prepareStatement(
                    "INSERT INTO endereco"
                            + "(rua, bairro, numero, cidade)"
                            + "VALUES "
                            + "(?, ?, ?, ?)",
                            Statement.RETURN_GENERATED_KEYS
            );

            ps.setString(1, endereco.getRua());
            ps.setString(2, endereco.getBairro());
            ps.setInt(3, endereco.getNumero());
            ps.setString(4, endereco.getCidade());


            int rowsAffected = ps.executeUpdate(); //para executar

            if (rowsAffected > 0) {
                rs = ps.getGeneratedKeys(); // Pega o ID gerado
                if (rs.next()) {
                    int id = rs.getInt(1); // Aqui você obtém o id_end
                    endereco.setId(id); // Se quiser já salvar no objeto
                }
            }

            //System.out.println("Finalizando linha alterada " + rowsAffected);


        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            DB.closeStatment(ps);
            DB.closeConnection();
            DB.closeConnection();
        }
    }

}
