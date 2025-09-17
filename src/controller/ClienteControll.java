/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ClienteDao;
import model.Cliente;
import view.ClienteView;

/**
 *
 * @author curso
 */
public class ClienteControll {
    private Cliente model;
    private ClienteView view = new ClienteView();

    private ClienteDao dao = new ClienteDao();

    public ClienteControll() {

    }

    public void cadastrar(){
        model = view.cadastrar();
        dao.cadastrar(model);
    }

}
