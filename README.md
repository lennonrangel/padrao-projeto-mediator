# Padrão de Projeto Mediator

Projeto desenvolvido para a disciplina de **Arquitetura e Projeto de Software**.

## Descrição

Este projeto demonstra a implementação do padrão comportamental **Mediator**, que tem como objetivo reduzir as dependências caóticas entre objetos, fazendo com que eles se comuniquem indiretamente, através de um objeto mediador central.

O padrão foi aplicado para modelar um sistema de **central de atendimento ao cliente**. O `Cliente` nunca se comunica diretamente com o `Suporte` — toda comunicação passa obrigatoriamente pela `CentralDeAtendimento`, que coordena, repassa e formata as respostas.

## Estrutura

| Classe | Papel |
|---|---|
| `Pessoa` | Classe base com os métodos de comunicação |
| `Cliente` | Remetente — estende `Pessoa` |
| `CentralDeAtendimento` | Mediador Singleton — coordena toda a comunicação |
| `Suporte` | Receptor Singleton — responde as demandas |
| `ISetor` | Interface que os setores implementam |

## Funcionamento

A `CentralDeAtendimento` atua como ponto central de comunicação. Quando o `Cliente` envia uma mensagem, ele sempre chama o mediador, que repassa ao setor responsável e devolve a resposta formatada:

- **reclamarSuporte()** → `CentralDeAtendimento` → `Suporte.receberReclamacao()`
- **elogiarSuporte()** → `CentralDeAtendimento` → `Suporte.receberElogio()`
- **sugerirSuporte()** → `CentralDeAtendimento` → `Suporte.receberSugestao()`

Isso evita a necessidade de o `Cliente` conhecer diretamente o `Suporte`, eliminando dependências como:
- `Suporte.getInstancia().receberReclamacao()` chamado diretamente pelo cliente

## Vantagens

- Reduz o acoplamento entre os objetos participantes
- Centraliza a lógica de comunicação em um único lugar
- Facilita a adição de novos setores sem alterar os remetentes
- Simplifica a manutenção ao evitar dependências cruzadas
- Segue o princípio de Responsabilidade Única (Single Responsibility Principle)

## Como executar

Abrir o projeto no IntelliJ como um projeto Maven e executar os testes localizados em:

- `ClienteTest`
