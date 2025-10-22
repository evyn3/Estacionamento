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
    private EnderecoControll enderecoControll = new EnderecoControll();

    public ClienteControll() {

    }

    public void cadastrar(){
        //ende.cadastrar();
        model = view.cadastrar();
        endao.cadastrar(model.getEndereco());
        int x = dao.cadastrar(model);
        view.cadastrarMsg(x);

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
        int x = 0;

        if (campo.isEmpty()) {
            System.out.println("Opção inválida!");
            return;
        }

        if (campo.equals("endereco")){
            enderecoControll.alterar(dao.pesquisar(cpf).getEndereco().getId());
            }else{
            String valor = view.novoValor();
            x =dao.alterarCampo(cpf, campo, valor);
        }
        view.msgAlterar(x);
    }
    public void excluir() {
    String cpf = view.excluir();
    dao.excluir(cpf);
    }
}
