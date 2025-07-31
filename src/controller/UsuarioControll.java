/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.UsuarioDao;
import model.Usuario;
import view.UsuarioView;

/**
 *
 * @author curso
 */
public class UsuarioControll {
    private UsuarioDao usuario;
    private UsuarioView view;
    
    public void cadastrar(String nome, String cpf, String telefone, String email, String senha) {
        
        Usuario u = new Usuario(nome, cpf, telefone, email, senha);
        
        usuario.cadastrar(u);
        
        
    }
    
    //public Usuario listar() { return this; }
    
    //public void excluir() {}
    
    //public Usuario pesquisar() { return this; }
    
    //public void alterar() {}
}
