/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Cliente;
import model.Endereco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author curso
 */
public class ClienteView {

    Scanner sc = new Scanner(System.in);

    EnderecoView endView = new EnderecoView();

    public ClienteView() {

    }

    public Cliente cadastrar(){

        String nome;
        String cpf;
        String telefone;
        String email;
        String senha;
        String cnh;
        double credito;
        Endereco endereco;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite seu cpf (xxx.xxx.xxx-xx): ");
        cpf = sc.nextLine();
        System.out.println("Digite seu telefone ((xx) xxxxx-xxxx): ");
        telefone = sc.nextLine();
        System.out.println("Digite seu email: ");
        email = sc.nextLine();
        System.out.println("Digite seu senha (8 caracteres): ");
        senha = sc.nextLine();
        System.out.println("Digite seu cnh: ");
        cnh = sc.nextLine();
        System.out.println("Digite seu credito: ");
        credito = sc.nextDouble();

        endereco = endView.cadastrar();


        Cliente cliente = new Cliente(nome, cpf, telefone, email, senha, endereco, cnh, credito);

        return cliente;

    }

    public void cadastrarMsg(int rowsAffected){
        if (rowsAffected > 0) {
            System.out.println("Cliente cadastrado com sucesso!");

        } else {
            System.out.println("Erro ao cadastrar cliente!!");
        }
    }

    public void listar(ArrayList<Cliente> clientes){

        System.out.println("---------------CLIENTES---------------");
        for (Cliente cl : clientes){
            System.out.println("CPF: " + cl.getCpf() + "\nNome: " + cl.getNome() + "\n");
        }
        System.out.println("--------------------------------------");
    }

    public String pesquisar(){
        String cpf;
        System.out.print("Digite o cpf do cliente (xxx.xxx.xxx-xx): ");
        cpf = sc.nextLine();

        return cpf;
    }

    public void mensagemPesq(Cliente cliente){
        System.out.println("CPF: " + cliente.getCpf()
                    + "\nNome: " + cliente.getNome()
                    + "\nEmail: " + cliente.getEmail()
                    + "\nTelefone: " + cliente.getTelefone()
                    + "\nCNH: " + cliente.getCnh()
                    + "\nCredito: " + cliente.getCredito());

    }
    
    public String escolherCampo(){
        System.out.println("Qual campo deseja alterar ?");
        System.out.println("1 - Nome");
        System.out.println("2 - Email");
        System.out.println("3 - Telefone");
        System.out.println("4 - CNH");
        System.out.println("5 - Senha");
        System.out.println("6 - Credito");
        System.out.println("7 - Endereco");
    
        int opcao = sc.nextInt();
        sc.nextLine();
    
         return switch (opcao) {
        case 1 -> "nome";
        case 2 -> "email";
        case 3 -> "telefone";
        case 4 -> "cnh";
        case 5 -> "senha";
        case 6 -> "credito";
        case 7 -> "endereco";
        default -> "";
    };
 
    }

    public void msgAlterar(int rowsAffected){
        if (rowsAffected > 0) {
            System.out.println("Cliente alterar com sucesso!");
        } else {
            System.out.println("Erro ao alterar o cliente!");
        }
    }
    
    public String novoValor() {
    System.out.print("Digite o novo valor: ");
    return sc.nextLine();
}
    
    public String excluir() {
    System.out.print("Digite o CPF do cliente que deseja excluir: ");
    return sc.nextLine();
}
    
}
