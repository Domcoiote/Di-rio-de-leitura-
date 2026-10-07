# Diário de Leituras

## Estudo de Caso 20

Sistema desenvolvido em Kotlin para acompanhamento de leituras de um clube do livro.

O projeto permite cadastrar livros, registrar sessões de leitura, acompanhar o progresso das páginas lidas e verificar o cumprimento da meta anual de leitura.

## Funcionalidades

- Cadastro de livros com título, quantidade de páginas e gênero.
- Registro de sessões de leitura com data e páginas lidas.
- Soma das páginas lidas através de laço de repetição.
- Cálculo da porcentagem de conclusão do livro.
- Verificação da meta anual de páginas.
- Classificação da emoção da leitura de acordo com o gênero.
- Uso de citação favorita opcional utilizando Null Safety.

## Classes

### Livro

Representa um livro e possui:

- Título
- Total de páginas
- Gênero
- Citação favorita opcional

### SessaoLeitura

Representa uma sessão de leitura e possui:

- Data
- Quantidade de páginas lidas

### Leitor

Representa o leitor e possui:

- Nome
- Meta anual de páginas
- Lista de sessões de leitura

## Regras de negócio

### Progresso de leitura

As páginas de todas as sessões são somadas utilizando um laço `for`.

A porcentagem de conclusão é calculada através da fórmula:

`páginas lidas / total de páginas × 100`

### Meta anual

É utilizado `if/else` para verificar se o leitor atingiu sua meta anual.

Quando a meta é atingida, o sistema exibe:

> Parabéns! Você atingiu sua meta de leitura do ano!

### Gêneros literários

É utilizado `when` para classificar a emoção da leitura:

| Código | Gênero | Emoção |
|---|---|---|
| 1 | Ficção | Viajando para outro mundo |
| 2 | Terror | Lendo de luz acesa |
| 3 | Técnico | Aumentando o QI |

### Null Safety

A citação favorita é opcional (`String?`).

Quando o livro não possui uma citação, o operador `?:` exibe uma mensagem informando que nenhuma citação foi registrada.

## Tecnologias utilizadas

- Kotlin
- Programação Orientada a Objetos (POO)
- Int
- Double
- String
- Boolean
- if/else
- when
- for
- Null Safety

## Objetivo

O objetivo do projeto é aplicar conceitos fundamentais da linguagem Kotlin e de Programação Orientada a Objetos na construção de um sistema simples de acompanhamento de leituras.
