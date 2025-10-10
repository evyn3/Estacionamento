package controller;

import dao.AtendenteDAO;
import dao.EnderecoDao;
import model.Atendente;
import view.AtendenteView;

public class AtendenteControll {

        private EnderecoDao endao = new EnderecoDao();
        private Atendente model = new Atendente();
        private AtendenteView view = new AtendenteView();
        private AtendenteDAO dao = new AtendenteDAO();

        public AtendenteControll() {

        }

        public void cadastrar(){
            //ende.cadastrar();
            model = view.cadastrar();
            endao.cadastrar(model.getEndereco());
            dao.cadastrar(model);

        }

        public void listar(){
            view.listar(dao.listar());
        }

        public void pesquisar(){ view.mensagemPesq(dao.pesquisar(view.pesquisar()));}

        public void alterar() {
        int id = view.pesquisar();
        int var = view.pergAlterar();
        String x = view.respAlterar(var);

        dao.alterar(id, var, x);
        view.mensagemAlt();
    }
        
        /*public void pesquisar(){
            view.mensagemPesq(dao.pesquisar(view.pesquisar()));
        }*/

    }