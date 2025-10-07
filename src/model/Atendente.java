package model;

import java.util.Scanner;

public class Atendente extends Usuario{

    private int id;

    public Atendente() {
    }

    public Atendente(int id) {
        this.id = id;
    }

    public Atendente(String nome, String cpf, String telefone, String email, String senha, Endereco endereco, int id) {
        super(nome, cpf, telefone, email, senha, endereco);
        this.id = id;
    }

    public Atendente(String nome, String cpf, String telefone, String email, String senha, Endereco endereco) {
        super(nome, cpf, telefone, email, senha, endereco);
        this.id = -1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}