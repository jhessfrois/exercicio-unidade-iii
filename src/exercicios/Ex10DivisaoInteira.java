package exercicios;

import java.util.Scanner;
import excecoes.DivisaoInteiraInvalidaException;

public class Ex10DivisaoInteira {
    private int numerador;
    private int denominador;

    public void setNumerador(int numerador) { this.numerador = numerador; }
    public void setDenominador(int denominador) { this.denominador = denominador; }

    public int dividir() throws DivisaoInteiraInvalidaException {
        if (denominador == 0) throw new DivisaoInteiraInvalidaException("Divisão por zero não permitida!");
        if (numerador % denominador != 0) throw new DivisaoInteiraInvalidaException("Divisão não exata!");
        return numerador / denominador;
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numerador: ");
        setNumerador(scanner.nextInt());
        System.out.print("Digite o denominador: ");
        setDenominador(scanner.nextInt());

        try {
            int resultado = dividir();
            System.out.println("Resultado: " + resultado);
        } catch (DivisaoInteiraInvalidaException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
