/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yane
 */
import java.util.Scanner;

public class Cliente extends Usuario{
  
    private String cnh;
    private double credito;


    public Cliente(){

    }

    public Cliente(String nome, String cpf, String telefone, String email, String senha, String cnh, double credito) {
        super(nome, cpf, telefone, email, senha);
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
