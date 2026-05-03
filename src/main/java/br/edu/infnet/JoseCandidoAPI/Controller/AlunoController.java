package br.edu.infnet.JoseCandidoAPI.Controller;


import br.edu.infnet.JoseCandidoAPI.modelDomain.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/aluno")

public class AlunoController {

    @GetMapping()//https://localhost:8080/api/aluno/nomes
    public Aluno obterAluno(){

        Aluno aluno = new Aluno();
        aluno.nome = "Ana C.";
        aluno.matricula = 001 ;
        aluno.peso = 52.5;
        aluno.ativo = true;

        return aluno;
    }

}
