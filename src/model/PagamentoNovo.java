package model;


public class PagamentoNovo {
    private String metodo;
    private String id;
    private Double valor;

    public PagamentoNovo() {
    }

    public PagamentoNovo(String metodo, String id, Double valor) {
        this.metodo = metodo;
        this.id = id;
        this.valor = valor;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void registrar() {
    }

    public void excluir() {
    }

    public PagamentoNovo pesquisar() {
        return null;
    }

    public void alterar() {
    }

    public PagamentoNovo listar() {
        return null;
    }

    public void emitirRelatorio() {
    }
}