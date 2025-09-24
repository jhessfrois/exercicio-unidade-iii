package exercicios;

import java.util.Scanner;

public class Ex06ConversaoStringNumero {
    private String entrada;

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        setEntrada(scanner.nextLine());

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número digitado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida! Digite apenas números inteiros.");
        }
        scanner.close();
    }
}
