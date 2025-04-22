# 🧩 Sudoku no Terminal com Java

Bem-vindo ao repositório do **Sudoku no Terminal**, um projeto desenvolvido com Java puro e executado diretamente pelo terminal. Aqui, aplicamos na prática conceitos de Programação Orientada a Objetos (POO), manipulação de arrays bidimensionais, lógica de validação e interatividade com o usuário — tudo isso em um jogo clássico que desafia o raciocínio lógico!

## ✨ Sobre o Projeto

Este jogo simula um tabuleiro de Sudoku no terminal, com suporte a células fixas e preenchimento pelo usuário. Você pode iniciar o jogo com um conjunto de valores já definidos e, a partir disso, interagir em tempo real, preenchendo os espaços vazios com seus palpites.

Além de reforçar a lógica, este projeto também te ajuda a:

- Trabalhar com argumentos passados via linha de comando;
- Compreender encapsulamento e abstração com classes e métodos;
- Praticar o controle de fluxo e entrada de dados no terminal;
- Usar boas práticas de estruturação de código em Java.

## 🚀 Como Executar

### 1. Compilar o projeto
Abra o terminal na raiz do projeto e execute:

```bash
javac src/*.java
```

### 2. Rodar o jogo com o tabuleiro inicial
O jogo aceita argumentos no formato `x,y;valor,fixed`, onde `fixed` define se a célula é imutável:

```bash
java -cp src Main 0,0;4,false 1,0;7,false 2,0;9,true ...
```

Você pode usar o argumento completo fornecido no desafio da DIO para testar com um tabuleiro realista.

## 🎮 Como Jogar

- O jogo exibe o tabuleiro no terminal.
- Digite as coordenadas `x y` e o valor desejado quando solicitado.
- Exemplo: `3 1 5` (preenche a célula da coluna 3, linha 1 com o número 5).
- Para encerrar o jogo, digite `-1` no campo `x`.

Células fixas (pré-preenchidas) não podem ser alteradas.

## 🧠 Funcionalidades

- ✅ Inserção de números com verificação de células fixas
- ✅ Exibição clara do tabuleiro no terminal, com divisões de blocos 3x3
- ✅ Interatividade via terminal
- 🔜 Validação automática da solução (em desenvolvimento)

## 📁 Estrutura do Projeto

```
SudokuTerminal/
├── src/
│   ├── Cell.java         # Representa cada célula do tabuleiro
│   ├── SudokuBoard.java  # Estrutura e lógica do tabuleiro
│   ├── Game.java         # Motor do jogo: leitura e lógica interativa
│   └── Main.java         # Classe principal que inicializa o jogo
└── README.md             # Documentação do projeto
```

## 💡 Inspiração

Este projeto foi desenvolvido como parte dos desafios propostos pela [Digital Innovation One (DIO)](https://web.dio.me), com base no repositório oficial:

- [Versão terminal - Branch main](https://github.com/digitalinnovationone/sudoku)
- [Versão com interface gráfica - Branch ui](https://github.com/digitalinnovationone/sudoku/tree/ui)

## 🧑‍💻 Autor

Desenvolvido por um estudante apaixonado por lógica, aprendizado prático e soluções criativas em Java 🚀

---

Se você curtiu esse projeto, ⭐ marque o repositório, contribua com melhorias ou adapte essa lógica para outras aplicações de terminal. Bons estudos e bom jogo! 🧩
