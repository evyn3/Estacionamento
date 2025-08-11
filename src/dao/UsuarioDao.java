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
    
    public void alterar(String nome, String cpf, String telefone, String email, String senha) {
        Usuario us = pesquisar(cpf);
        
        for(Usuario b : banco){
            if (b == us){
                b.setNome(nome);
                b.setTelefone(telefone);
                b.setEmail(email);
                b.setSenha(senha);
            }
        }
        
    }
}
