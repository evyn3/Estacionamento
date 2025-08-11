/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author curso
 */
public class UsuarioView {
    
    
    public void cadastrar(){
        System.out.println("Usuario cadastrado com sucesso!!");
    }
    
    public void listar(ArrayList<Usuario> banco){
        for(Usuario u : banco){
            System.out.println(u);
        }
    }
    
    public void excluir(){
        System.out.println("Usuario excluido com sucesso!!!");
    }
    
    public void alterar(){
        System.out.println("Usuario alterado com sucesso!!");
    }
    
    public void pesquisar(Usuario u){
        System.out.println(u);
    }
}
