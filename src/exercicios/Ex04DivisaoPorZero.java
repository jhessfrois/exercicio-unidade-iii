package exercicios;

import java.util.Scanner;

public class Ex04DivisaoPorZero {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite um número para dividir por zero: ");
            setNumero(scanner.nextInt());

            int resultado = numero / 0; // provocando a exceção
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Ops! Não é possível dividir por zero.");
        } catch (Exception e) {
            System.out.println("Entrada inválida! Digite apenas números inteiros.");
        }
        scanner.close();
    }
}
