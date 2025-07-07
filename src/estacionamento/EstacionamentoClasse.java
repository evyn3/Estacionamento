package projeto;

import java.util.Date;

public class EstacionamentoClasse {

    private Date dataHoraEntrada;
    private Date dataHoraSaida;
    private String placa;
    private String id;

    public EstacionamentoClasse(Date dataHoraEntrada, Date dataHoraSaida, String placa, String id) {
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
        this.placa = placa;
        this.id = id;
    }

    public Date getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(Date dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public Date getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(Date dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void emitirRelatorio() {
    }
 
}
