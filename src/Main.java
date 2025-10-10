
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
            System.out.println("1 - Gestão de Cliente");
            System.out.println("2 - Gestão de Atendente");
            System.out.println("3 - Gestão de Vagas");
            System.out.println("4 - Sair");
            System.out.print(": ");
            i = sc.nextInt();
            sc.nextLine();


            System.out.println("---------------------------------------------------");


            switch (i){
                case 1:
                    while(x!=6){


                        System.out.println("----------------GESTÃO DE CLIENTE-----------------");
                        System.out.println("Digite:");
                        System.out.println("1 - Cadastrar cliente");
                        System.out.println("2 - Listar Clientes");
                        System.out.println("3 - Pesquisar clientes");
                        System.out.println("4 - Alterar Cliente");
                        System.out.println("5 - Excluir cliente");
                        System.out.println("6 - Sair");
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
                                break;
                            case 6:
                                break;
                        }
                    }
                    System.out.println("-----------------------------------------------");
                    break;
                case 2:
                    while(x!=6){


                        System.out.println("----------------GESTÃO DE ATENDENTE-----------------");
                        System.out.println("Digite:");
                        System.out.println("1 - Cadastrar atendente");
                        System.out.println("2 - Listar atendentes");
                        System.out.println("3 - Pesquisar atendente");
                        System.out.println("4 - Alterar atendente");
                        System.out.println("5 - Excluir atendente");
                        System.out.println("6 - Sair");
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
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                        }
                    }
                    System.out.println("-----------------------------------------------");


                    break;
                case 3:


                    while(x!=3){


                        System.out.println("----------------GESTÃO DE VAGA -----------------");
                        System.out.println("Digite:");
                        System.out.println("1 - Listar atendentes");
                        System.out.println("2 - Pesquisar atendente");
                        System.out.println("3 - Sair");
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
                    System.out.println("-----------------------------------------------");


                    break;
                case 4:


                    break;
            }


        }






        //--enable-native-access=ALL-UNNAMED

        //--------------------------------------CADASTRAR CLIENTE---------------------------------
        /*ClienteDao dao = new ClienteDao();
        ClienteControll controller = new ClienteControll();
        ClienteView view = new ClienteView();

        controller.cadastrar();*/
        //-----------------------------------------------------------------------------------------

        //--------------------------------------LISTAR ENDEREÇOS-----------------------------------

        /*EnderecoControll enderecoControll = new EnderecoControll();
        enderecoControll.listar();*/

        //-----------------------------------------------------------------------------------------

        //--------------------------------------LISTAR CLIENTES-----------------------------------

        /*ClienteControll clienteControll = new ClienteControll();
        clienteControll.listar();*/

        //-----------------------------------------------------------------------------------------

        //--------------------------------------PESQUISAR ENDEREÇOS--------------------------------

        /*EnderecoControll enderecoControll = new EnderecoControll();
        enderecoControll.pesquisar();*/

        //-----------------------------------------------------------------------------------------

        //--------------------------------------LISTAR CLIENTES-----------------------------------

        //ClienteControll clienteControll = new ClienteControll();
        //clienteControll.pesquisar();

        //-----------------------------------------------------------------------------------------

        //--------------------------------------ALTERAR ENDEREÇOS-----------------------------------

        //EnderecoControll enderecoControll = new EnderecoControll();
        //enderecoControll.alterar();

        //-----------------------------------------------------------------------------------------

        //--------------------------------PESQUISAR ATENDENTES------------------------------------

        //AtendenteControll atendenteControll = new AtendenteControll();
        //atendenteControll.pesquisar();

        //-----------------------------------------------------------------------------------------

        //--------------------------------ALTERAR ATENDENTES------------------------------------
        
        //AtendenteControll atendenteControll = new AtendenteControll();
        //atendenteControll.alterar();
        
        //-----------------------------------------------------------------------------------------

        
        //--------------------------------------PESQUISAR VAGAS-------------------------------------
        
        //VagaControll vagacontroll = new VagaControll();
        //vagacontroll.pesquisar();
        
        //-----------------------------------------------------------------------------------------

        //VagaControll vagacontroll = new VagaControll();
        //vagacontroll.listar();
        
        





































         /*Scanner sc = new Scanner(System.in);
        UsuarioDao dao = new UsuarioDao();
        UsuarioView view = new UsuarioView();
        UsuarioControll controller = new UsuarioControll(dao, view);




        System.out.println("----------------TESTANDO O MODELO MVC--------------------\n");
        
        System.out.println("-----------CADASTRar----------");
        
        controller.cadastrar("Evelyn", "123.456.789-10", "74 98863-9374", "20211ireinfint0006@ifba.edu.br", "12345");
        
        controller.cadastrar("Thais", "234.432.655-44", "74 98874-2984", "20211ireinfint0013@ifba.edu.br", "76373");
        
        controller.cadastrar("Analu", "263.859.948-34", "74 98874-7453", "20211ireinfint0008@ifba.edu.br", "64859");
        
        System.out.println("");
        
        System.out.println("-------------LISTAR USUARIOS CADASTRADOS-----------------");
        
        controller.listar();
        
        System.out.println("");
        
        System.out.println("------------------EXCLUIR------------------");
        
        controller.excluir("123.456.789-10");
        
        controller.listar();
        
        System.out.println("");
        
        System.out.println("------------------PESQUISAR------------------");
        
        controller.pesquisar("263.859.948-34");
        
        System.out.println("");
        
        System.out.println("------------------ALTERAR------------------");
        
        controller.alterar("Itala", "234.432.655-44", "74 99954-4345", "20211ireinfint0007@ifba.edu.br", "658478");
        
        controller.listar();

         */
    }
    
}
