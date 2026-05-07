package org.example;

public class CentralDeAtendimento {

    private static CentralDeAtendimento instancia = new CentralDeAtendimento();

    private CentralDeAtendimento() {}

    public static CentralDeAtendimento getInstancia() {
        return instancia;
    }

    public String receberReclamacaoSuporte(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n" +
                "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Suporte.getInstancia().receberReclamacao(mensagem);
    }

    public String receberElogioSuporte(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n" +
                "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Suporte.getInstancia().receberElogio(mensagem);
    }

    public String receberSugestaoSuporte(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n" +
                "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Suporte.getInstancia().receberSugestao(mensagem);
    }
}
