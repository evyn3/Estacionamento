package model;

import java.util.Scanner;

public class Gerente extends Funcionario {

    public Gerente() {
        super();
    }

    public Gerente(String nome, String cpf, String telefone, String email, String senha, String codigo) {
        super(nome, cpf, telefone, email, senha, codigo);
    }

    public void cadastrarAtendente() {
        
        System.out.println("Cadastro de atendente iniciado...");
    }

    public void monitorarVagas() {
        
        System.out.println("Monitorando vagas disponíveis...");
    }

    public void monitorarEstacionamento() {
        
        System.out.println("Monitorando o funcionamento geral do estacionamento...");
    }

    public void emitirRelatorio() {
        
        System.out.println("Relatorio emitido com sucesso.");
    }

    public void sair() {
        
        System.out.println("Encerrando sessao.");
        System.exit(0);
    }

    // Menu interativo
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerente gerente = new Gerente("Tassila", "123456789-10", "74999112233", "tassila@email.com", "85637", "G001");

        System.out.println("Bem-vindo, " + gerente.getNome());
        
        int opcao;

        do {
            System.out.println("\n MENU DO GERENTE ");
            System.out.println("1. Cadastrar Atendente");
            System.out.println("2. Monitorar Vagas");
            System.out.println("3. Monitorar Estacionamento");
            System.out.println("4. Emitir Relatorio");
            System.out.println("5. Sair");
            System.out.print("\nEscolha uma opcao: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gerente.cadastrarAtendente();
                    break;
                case 2:
                    gerente.monitorarVagas();
                    break;
                case 3:
                    gerente.monitorarEstacionamento();
                    break;
                case 4:
                    gerente.emitirRelatorio();
                    break;
                case 5:
                    gerente.sair();
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
