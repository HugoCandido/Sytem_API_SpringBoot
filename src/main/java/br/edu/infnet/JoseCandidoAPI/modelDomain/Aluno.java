package br.edu.infnet.JoseCandidoAPI.modelDomain;

public class Aluno {

    //public String nome; //excluido temporariamente
    private int matricula;
    private double peso;
    private boolean ativo;

    @Override
    public String toString() {
        return String.format(" O Aluno %s, de matricula: %d, de peso atual: %.1f, está %s na nossa academia!", nome, matricula,peso, ativo ? "ATIVO" : "DESATIVADO");
        //"Aluno(a) "+nome+", de matricula "+matricula+", está ativa na academia ? "+ativo+"! segue o peso atual para informação: "+peso+" ";
    }
}
