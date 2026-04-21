package br.edu.infnet.JoseCandidoAPI.modelDomain;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

@Component
public class AlunoLoader implements ApplicationRunner {

@Override
    public void run(ApplicationArguments args) throws Exception {
//para ler um arquivo com dados
    InputStream input = getClass().getClassLoader().getResourceAsStream("Database.txt");

    if (input == null) {
        throw new RuntimeException("Arquivo NÃO encontrado no classpath!");
    }

    BufferedReader leitura = new BufferedReader(new InputStreamReader(input));
    String linha;

    while ((linha = leitura.readLine()) != null) {

        String[] campos = linha.split(";");

                Aluno aluno = new Aluno();
                aluno.nome = campos[0];
                aluno.matricula = Integer.parseInt(campos[1]);
                aluno.peso = Double.parseDouble(campos[2]);
                aluno.ativo = Boolean.parseBoolean(campos[3]);

                System.out.println(aluno);


    }

    leitura.close();

    }
}
