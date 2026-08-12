# Sistema Escolar

Programa em Java para cadastro e gerenciamento de notas de um aluno, desenvolvido como exercício de fixação de fundamentos da linguagem (métodos estáticos, arrays, laços de repetição, `switch` e validação de entrada com `Scanner`).

## Funcionalidades

- Cadastro do nome do aluno e da quantidade de disciplinas cursadas
- Cadastro das notas de cada disciplina, com validação de valores (entre 0 e 10)
- Cálculo da média das notas
- Definição do status do aluno com base na média:
  - **Aprovado**: média ≥ 7.0
  - **Recuperação**: média entre 5.0 e 6.9
  - **Reprovado**: média < 5.0
- Busca pela maior e menor nota
- Listagem de todas as notas cadastradas

## Menu de opções

Após o cadastro das notas, o programa exibe um menu:

```
1 - Ver Média e Status do Aluno
2 - Ver Maior e Menor Nota
3 - Listar Todas as Notas
4 - Sair
```

## Estrutura do código

| Método | Descrição |
|---|---|
| `calcularMedia(Double[] notas)` | Calcula a média aritmética das notas |
| `buscarMaiorNota(Double[] notas)` | Retorna a maior nota do array |
| `buscarMenorNota(Double[] notas)` | Retorna a menor nota do array |
| `determinarStatus(Double media)` | Retorna o status do aluno com base na média |
| `main(String[] args)` | Fluxo principal: entrada de dados, validações e menu |

## Como executar

Compile e execute com o JDK instalado:

```bash
javac SistemaEscolar.java
java SistemaEscolar
```

## Exemplo de uso

```
=== CADASTRO DE NOTAS ===
Digite o nome do aluno: João
Quantidade de disciplinas q esse aluno cursa: 3
digite a nota 1: 8.5
digite a nota 2: 6.0
digite a nota 3: 9.0

--- MENU DE OPÇÕES ---
1 - Ver Média e Status do Aluno
2 - Ver Maior e Menor Nota
3 - Listar Todas as Notas
4 - Sair

Qual opção você deseja: 1
Aluno: João
Média: 7.833333333333333
Status: Aprovado
```

## Melhorias futuras

- Fazer o menu repetir em loop até o usuário escolher "Sair" (opção 4), em vez de executar uma única vez
- Formatar a média exibida com casas decimais fixas (ex: `%.2f`)
- Permitir cadastro de múltiplos alunos
