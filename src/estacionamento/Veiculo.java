
package sistemaestacionamento;

import java.util.Date;

/**
 *
 * @author analu
 */

public class Veiculo {

    private String placa;
    private String modelo;
    private String cor;
    private Date anodefabricacao;

    
    public Veiculo(String placa, String modelo, String cor, Date anodefabricacao) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.anodefabricacao = anodefabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public Date getAnodefabricacao() {
        return anodefabricacao;
    }

    public void cadastrar() {}

    public String listar() { 
    return "";}

    public void alterar() {}

    public static void excluir() {}

    public static String pesquisar() {
        return "";}

}

