package sistemaestacionamento;

import java.util.Scanner;

public class Atendente extends Funcionario {

    public Atendente() {
        super();
    }

    public Atendente(String nome, String cpf, String telefone, String email, String senha, String codigo) {
        super(nome, cpf, telefone, email, senha, codigo);
    }

    public void cadastrarCliente() {
        
        System.out.println("Redirecionando para a tela de cadastro de cliente...");
    }

    public void reservarVaga() {
        System.out.println("Redirecionando para a tela de reserva de vaga...");
    }

    public void registrarTempoExtra() {
        System.out.println("Tempo extra registrado para a reserva do cliente.");
    }

    public void registrarPagamento() {
        System.out.println("Pagamento registrado com sucesso.");
    }

    public void monitorarVagas() {
        System.out.println("Monitorando vagas disponiveis no estacionamento...");
    }

    public void monitorarEstacionamento() {
        System.out.println("Monitorando funcionamento do estacionamento...");
    }

    public void sair() {
        System.out.println("Saindo do sistema.");
        System.exit(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Atendente atendente = new Atendente("Marina", "222333444-55", "74988445566", "marina@email.com", "038927", "A001");

        System.out.println("Bem-vindo, " + atendente.getNome());

        while (true) {
            System.out.println("\nMENU ATENDENTE:");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Reservar Vaga");
            System.out.println("3 - Registrar Tempo Extra");
            System.out.println("4 - Registrar Pagamento");
            System.out.println("5 - Monitorar Vagas");
            System.out.println("6 - Monitorar Estacionamento");
            System.out.println("7 - Sair");
            System.out.print("\nEscolha uma opcao: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    atendente.cadastrarCliente();
                    break;
                case 2:
                    atendente.reservarVaga();
                    break;
                case 3:
                    atendente.registrarTempoExtra();
                    break;
                case 4:
                    atendente.registrarPagamento();
                    break;
                case 5:
                    atendente.monitorarVagas();
                    break;
                case 6:
                    atendente.monitorarEstacionamento();
                    break;
                case 7:
                    atendente.sair();
                    break;
                default:
                    System.out.println("Opcaoo invalida, tente novamente.");
            }
        }
    }
}
