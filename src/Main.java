
import controller.AtendenteControll;
import controller.ClienteControll;
import controller.EnderecoControll;
import controller.UsuarioControll;
import controller.VagaControll;
import dao.ClienteDao;
import dao.EnderecoDao;
import dao.UsuarioDao;
import java.util.Scanner;

import model.Cliente;
import model.Usuario;
import view.ClienteView;
import view.UsuarioView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author curso
 */
public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here

        ClienteControll clienteControll = new ClienteControll();
        AtendenteControll atendenteControll = new AtendenteControll();
        VagaControll vagaControll = new VagaControll();
        Scanner sc = new Scanner(System.in);


        int i = 11;
        int x = 7;


        while (i!=4){
            System.out.println("-------------MENU-------------");
            System.out.println("Digite:");
            System.out.println("1 - Gestao de Cliente");
            System.out.println("2 - Gestao de Atendente");
            System.out.println("3 - Gestao de Vagas");
            System.out.println("4 - Sair");
            System.out.print(": ");
            i = sc.nextInt();


            System.out.println("-------------------------------------");


            switch (i){
                case 1:
                    while(x!=6){


                        System.out.println("----------------GESTAO DE CLIENTE-----------------");
                        System.out.println("Digite:");
                        System.out.println("1 - Cadastrar cliente");
                        System.out.println("2 - Listar Clientes");
                        System.out.println("3 - Pesquisar clientes");
                        System.out.println("4 - Alterar Cliente");
                        System.out.println("5 - Excluir cliente");
                        System.out.println("6 - Sair");
                        System.out.print(": ");
                        x = sc.nextInt();
                        sc.nextLine();


                        switch (x){
                            case 1:
                                clienteControll.cadastrar();
                                break;
                            case 2:
                                clienteControll.listar();
                                break;
                            case 3:
                                clienteControll.pesquisar();
                                break;
                            case 4:
                                clienteControll.alterar();
                                break;
                            case 5:
                                clienteControll.excluir();
                                break;
                            case 6:
                                break;
                        }
                    }
                    x = 0;
                    System.out.println("-----------------------------------------------");
                    break;
                case 2:
                    while(x!=6){


                        System.out.println("----------------GESTAO DE ATENDENTE-----------------");
                        System.out.println("Digite:");
                        System.out.println("1 - Cadastrar atendente");
                        System.out.println("2 - Listar atendentes");
                        System.out.println("3 - Pesquisar atendente");
                        System.out.println("4 - Alterar atendente");
                        System.out.println("5 - Excluir atendente");
                        System.out.println("6 - Sair");
                        System.out.print(": ");
                        x = sc.nextInt();
                        sc.nextLine();


                        switch (x){
                            case 1:
                                atendenteControll.cadastrar();
                                break;
                            case 2:
                                atendenteControll.listar();
                                break;
                            case 3:
                                atendenteControll.pesquisar();
                                break;
                            case 4:
                                atendenteControll.alterar();
                                break;
                            case 5:
                                atendenteControll.excluir();
                                break;
                            case 6:
                                break;
                        }
                    }
                    x = 0;
                    System.out.println("-----------------------------------------------");

                    break;
                case 3:


                    while(x!=3){


                        System.out.println("----------------GESTÃO DE VAGA -----------------");
                        System.out.println("Digite:");
                        System.out.println("1 - Listar atendentes");
                        System.out.println("2 - Pesquisar atendente");
                        System.out.println("3 - Sair");
                        System.out.print(": ");
                        x = sc.nextInt();
                        sc.nextLine();


                        switch (x){
                            case 1:
                                vagaControll.listar();
                                break;
                            case 2:
                                vagaControll.pesquisar();
                                break;
                            case 3:
                                break;
                        }
                    }
                    x = 0;
                    System.out.println("-----------------------------------------------");

                    break;
                case 4:
                    break;
            }


        }


    }
    
}
