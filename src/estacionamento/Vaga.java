package projeto;

public class Vaga {
    
    private int numeroDeVaga;
    private String tipo;
    private String status;

    public Vaga(int numeroDeVaga, String tipo, String status) {
        this.numeroDeVaga = numeroDeVaga;
        this.tipo = tipo;
        this.status = status;
    }

    public int getNumeroDeVaga() {
        return numeroDeVaga;
    }

    public void setNumeroDeVaga(int numeroDeVaga) {
        this.numeroDeVaga = numeroDeVaga;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    
}
