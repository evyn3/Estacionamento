/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Cliente;

import java.util.Scanner;

/**
 *
 * @author curso
 */
public class ClienteView {

    Scanner sc = new Scanner(System.in);

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
        System.out.println("Digite seu cnh: ");
        cnh = sc.nextLine();
        System.out.println("Digite seu credito: ");
        credito = sc.nextDouble();

        Cliente cliente = new Cliente(nome, cpf, telefone, email, senha, cnh, credito);

        return cliente;

    }
}
