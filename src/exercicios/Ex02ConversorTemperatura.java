package exercicios;

import java.util.Scanner;

public class Ex02ConversorTemperatura {
    private double temperaturaCelsius;

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public void setTemperaturaCelsius(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double converterCelsiusParaFahrenheit() {
        if (temperaturaCelsius < -273.15) {
            throw new IllegalArgumentException("Erro: Temperatura abaixo do zero absoluto!");
        }
        return temperaturaCelsius * 9/5 + 32;
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite a temperatura em Celsius: ");
            setTemperaturaCelsius(scanner.nextDouble());

            double fahrenheit = converterCelsiusParaFahrenheit();
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Entrada inválida! Digite apenas números.");
        }
        scanner.close();
    }
}
