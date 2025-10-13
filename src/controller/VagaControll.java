package controller;

import dao.VagaDAO;
import model.Vaga;
import view.VagaView;


public class VagaControll {

  //private Vaga model = new Vaga();
  private VagaView view = new VagaView();
  private VagaDAO dao = new VagaDAO();

    public VagaControll() {
    }

    public void pesquisar(){
        view.mensagemPesq(dao.pesquisar(view.pesquisar()));
    }
    
    public void listar(){
        view.listar(dao.listar());
    }


 
}
