package view;

import model.Atendente;
import model.Cliente;
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
        System.out.println("Digite seu cpf (xxx.xxx.xxx-xx): ");
        cpf = sc.nextLine();
        System.out.println("Digite seu telefone {(xx) xxxxx-xxxx}:");
        telefone = sc.nextLine();
        System.out.println("Digite seu email: ");
        email = sc.nextLine();
        System.out.println("Digite seu senha: ");
        senha = sc.nextLine();

        endereco = endView.cadastrar();


        Atendente atendente = new Atendente(nome, cpf, telefone, email, senha, endereco);

        return atendente;

        }

    public void cadastrarMsg(){
        System.out.println("Atendente cadastrado com sucesso!!!!\n");
    }

    public void listar(ArrayList<Atendente> atendentes){

        System.out.println("---------------ATENDENTES---------------");
        for (Atendente at : atendentes){
            System.out.println("\nNome: " + at.getNome() + "\n"+ "Id: " + at.getId() + "\nCPF: " + at.getCpf());
        }
        System.out.println("----------------------------------------------------");
    }

    public int pesquisar(){
        int id;
        System.out.print("Digite o id do funcionário: ");
        id = sc.nextInt();

        return id;
    }

    public void mensagemPesq(Atendente atendente){
        System.out.println("ID: " + atendente.getId()+ "\nCPF: " + atendente.getCpf()
                + "\nNome: " + atendente.getNome()
                + "\nEmail: " + atendente.getEmail()
                + "\nTelefone: " + atendente.getTelefone());
    }
    
    public int pergAlterar() {
        System.out.println("O que deseja alterar?");
        System.out.println("1 - Nome\n2 - CPF\n3 - Email\n4 - Telefone\n5 - Senha\n6 - Endereço");
        System.out.print(": ");
        int var = sc.nextInt();
        sc.nextLine();
        return var;
    }

    public String respAlterar(int var) {
        switch (var) {
            case 1: System.out.print("Digite o novo nome: "); break;
            case 2: System.out.print("Digite o novo CPF: "); break;
            case 3: System.out.print("Digite o novo email: "); break;
            case 4: System.out.print("Digite o novo telefone: "); break;
            case 5: System.out.print("Digite a nova senha: "); break;
            default: System.out.print("Digite o novo valor: "); break;
        }
        return sc.nextLine();
    }

    public void mensagemAlt() {
        System.out.println("Alteração feita com sucesso!!");
    }

}
