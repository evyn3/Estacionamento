/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaestacionamento;

/**
 *
 * @author yane
 */
import java.util.Scanner;

public class Cliente {
  
    private String cnh;
    private double credito;

   
    public Cliente(String cnh, double credito) {
        this.cnh = cnh;
        this.credito = credito;
    }

    public boolean reservarVaga() {
    return true;}

   
    public void adicionarVeic() {}

   
    public ReservaDeVaga verHistorico() {
    return new ReservaDeVaga();}

  
    public boolean adicionarCredito(double valor) {
        return true;}

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
