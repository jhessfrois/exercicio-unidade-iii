package exercicios;

import java.util.Scanner;

public class Ex01DivisaoSegura {

    public static double dividir(double numerador, double denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida!");
        }
        return numerador / denominador;
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o numerador: ");
            double num = scanner.nextDouble();

            System.out.print("Digite o denominador: ");
            double den = scanner.nextDouble();

            double resultado = dividir(num, den);
            System.out.println("Resultado da divisão: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Entrada inválida! Digite apenas números.");
        }
        scanner.close();
    }
}
