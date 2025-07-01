import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double saldo = 2500.00;

        System.out.println("################");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome do Cliente: Rhuan Lima");
        System.out.println("Tipo de Conta: Corrente");
        System.out.printf("Saldo Inicial: R$ %.2f\n", saldo);
        System.out.println("################\n");

        do {
            System.out.println("Operações:");
            System.out.println("1 - Consultar Saldos");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir Valor");
            System.out.println("4 - Sair\n");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.printf("Seu saldo é de R$ %.2f\n\n", saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido:");
                    double receberValor = scanner.nextDouble();
                    if (receberValor <= 0){
                        System.out.println("Valor inválido, tente novamente.");
                    } else {
                        System.out.printf("Você recebeu o valor de R$ %.2f\n", receberValor);
                        saldo += receberValor;
                        System.out.printf("Seu saldo atualizado é de R$ %.2f\n\n", saldo);
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido:");
                    double transferirValor = scanner.nextDouble();
                    if (transferirValor > saldo){
                        System.out.println("Valor para transferência insuficiente.");
                    } else if ( transferirValor <= 0){
                        System.out.println("Valor inválido, tente novamente.");
                    } else {
                        System.out.printf("Você transferiu R$ %.2f\n", transferirValor);
                        saldo -= transferirValor;
                        System.out.printf("Seu saldo atualizado é de R$ %.2f\n\n", saldo);
                    }
                    break;
                case 4:
                    System.out.println("Até a próxima!\n");
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma das opções do menu.\n");
                    break;
            }
        } while (opcao != 4);
    }
}