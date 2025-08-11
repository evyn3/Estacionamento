
package model;

public class Funcionario extends Usuario {
    private String codigo;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String cpf, String telefone, String email, String senha, String codigo) {
        super(nome, cpf, telefone, email, senha);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /*@Override
    public void cadastrar() {
        System.out.println("Funcionario cadastrado com sucesso.");
    }

    @Override
    public Funcionario listar() {
        return this;
    }

    @Override
    public void excluir() {
        System.out.println("Funcionario excluido.");
    }

    @Override
    public Funcionario pesquisar() {
        return this;
    }

    @Override
    public void alterar() {
        System.out.println("Dados do funcionario alterados.");
    }*/
}
