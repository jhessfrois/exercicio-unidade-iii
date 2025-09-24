package exercicios;

import java.util.Scanner;

public class Ex03Idade {
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade < 0 || idade > 150) {
            throw new IllegalArgumentException("Idade inválida! Deve estar entre 0 e 150 anos.");
        }
        System.out.println("Idade válida: " + idade);
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite a idade: ");
            setIdade(scanner.nextInt());
            verificarIdade();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Entrada inválida! Digite apenas números inteiros.");
        }
        scanner.close();
    }
}
