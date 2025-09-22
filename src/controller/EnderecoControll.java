/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.EnderecoDao;
import model.Endereco;
import view.EnderecoView;

/**
 *
 * @author curso
 */
public class EnderecoControll {
    private Endereco model = new Endereco();
    private EnderecoView view = new EnderecoView();
    private EnderecoDao dao = new EnderecoDao();

    public EnderecoControll() {
    }

    public void cadastrar(){
        model = view.cadastrar();
        dao.cadastrar(model);
    }
}
