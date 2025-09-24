package exercicios;

import java.util.Scanner;
import excecoes.SaldoInsuficienteException;

public class Ex07Conta {
    private double saldo;

    public Ex07Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente! Saldo atual: " + saldo);
        }
        saldo -= valor;
        System.out.println("Saque realizado! Saldo atual: " + saldo);
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o saldo inicial: ");
        saldo = scanner.nextDouble();

        try {
            System.out.print("Digite o valor do saque: ");
            double valor = scanner.nextDouble();
            sacar(valor);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
