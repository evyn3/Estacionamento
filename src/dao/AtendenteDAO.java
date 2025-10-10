package dao;

import db.DB;
import db.DbException;
import model.Atendente;
import model.Cliente;
import model.Endereco;

import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;

public class AtendenteDAO {

    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;

    EnderecoDao endDao = new EnderecoDao();

    public AtendenteDAO() {

    }

    public void cadastrar(Atendente atendente) {

        PreparedStatement ps = null;

        try {
            conn = DB.getConnection();

            ps = conn.prepareStatement(
                    "INSERT INTO funcionario"
                            + "(cpf, nome, email, telefone, senha, id_end)"
                            + "VALUES "
                            + "(?, ?, ?, ?, ?, ?)",
                            Statement.RETURN_GENERATED_KEYS
            );

            ps.setString(1, atendente.getCpf());
            ps.setString(2, atendente.getNome());
            ps.setString(3, atendente.getEmail());
            ps.setString(4, atendente.getTelefone());
            ps.setString(5, atendente.getSenha());
            ps.setInt(6, atendente.getEndereco().getId());


            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    atendente.setId(id);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            DB.closeStatment(ps);
            DB.closeConnection();
            DB.closeResultSet(rs);
        }
    }

    public ArrayList<Atendente> listar() {
        ArrayList<Atendente> lista = new ArrayList<>();
        Atendente atendente;

        try {
            conn = DB.getConnection();

            st = conn.createStatement();

            rs = st.executeQuery("select * from funcionario");//cria consulta com o banco

            while (rs.next()) {

                int id = rs.getInt("id_f");
                String cpf = rs.getString("cpf");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                String senha = rs.getString("senha");
                int idend = rs.getInt("id_end");

                Endereco endereco = endDao.pesquisar(idend);


                atendente = new Atendente(nome, cpf, telefone, email, senha, endereco, id);
                lista.add(atendente);
                //System.out.println(rs.getInt("id_end") + " - " + rs.getString("rua") + rs.getString("bairro") + rs.getInt("numero") + rs.getString("cidade"));
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            DB.closeStatment(st);
            DB.closeResultSet(rs);
            //DB.closeConnection();

        }

        return lista;
    }

    public Atendente pesquisar(int id) {
        Atendente atendente = new Atendente();

        try {
            conn = DB.getConnection();
            st = conn.createStatement();

            rs = st.executeQuery("select * from funcionario");

            while (rs.next()) {

                int id_f = rs.getInt("id_f");

                if (id_f == id) {
                    String cpf = rs.getString("cpf");
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    String telefone = rs.getString("telefone");
                    String senha = rs.getString("senha");
                    int idend = rs.getInt("id_end");

                    Endereco endereco = endDao.pesquisar(idend);

                    atendente = new Atendente(nome, cpf, telefone, email, senha, endereco, id_f);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            DB.closeStatment(st);
            DB.closeResultSet(rs);
        }
        return atendente;
    }
    
    public void alterar(int id_f, int var, String x) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = DB.getConnection();

            switch (var) {
                case 1:
                    ps = conn.prepareStatement(
                        "UPDATE funcionario SET nome = ? WHERE id_f = ?"
                    );
                    ps.setString(1, x);
                    ps.setInt(2, id_f);
                    ps.executeUpdate();
                    break;

                case 2:
                    ps = conn.prepareStatement(
                        "UPDATE funcionario SET cpf = ? WHERE id_f = ?"
                    );
                    ps.setString(1, x);
                    ps.setInt(2, id_f);
                    ps.executeUpdate();
                    break;

                case 3:
                    ps = conn.prepareStatement(
                        "UPDATE funcionario SET email = ? WHERE id_f = ?"
                    );
                    ps.setString(1, x);
                    ps.setInt(2, id_f);
                    ps.executeUpdate();
                    break;

                case 4:
                    ps = conn.prepareStatement(
                        "UPDATE funcionario SET telefone = ? WHERE id_f = ?"
                    );
                    ps.setString(1, x);
                    ps.setInt(2, id_f);
                    ps.executeUpdate();
                    break;

                case 5:
                    ps = conn.prepareStatement(
                        "UPDATE funcionario SET senha = ? WHERE id_f = ?"
                    );
                    ps.setString(1, x);
                    ps.setInt(2, id_f);
                    ps.executeUpdate();
                    break;

                default:
                    throw new DbException("Opcao invalida para alteracao!");
            }
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatment(ps);
        }
    }

    /*public Cliente pesquisar(String idcpf) {
        Cliente clie = new Cliente();

        try {
            conn = DB.getConnection();//tenta iniciar a conexão

            st = conn.createStatement();//cria a conexão com o banco

            rs = st.executeQuery("select * from cliente");//cria consulta com o banco

            while (rs.next()) { //percorre o banco

                String cpf = rs.getString("cpf");

                if (cpf.equals(idcpf)) {
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

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatment(st);
            DB.closeResultSet(rs);
            //DB.closeConnection();

        }

        return clie;

    }*/

}
