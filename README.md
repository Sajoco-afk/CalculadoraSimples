# 🧮 Calculadora Simples em Java

Este projeto consiste em uma calculadora desenvolvida em **Java** com o objetivo de praticar conceitos fundamentais da linguagem, como entrada de dados, operadores matemáticos, estruturas condicionais, estruturas de repetição e estruturas de decisão.

O programa funciona diretamente pelo terminal e permite ao usuário realizar diferentes operações matemáticas de forma simples e interativa.

---

## 📋 Funcionalidades

A calculadora possui as seguintes opções:

* ➕ Somar dois números
* ➖ Subtrair dois números
* ✖️ Multiplicar dois números
* ➗ Dividir dois números
* 📐 Calcular a área de um retângulo
* 🚪 Encerrar o programa

Além disso, o programa possui tratamento para:

* ❌ Divisão por zero
* ⚠️ Opções inválidas

---

## 📐 Cálculo da área do retângulo

O programa também permite calcular a área de um retângulo utilizando a fórmula:

```text
Área = Base × Altura
```

Por exemplo:

```text
Base: 10
Altura: 5

Área = 10 × 5
Área = 50
```

---

## 🛠️ Tecnologias utilizadas

* Java
* Classe `Scanner`
* Estrutura de repetição `do while`
* Estrutura condicional `if`
* Estrutura de decisão `switch`
* Operadores matemáticos

---

## 📚 Conceitos praticados

Durante o desenvolvimento deste projeto foram utilizados diversos conceitos importantes da linguagem Java.

### 🔹 Variáveis

Utilização de variáveis para armazenar as opções escolhidas pelo usuário, números informados e resultados das operações.

```java
int opcao;
double a;
double b;
double resultado;
```

### 🔹 Entrada de dados

A classe `Scanner` é utilizada para receber os valores digitados pelo usuário.

```java
Scanner entrada = new Scanner(System.in);
```

### 🔹 Estrutura de repetição

A estrutura `do while` mantém o programa em funcionamento até que o usuário escolha a opção `0`.

```java
do {

    // Código da calculadora

} while (opcao != 0);
```

### 🔹 Estrutura de decisão

A estrutura `switch` identifica qual operação foi escolhida pelo usuário.

```java
switch (opcao) {

    case 1:
        // Soma
        break;

    case 2:
        // Subtração
        break;

    case 3:
        // Multiplicação
        break;

    case 4:
        // Divisão
        break;

    case 5:
        // Área do retângulo
        break;

    default:
        // Opção inválida
}
```

---

## ▶️ Como executar o projeto

### 1. Clone o repositório

```bash
git clone https://github.com/Sajoco-afk/CalculadoraSimples.git
```

### 2. Entre na pasta do projeto

```bash
cd CalculadoraSimples
```

### 3. Acesse a branch `Upgrades`

```bash
git checkout Upgrades
```

### 4. Compile o programa

```bash
javac Calculadora.java
```

### 5. Execute o programa

```bash
java Calculadora
```

---

## 💻 Exemplo de execução

```text
===========================
=== CALCULADORA SIMPLES ===
===========================

1 - Somar

2 - Subtrair

3 - Multiplicar

4 - Dividir

5 - Calcular a área do Retângulo

0 - Sair

Escolha uma opção: 5

Digite o primeiro número: 10
Digite o segundo número: 5

Resultado: 50.0
```

---

## ⚠️ Tratamento de divisão por zero

O programa verifica se o segundo número informado é igual a zero antes de realizar uma divisão.

Dessa forma, evita uma operação matemática inválida.

Exemplo:

```text
Erro: divisão por zero!
```

---

## 📁 Estrutura do projeto

```text
CalculadoraSimples/
│
├── Calculadora.java
├── LICENSE
└── README.md
```

---

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido como parte dos meus estudos em **Java e lógica de programação**.

O objetivo é praticar conceitos fundamentais da programação, especialmente:

* Variáveis
* Operadores matemáticos
* Entrada de dados
* Estruturas condicionais
* Estruturas de repetição
* Estruturas de decisão
* Controle de fluxo
* Manipulação de dados com `Scanner`

---

## 🚀 Próximas melhorias

Algumas funcionalidades que poderão ser adicionadas futuramente:

* [x] Adicionar cálculo da área do retângulo
* [ ] Adicionar cálculo da área do triângulo
* [ ] Adicionar cálculo da área do círculo
* [ ] Adicionar potência
* [ ] Adicionar raiz quadrada
* [ ] Permitir cálculos com mais de dois números
* [ ] Melhorar a validação das entradas do usuário
* [ ] Criar um histórico de cálculos
* [ ] Organizar o código em métodos
* [ ] Criar uma interface gráfica

---

## 📄 Licença

Este projeto está sob a licença **MIT**.

Consulte o arquivo `LICENSE` para mais informações.

---

## 👨‍💻 Autor

**Samuel Covalski**

Desenvolvedor em formação, estudando **Desenvolvimento de Sistemas, Java, lógica de programação, banco de dados e desenvolvimento Full Stack**.

* GitHub: https://github.com/Sajoco-afk

---

⭐ Se você gostou do projeto, considere deixar uma estrela no repositório!
