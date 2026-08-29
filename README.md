# 🧮 Calculadora Simples em Java

Este projeto é uma **calculadora simples desenvolvida em Java**, criada com o objetivo de praticar conceitos fundamentais da linguagem, como entrada de dados, estruturas condicionais, estruturas de repetição e controle de fluxo.

O programa funciona diretamente pelo terminal e permite realizar diferentes operações matemáticas.

## 📋 Funcionalidades

A calculadora possui as seguintes opções:

- ➕ Somar dois números
- ➖ Subtrair dois números
- ✖️ Multiplicar dois números
- ➗ Dividir dois números
- 🚪 Encerrar o programa

Além disso, o programa possui tratamento para:

- ❌ Divisão por zero
- ⚠️ Opções inválidas

## 🛠️ Tecnologias utilizadas

- Java
- `Scanner`
- Estrutura `do while`
- Estrutura condicional `if`
- Estrutura de decisão `switch`

## 📚 Conceitos praticados

Durante o desenvolvimento deste projeto foram utilizados diversos conceitos importantes da linguagem Java.

### 🔹 Entrada de dados

A classe `Scanner` é utilizada para receber os valores digitados pelo usuário.

```java
Scanner entrada = new Scanner(System.in);
```

### 🔹 Estrutura de repetição

O `do while` mantém a calculadora em funcionamento até que o usuário escolha a opção `0`.

```java
do {
    // Código da calculadora
} while (opcao != 0);
```

### 🔹 Estrutura de decisão

O `switch` é utilizado para identificar qual operação matemática foi escolhida.

## ▶️ Como executar o projeto

### 1. Clone o repositório

```bash
git clone https://github.com/Sajoco-afk/CalculadoraSimples.git
```

### 2. Entre na pasta do projeto

```bash
cd CalculadoraSimples
```

### 3. Compile o programa

```bash
javac Calculadora.java
```

### 4. Execute o programa

```bash
java Calculadora
```

## 💻 Exemplo de execução

```text
===========================
=== CALCULADORA SIMPLES ===
===========================

1 - Somar

2 - Subtrair

3 - Multiplicar

4 - Dividir

0 - Sair

Escolha uma opção: 1

Digite o primeiro número: 10
Digite o segundo número: 5

Resultado: 15.0
```

## ⚠️ Tratamento de divisão por zero

O programa verifica se o segundo número informado é igual a zero antes de realizar uma divisão. Dessa forma, evita operações inválidas.

## 📁 Estrutura do projeto

```text
CalculadoraSimples/
│
├── Calculadora.java
├── LICENSE
└── README.md
```

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido como parte dos meus estudos em **Java e lógica de programação**.

O objetivo é praticar conceitos fundamentais da linguagem, especialmente:

- Variáveis
- Operadores matemáticos
- Entrada de dados
- Estruturas condicionais
- Estruturas de repetição
- Estruturas de decisão

## 🚀 Possíveis melhorias futuras

- [ ] Criar uma interface gráfica
- [ ] Adicionar potência
- [ ] Adicionar raiz quadrada
- [ ] Permitir cálculos com mais de dois números
- [ ] Melhorar a validação das entradas do usuário
- [ ] Criar um histórico de cálculos
- [ ] Organizar o código em métodos

## 📄 Licença

Este projeto está sob a licença MIT. Consulte o arquivo `LICENSE` para mais informações.

## 👨‍💻 Autor

**Samuel Covalski**

Desenvolvedor em formação, estudando **Desenvolvimento de Sistemas, Java, lógica de programação, banco de dados e desenvolvimento Full Stack**.

- GitHub: https://github.com/Sajoco-afk

⭐ Se você gostou do projeto, considere deixar uma estrela no repositório!
