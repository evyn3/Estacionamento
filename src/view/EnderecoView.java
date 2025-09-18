/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Endereco;

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
        System.out.println("Digite a cidade: ");
        cidade = sc.nextLine();

        

    }
}
