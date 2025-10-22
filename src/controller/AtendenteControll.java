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
        private EnderecoControll enderecoControll = new EnderecoControll();

        public AtendenteControll() {

        }

        public void cadastrar(){
            //ende.cadastrar();
            model = view.cadastrar();
            endao.cadastrar(model.getEndereco());
            int x = dao.cadastrar(model);
            view.cadastrarMsg(x);

        }

        public void listar(){
            view.listar(dao.listar());
        }

        public void pesquisar(){ view.mensagemPesq(dao.pesquisar(view.pesquisar()));}

        public void alterar() {
        int id = view.pesquisar();
        int var = view.pergAlterar();
        if (var == 6){
            enderecoControll.alterar(dao.pesquisar(id).getEndereco().getId());
        } else {
            String x = view.respAlterar(var);

            dao.alterar(id, var, x);
            view.mensagemAlt();
        }

    }

        public void excluir(){

            int id = view.excluir();
            view.msgExcluir(dao.excluir(id));
        }

    }