package exercicios;

import java.util.Scanner;
import excecoes.SenhaInvalidaException;

public class Ex08ValidadorSenha {
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void validarSenha() throws SenhaInvalidaException {
        if (senha.length() < 8) throw new SenhaInvalidaException("Senha curta! Mínimo 8 caracteres.");
        if (!senha.matches(".*\\d.*")) throw new SenhaInvalidaException("Senha deve conter ao menos um número.");
        if (!senha.matches(".*[A-Z].*")) throw new SenhaInvalidaException("Senha deve conter ao menos uma letra maiúscula.");
        System.out.println("Senha válida!");
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        setSenha(scanner.nextLine());

        try {
            validarSenha();
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
