package projeto;

public class CobrancaAutomatica {
    
    private boolean valor;
    private String idCob;

    public CobrancaAutomatica(boolean valor, String idCob) {
        this.valor = valor;
        this.idCob = idCob;
    }

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }

    public String getIdCob() {
        return idCob;
    }

    public void setIdCob(String idCob) {
        this.idCob = idCob;
    }
    
        public void criar() {      
    }

        
    public String listar() {
        return "";
    }

    public void alterar() {
    }

    public void excluir() {
    }
    
    public String pesquisar() {
        return "";
    }
    
    public double calcularValor(){ 
        return 0;
    }
     
}
