package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Vaga;

public class VagaView {
    
    Scanner sc = new Scanner(System.in);
    
    private int numeroDeVaga;
    private String tipo;
    private String status;

    public VagaView() {
    }
    
    public int pesquisar(){

        int numeroDeVaga;
        System.out.print("Digite o numero da vaga: ");
        numeroDeVaga= sc.nextInt();

        return numeroDeVaga;
    }
    
    public void mensagemPesq(Vaga vaga){
        
        System.out.println("-----------------------------------");
        System.out.println("Numero da Vaga: " + vaga.getNumeroDeVaga()
                + "\nStatus: " + vaga.getStatus()
                + "\nTipo: " + vaga.getTipo()
                );
        System.out.println("-----------------------------------\n");
    }
    
    public void listar(ArrayList<Vaga> vagas){
        System.out.println("-----------------LISTA DE VAGAS------------------");
        for (Vaga v: vagas){
            
            System.out.println("Numero da Vaga: " + v.getNumeroDeVaga()
                + "\nStatus: " + v.getStatus()
                + "\nTipo: " + v.getTipo()
                );
            System.out.println("-----------------------------------\n");
        }
        System.out.println("------------------------------------------");
    }

    
}
