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
    private UsuarioDao dao;
    private UsuarioView view;

    public UsuarioControll(UsuarioDao dao, UsuarioView view) {
        this.dao = dao;
        this.view = view;
    }
    
    
    public void cadastrar(String nome, String cpf, String telefone, String email, String senha) {
        
        Usuario u = new Usuario(nome, cpf, telefone, email, senha);
        
        dao.cadastrar(u);
        view.cadastrar();
    
    }
    
    public void listar() { 
        view.listar(dao.listar());
    }
    
    public void excluir(String cpf) {
        dao.excluir(cpf);
        view.excluir();
    }
    
    public void pesquisar(String cpf) { 
        view.pesquisar(dao.pesquisar(cpf));
    }
    
    public void alterar(String nome, String cpf, String telefone, String email, String senha) {
        dao.alterar(nome, cpf, telefone, email, senha);
        view.alterar();
    }
    
    
}
