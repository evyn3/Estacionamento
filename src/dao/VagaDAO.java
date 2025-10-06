package dao;

import db.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Vaga;
import java.sql.SQLException;


public class VagaDAO {

    public VagaDAO() {
    }
    
    Connection conn = null;
    Statement st = null; 
    ResultSet rs = null; 
    
    public Vaga pesquisar(int n){
        
        Vaga vaga = new Vaga();

        try{
            conn = DB.getConnection();// inicia a conexão

            st = conn.createStatement();//cria a conexão com o banco

            rs = st.executeQuery("select * from vaga");//cria consulta com o banco

            while (rs.next()){ //percorre o banco

                int num = rs.getInt("numeroVaga");

                if (n == num){
                    String status = rs.getString("statusVaga");
                    String tipo = rs.getString("tipo");
        
                    vaga = new Vaga(num, tipo, status);
                }


            }

        } catch(SQLException e){
            e.printStackTrace();
        }
        finally {
   }

        return vaga;
        
    }
}
