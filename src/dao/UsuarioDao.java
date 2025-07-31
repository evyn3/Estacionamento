/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author curso
 */
public class UsuarioDao {
    
    ArrayList<Usuario> banco = new ArrayList<>();
    
    public void cadastrar(Usuario usuario){
        banco.add(usuario);
    }
    
    public ArrayList<Usuario> listar() { 
        return banco;
    }
    
    public void excluir(String cpf) {
        Usuario u = pesquisar(cpf);
        banco.remove(u);
    }
    
    public Usuario pesquisar(String cpf) { 
        for(Usuario b : banco){
            if(b.getCpf().equals(cpf)){
                return b;
            }
        }
        return null;
    }
    
    public void alterar(String cpf) {
        Usuario us = pesquisar(cpf);
        
    }
    
}
