import java.util.Scanner;
import exercicios.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU DE EXERCÍCIOS DA UNIDADE III ===");
            System.out.println("1  - Divisão e Validação de Entradas");
            System.out.println("2  - Conversão de Temperatura e Limites Físicos");
            System.out.println("3  - Validação de Idade");
            System.out.println("4  - Divisão por Zero com Feedback ao Usuário");
            System.out.println("5  - Leitura de Arquivo");
            System.out.println("6  - Conversão de String para Número Inteiro");
            System.out.println("7  - Exceção de Saldo Insuficiente");
            System.out.println("8  - Validação de Senha");
            System.out.println("9  - Validação de Transferências Bancárias");
            System.out.println("10 - Divisão Inteira com Controle de Exatidão");
            System.out.println("0  - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch(opcao) {
                case 1: new Ex01DivisaoSegura().executar(); break;
                case 2: new Ex02ConversorTemperatura().executar(); break;
                case 3: new Ex03Idade().executar(); break;
                case 4: new Ex04DivisaoPorZero().executar(); break;
                case 5: new Ex05LeituraArquivo().executar(); break;
                case 6: new Ex06ConversaoStringNumero().executar(); break;
                case 7: new Ex07Conta(0).executar(); break; // saldo inicial definido no executar()
                case 8: new Ex08ValidadorSenha().executar(); break;
                case 9: new Ex09ContaBancaria(0).executar(); break; // saldos iniciais definidos no executar()
                case 10: new Ex10DivisaoInteira().executar(); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida! Tente novamente."); break;
            }

        } while(opcao != 0);

        scanner.close();
    }
}
