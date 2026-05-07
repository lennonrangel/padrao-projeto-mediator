package org.example;

public class Pessoa {

    public String reclamarSuporte(String mensagem) {
        return CentralDeAtendimento.getInstancia().receberReclamacaoSuporte(mensagem);
    }

    public String elogiarSuporte(String mensagem) {
        return CentralDeAtendimento.getInstancia().receberElogioSuporte(mensagem);
    }

    public String sugerirSuporte(String mensagem) {
        return CentralDeAtendimento.getInstancia().receberSugestaoSuporte(mensagem);
    }
}
