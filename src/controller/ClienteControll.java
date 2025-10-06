/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ClienteDao;
import dao.EnderecoDao;
import model.Cliente;
import view.ClienteView;

/**
 *
 * @author curso
 */
public class ClienteControll {

    //private EnderecoControll ende = new EnderecoControll();
    private EnderecoDao endao = new EnderecoDao();
    private Cliente model = new Cliente();
    private ClienteView view = new ClienteView();
    private ClienteDao dao = new ClienteDao();

    public ClienteControll() {

    }

    public void cadastrar(){
        //ende.cadastrar();
        model = view.cadastrar();
        endao.cadastrar(model.getEndereco());
        dao.cadastrar(model);

    }

    public void listar(){
        view.listar(dao.listar());
    }

    public void pesquisar(){
        view.mensagemPesq(dao.pesquisar(view.pesquisar()));
    }
    
    public void alterar() {
    String cpf = view.pesquisar(); // já tem método que pede CPF
    String campo = view.escolherCampo();

    if (campo.isEmpty()) {
        System.out.println("Opção inválida!");
        return;
    }

    String valor = view.novoValor();
    dao.alterarCampo(cpf, campo, valor);
}

}
