/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import db.DB;
import model.Cliente;
import model.Endereco;

import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author curso
 */
public class ClienteDao {

    Connection conn = null;
    Statement st = null; //interface que representa uma instrução em sql para execultar em um banco de dados
    ResultSet rs = null; //interface que representa o conjuto dos resultados de uma conculta em um banco de dados

    EnderecoDao endDao = new EnderecoDao();

    public ClienteDao() {

    }

    public Cliente pesquisar(String idcpf){
        Cliente clie = new Cliente();

        try{
            conn = DB.getConnection();//tenta iniciar a conexão
            st = conn.createStatement();//cria a conexão com o banco

            rs = st.executeQuery("select * from cliente");//cria consulta com o banco

            while (rs.next()){ //percorre o banco

                String cpf = rs.getString("cpf");

                if(cpf.equals(idcpf)){
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    String telefone = rs.getString("telefone");
                    String cnh = rs.getString("cnh");
                    String senha = rs.getString("senha");
                    double credito = rs.getDouble("credito");
                    int idend = rs.getInt("id_end");

                    Endereco endereco = endDao.pesquisar(idend);
                    clie = new Cliente(nome, cpf, telefone, email, senha, endereco, cnh, credito);

                }

                //System.out.println(rs.getInt("id_end") + " - " + rs.getString("rua") + rs.getString("bairro") + rs.getInt("numero") + rs.getString("cidade"));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            DB.closeStatment(st);
            DB.closeResultSet(rs);
            //DB.closeConnection();

        }

        return clie;
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
            //DB.closeConnection();
            DB.closeResultSet(rs);
        }
    }

    public ArrayList<Cliente> listar(){
        //LISTAR
        ArrayList<Cliente> lista = new ArrayList<>();
        Cliente cliente;

        try{
            conn = DB.getConnection();//tenta iniciar a conexão

            st = conn.createStatement();//cria a conexão com o banco

            rs = st.executeQuery("select * from cliente");//cria consulta com o banco

            while (rs.next()){ //percorre o banco

                String cpf = rs.getString("cpf");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                String cnh = rs.getString("cnh");
                String senha = rs.getString("senha");
                double credito = rs.getDouble("credito");
                int idend = rs.getInt("id_end");

                Endereco endereco = endDao.pesquisar(idend);


                cliente = new Cliente(nome, cpf, telefone, email, senha, endereco, cnh, credito);
                lista.add(cliente);
                //System.out.println(rs.getInt("id_end") + " - " + rs.getString("rua") + rs.getString("bairro") + rs.getInt("numero") + rs.getString("cidade"));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            DB.closeStatment(st);
            DB.closeResultSet(rs);
            //DB.closeConnection();

        }

        return lista;
    }


     public void alterarCampo(String cpf, String campo, String novoValor) {
    PreparedStatement ps = null;

    try {
        conn = DB.getConnection(); // inicia a conexão

        switch (campo) {
            case "nome":
            case "email":
            case "telefone":
            case "cnh":
            case "senha":
                ps = conn.prepareStatement("UPDATE cliente SET " + campo + " = ? WHERE cpf = ?");
                ps.setString(1, novoValor);
                ps.setString(2, cpf);
                break;

            case "credito":
                ps = conn.prepareStatement("UPDATE cliente SET credito = ? WHERE cpf = ?");
                ps.setDouble(1, Double.parseDouble(novoValor));
                ps.setString(2, cpf);
                break;

            case "id_end":
                ps = conn.prepareStatement("UPDATE cliente SET id_end = ? WHERE cpf = ?");
                ps.setString(1, novoValor);
                ps.setString(2, cpf);
                break;

            default:
                System.out.println("Campo inválido: " + campo);
                return;
        }

        int rowsAffected = ps.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Campo " + campo + " atualizado com sucesso!");
        } else {
            System.out.println("Nenhum cliente encontrado com este CPF.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        DB.closeStatment(ps);
    }
}

    
public void excluir(String cpf) {
    PreparedStatement ps = null;
    try {
        conn = DB.getConnection();

        ps = conn.prepareStatement("DELETE FROM cliente WHERE cpf = ?");

        ps.setString(1, cpf);

        int rowsAffected = ps.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Cliente excluído com sucesso!");
        } else {
            System.out.println("Nenhum cliente encontrado com este CPF.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        DB.closeStatment(ps);
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
