/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

/**
 *
 * @author curso
 */
public class ReservaDeVaga {
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;
    private int idReserva;
    private Vaga vaga;
    private int i = 0;

    public ReservaDeVaga() {
    }

    public ReservaDeVaga(LocalDateTime dataHoraEntrada, LocalDateTime dataHoraSaida, Vaga vaga) {
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
        this.vaga = vaga;
        this.idReserva = i++;
        this.vaga.getstatus("Ocupada");
    }

    public LocalDateTime getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public LocalDateTime getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    
    public void criar() {}
    
    public ReservaDeVaga listar() { return this; }
    
    public void excluir() {}
    
    public ReservaDeVaga pesquisar() { return this; }
    
    public void alterar() {}
    
}
