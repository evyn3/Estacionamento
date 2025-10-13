/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import db.DB;
import model.Cliente;
import model.Endereco;

//import java.lang.classfile.instruction.SwitchCase;
import java.sql.*;
import java.util.ArrayList;

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
            DB.closeResultSet(rs);
            //DB.closeConnection();
            //DB.closeConnection();
        }


    }

    public ArrayList<Endereco> listar(){
        //LISTAR
        ArrayList<Endereco> lista = new ArrayList<>();
        Endereco endereco;

        try{
            conn = DB.getConnection();//tenta iniciar a conexão

            st = conn.createStatement();//cria a conexão com o banco

            rs = st.executeQuery("select * from endereco");//cria consulta com o banco

            while (rs.next()){ //percorre o banco

                int id = rs.getInt("id_end");
                String rua = rs.getString("rua");
                int numero = rs.getInt("numero");
                String bairro = rs.getString("bairro");
                String cidade = rs.getString("cidade");

                endereco = new Endereco(id, rua, numero, bairro, cidade);
                lista.add(endereco);
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

    public Endereco pesquisar(int id){

        Endereco end = new Endereco();

        try{
            conn = DB.getConnection();//tenta iniciar a conexão

            st = conn.createStatement();//cria a conexão com o banco

            rs = st.executeQuery("select * from endereco");//cria consulta com o banco

            while (rs.next()){ //percorre o banco

                int ide = rs.getInt("id_end");

                if (id == ide){
                    String rua = rs.getString("rua");
                    int numero = rs.getInt("numero");
                    String bairro = rs.getString("bairro");
                    String cidade = rs.getString("cidade");
                    end = new Endereco(ide, rua, numero, bairro, cidade);
                }

                //System.out.println(rs.getInt("id_end") + " - " + rs.getString("rua") + rs.getString("bairro") + rs.getInt("numero") + rs.getString("cidade"));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            //DB.closeStatment(st);
            //DB.closeResultSet(rs);
            //DB.closeConnection();

        }

        return end;
    }


    public void alterar(int id, int var, String x){
        PreparedStatement ps = null;
        try {
            conn = DB.getConnection();//tenta iniciar a conexão
            switch (var) {
                case 1:

                    ps = conn.prepareStatement( //prepareStatement: prepara um comando SQL
                            "UPDATE endereco " + "SET numero = ? WHERE id_end = ?");
                    ps.setInt(1, Integer.parseInt(x));
                    ps.setInt(2, id);

                    ps.executeUpdate(); //executa a atualização no banco de dados

                    //System.out.println("Finalizado " + rowsAffected); //mostra as linhas afetadas

                    break;

                case 2:
                    ps = conn.prepareStatement( //prepareStatement: prepara um comando SQL
                            "UPDATE endereco " + "SET rua = ? WHERE id_end = ?");
                    ps.setString(1, x);
                    ps.setInt(2, id);

                    ps.executeUpdate(); //executa a atualização no banco de dados

                    //System.out.println("Finalizado " + rowsAffected); //mostra as linhas afetadas

                    break;

                case 3:
                    ps = conn.prepareStatement( //prepareStatement: prepara um comando SQL
                            "UPDATE endereco " + "SET bairro = ? WHERE id_end = ?");
                    ps.setString(1, x);
                    ps.setInt(2, id);

                    ps.executeUpdate(); //executa a atualização no banco de dados

                    //System.out.println("Finalizado " + rowsAffected); //mostra as linhas afetadas


                    break;

                case 4:
                    ps = conn.prepareStatement( //prepareStatement: prepara um comando SQL
                            "UPDATE endereco " + "SET cidade = ? WHERE id_end = ?");
                    ps.setString(1, x);
                    ps.setInt(2, id);

                    ps.executeUpdate(); //executa a atualização no banco de dados

                    //System.out.println("Finalizado " + rowsAffected); //mostra as linhas afetadas

                    break;
            }
        }catch (SQLException e){
            e.printStackTrace(); //trata a exceção
        } finally {
            //DB.closeStatment(ps);
            //DB.closeConnection();
        }

    }
    
    public void excluirEndereco(int id_end) {
    PreparedStatement ps = null;
    try {
        conn = DB.getConnection();

        ps = conn.prepareStatement("DELETE FROM endereco WHERE id_end = ?");
        ps.setInt(1, id_end);

        int rowsAffected = ps.executeUpdate();
        if (rowsAffected > 0) {
            //System.out.println("Endereço excluído com sucesso!");
        } else {
            //System.out.println("Nenhum endereço encontrado com este ID.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        DB.closeStatment(ps);
    }
}

}
