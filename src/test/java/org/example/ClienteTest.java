package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveReclamarSuporte() {
        Cliente cliente = new Cliente();
        assertEquals(
            "A Central de Atendimento agradece seu contato.\n" +
            "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
            ">>O Suporte vai investigar a reclamacao: Sistema fora do ar",
            cliente.reclamarSuporte("Sistema fora do ar")
        );
    }

    @Test
    void deveElogiarSuporte() {
        Cliente cliente = new Cliente();
        assertEquals(
            "A Central de Atendimento agradece seu contato.\n" +
            "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
            ">>O Suporte agradece o elogio: Atendimento rapido e eficiente",
            cliente.elogiarSuporte("Atendimento rapido e eficiente")
        );
    }

    @Test
    void deveSugerirSuporte() {
        Cliente cliente = new Cliente();
        assertEquals(
            "A Central de Atendimento agradece seu contato.\n" +
            "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
            ">>O Suporte vai analisar a sugestao: Adicionar chat ao vivo",
            cliente.sugerirSuporte("Adicionar chat ao vivo")
        );
    }
}
