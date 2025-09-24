package exercicios;

import java.util.Scanner;
import excecoes.TransferenciaInvalidaException;

public class Ex09ContaBancaria {
    private double saldo;

    public Ex09ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void transferir(double valor, Ex09ContaBancaria destino) throws TransferenciaInvalidaException {
        if (valor <= 0) throw new TransferenciaInvalidaException("Valor inválido para transferência!");
        if (valor > saldo) throw new TransferenciaInvalidaException("Saldo insuficiente para transferência!");
        saldo -= valor;
        destino.saldo += valor;
        System.out.println("Transferência de " + valor + " realizada com sucesso!");
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o saldo da conta de origem: ");
        saldo = scanner.nextDouble();
        System.out.print("Digite o saldo da conta destino: ");
        double saldoDestino = scanner.nextDouble();
        Ex09ContaBancaria destino = new Ex09ContaBancaria(saldoDestino);

        try {
            System.out.print("Digite o valor a transferir: ");
            double valor = scanner.nextDouble();
            transferir(valor, destino);
            System.out.println("Saldo destino: " + destino.getSaldo());
        } catch (TransferenciaInvalidaException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
