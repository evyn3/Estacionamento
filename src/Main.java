
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

        //--enable-native-access=ALL-UNNAMED

        //--------------------------------------CADASTRAR CLIENTE---------------------------------
        //ClienteDao dao = new ClienteDao();
        //ClienteControll controller = new ClienteControll();
        //ClienteView view = new ClienteView();

        //controller.cadastrar();
        //-----------------------------------------------------------------------------------------

        //--------------------------------------LISTAR ENDEREÇOS-----------------------------------

        /*EnderecoControll enderecoControll = new EnderecoControll();
        enderecoControll.listar();*/

        //-----------------------------------------------------------------------------------------

        //--------------------------------------LISTAR CLIENTES-----------------------------------

        //ClienteControll clienteControll = new ClienteControll();
        //clienteControll.listar();

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
        
        //--------------------------------------ALTERAR CLIENTE-----------------------------------
        //ClienteControll clienteControll = new ClienteControll();
        //clienteControll.alterar();
        //-----------------------------------------------------------------------------------------

        
        //--------------------------------------LISTAR VAGAS-------------------------------------
        
        VagaControll vagacontroll = new VagaControll();
        vagacontroll.pesquisar();
        
        //-----------------------------------------------------------------------------------------

        
        

        



































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
