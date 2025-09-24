package exercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex05LeituraArquivo {
    private String nomeArquivo;

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void lerArquivo() {
        try {
            File arquivo = new File(nomeArquivo);
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }
            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado! Verifique o nome: " + nomeArquivo);
        }
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo: ");
        setNomeArquivo(scanner.nextLine());
        lerArquivo();
        scanner.close();
    }
}
