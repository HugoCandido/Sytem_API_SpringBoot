package br.edu.infnet.JoseCandidoAPI.Controller;


import br.edu.infnet.JoseCandidoAPI.modelDomain.Aluno;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@RestController
@RequestMapping("api/aluno")

public class AlunoController implements ApplicationRunner {

    @GetMapping()//https://localhost:8080/api/aluno/nomes
    public Aluno obterAluno(){

        Aluno aluno = new Aluno();
        aluno.nome = "Ana C.";
        aluno.matricula = 001 ;
        aluno.peso = 52.5;
        aluno.ativo = true;

        return aluno;
    }
    @GetMapping("/matricula")
    public int MatriculaAluno(){
        return 1;
    }
    @GetMapping("/peso")
    public double pesoAluno(){
        return 52.5;
    }
    @GetMapping("/ativo")
    public boolean AtivoAluno(){
        return true;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
