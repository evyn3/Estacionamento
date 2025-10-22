/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Endereco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author curso
 */
public class EnderecoView {

    Scanner sc = new Scanner(System.in);
    private String rua;
    private String bairro;
    private int numero;
    private String cidade;
    public EnderecoView() {

    }

    public Endereco cadastrar(){
        System.out.println("Digite a rua: ");
        rua = sc.nextLine();
        System.out.println("Digite a bairro: ");
        bairro = sc.nextLine();
        System.out.println("Digite o numero: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a cidade: ");
        cidade = sc.nextLine();

        Endereco endereco = new Endereco(rua, numero, bairro, cidade);

        return endereco;
    }

    public void listar(ArrayList<Endereco> enderecos){
        System.out.println("-----------------LISTA DE ENDEREÇOS------------------");
        for (Endereco end: enderecos){
            System.out.println("ID: " + end.getId()
                            + "\nRua: " + end.getRua()
                            + "\nNumero: " + end.getNumero()
                            + "\nBairro: " + end.getBairro()
                            + "\nCidade: " + end.getCidade()
                            + "\n");
        }
    }

    public int pesquisar(){

        int id;
        System.out.print("Digite o id do endereco: ");
        id = sc.nextInt();

        return id;
    }

    public void mensagemPesq(Endereco end){
        System.out.println("ID: " + end.getId()
                + "\nRua: " + end.getRua()
                + "\nNumero: " + end.getNumero()
                + "\nBairro: " + end.getBairro()
                + "\nCidade: " + end.getCidade()
                + "\n");
    }

    public int pergAlterar(){
        System.out.println("O que deseja alterar? ");
        System.out.println("1 - numero\n2 - rua\n3 - bairro\n4 - cidade");
        System.out.println(": ");
        int var = sc.nextInt();
        sc.nextLine();

        return var;
    }
    public String respAlterar(int var){
        switch (var){
            case 1:
                System.out.println("Digite o número: ");
                break;
            case 2:
                System.out.println("Digite a rua: ");
                break;
            case 3:
                System.out.println("Digite o bairro: ");
                break;
            case 4:
                System.out.println("Digite a cidade: ");
                break;
        }

        String x = sc.nextLine();

        return x;
    }

    public void mensagemAlt(){
        System.out.println("Alteração feita com sucesso!!");
    }

}
