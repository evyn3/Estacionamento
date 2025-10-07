package view;

import model.Atendente;
import model.Endereco;

import java.util.ArrayList;
import java.util.Scanner;

public class AtendenteView {

    Scanner sc = new Scanner(System.in);

    EnderecoView endView = new EnderecoView();


    public AtendenteView() {

    }

    public Atendente cadastrar(){

        String nome;
        String cpf;
        String telefone;
        String email;
        String senha;
        Endereco endereco;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite seu cpf: ");
        cpf = sc.nextLine();
        System.out.println("Digite seu telefone: ");
        telefone = sc.nextLine();
        System.out.println("Digite seu email: ");
        email = sc.nextLine();
        System.out.println("Digite seu senha: ");
        senha = sc.nextLine();

        endereco = endView.cadastrar();


        Atendente atendente = new Atendente(nome, cpf, telefone, email, senha, endereco);

        return atendente;

        }

    public void listar(ArrayList<Atendente> atendentes){

        System.out.println("---------------ATENDENTES---------------");
        for (Atendente at : atendentes){
            System.out.println("\nNome: " + at.getNome() + "\n"+ "Id: " + at.getId() + "\nCPF: " + at.getCpf());
        }
    }




}
