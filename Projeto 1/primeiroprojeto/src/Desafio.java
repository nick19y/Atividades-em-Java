import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String mensagemEntrada = """
                Digite a operação desejada: 
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        System.out.println(mensagemEntrada);
        int opcao = leitura.nextInt();

        double saldo = 1000;

        String operacao;

        switch (opcao) {
            case 1:
                operacao = "Consultar saldo";
                System.out.println(saldo);
                break;
            case 2:
                System.out.println("Digite o valor a ser recebido: ");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("Saldo atual: " + saldo);
                break;
            case 3:
                System.out.println("Digite o valor a ser transferido: ");
                double valorTransferido = leitura.nextDouble();
                saldo -= valorTransferido;
                System.out.println("Saldo atual: " + saldo);
                break;
            case 4:
                operacao = "Sair";
                System.out.println(operacao);
                System.out.println("Saldo atual: " + saldo);
                break;
            default:
                operacao = "Operação inválida";
                System.out.println(operacao);
                System.out.println("Saldo atual: " + saldo);
                break;
        }
    }
}
