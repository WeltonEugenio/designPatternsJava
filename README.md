# Design Patterns em Java

Este repositório contém implementações práticas de **Design Patterns (Padrões de Projeto)** utilizando **Java**.
O objetivo é demonstrar como aplicar soluções reutilizáveis para problemas recorrentes de arquitetura de software.

Os exemplos estão organizados em duas categorias do catálogo **Gang of Four (GoF)**:

* **Padrões Comportamentais (Behavioral)**
* **Padrões Estruturais (Structural)**

Cada padrão possui uma implementação simples e uma classe principal (`Principal`) para demonstrar sua utilização.

---

# Objetivo do Projeto

Este projeto tem como finalidade:

* Demonstrar a implementação prática de **Design Patterns em Java**
* Facilitar o entendimento de **boas práticas de arquitetura**
* Servir como **material de estudo e referência**
* Apresentar exemplos simples e didáticos dos padrões

---

# Estrutura do Projeto

```
src
 ├── comportamentais
 │   ├── chainofresponsibility
 │   ├── command
 │   ├── observer
 │   ├── state
 │   ├── strategy
 │   └── templatemethod
 │
 └── estruturais
     ├── adapter
     ├── composite
     ├── decorator
     ├── facade
     └── proxy
```

Cada pacote contém as classes responsáveis pela implementação do padrão e uma classe `Principal` para demonstrar seu funcionamento.

---

# Padrões Comportamentais

## Strategy

Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis.

No projeto, o padrão é demonstrado através do **cálculo de impostos**, permitindo trocar a estratégia de cálculo dinamicamente.

Exemplos de estratégias implementadas:

* ICMS
* ISS
* PIS

---

## Chain of Responsibility

Permite passar uma requisição por uma cadeia de objetos até que um deles consiga tratá-la.

No exemplo do projeto, a cadeia é utilizada para calcular **descontos em um orçamento**, onde cada classe verifica se pode aplicar o desconto ou delega para o próximo elemento da cadeia.

---

## Command

Encapsula uma solicitação como um objeto, permitindo parametrizar clientes com diferentes requisições.

Esse padrão desacopla:

* quem **solicita a operação**
* quem **executa a operação**

Muito útil para sistemas que trabalham com **filas, logs ou undo/redo**.

---

## Observer

Define uma dependência **um-para-muitos** entre objetos, onde múltiplos observadores são notificados automaticamente quando o estado de um objeto muda.

Muito utilizado em sistemas de **eventos e notificações**.

---

## State

Permite que um objeto altere seu comportamento quando seu estado interno muda.

Esse padrão elimina grandes estruturas condicionais (`if` ou `switch`) relacionadas ao estado de um objeto.

---

## Template Method

Define o **esqueleto de um algoritmo em uma classe base**, permitindo que subclasses redefinam partes específicas do algoritmo sem alterar sua estrutura geral.

---

# Padrões Estruturais

## Adapter

Permite que **interfaces incompatíveis trabalhem juntas**, atuando como um adaptador entre dois sistemas diferentes.

---

## Composite

Permite tratar **objetos individuais e composições de objetos da mesma forma**.

Muito utilizado em estruturas hierárquicas como **árvores de objetos**.

---

## Decorator

Permite adicionar **novas responsabilidades a um objeto dinamicamente**, sem modificar sua estrutura original.

Esse padrão evita a criação excessiva de subclasses.

---

## Facade

Fornece uma **interface simplificada para um conjunto de interfaces de um subsistema**.

A Facade reduz a complexidade do sistema ao expor apenas os métodos necessários para o cliente.

---

## Proxy

Fornece um **objeto substituto que controla o acesso ao objeto real**.

Pode ser utilizado para:

* controle de acesso
* cache
* lazy loading
* logging
* comunicação remota

---

# Como Executar

1. Clone o repositório

```
git clone https://github.com/WeltonEugenio/designPatternsJava.git
```

2. Abra o projeto em uma IDE Java

Sugestões:

* IntelliJ IDEA
* Eclipse
* VS Code

3. Execute as classes `Principal` de cada padrão para visualizar os exemplos.

---

# Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Design Patterns (GoF)

---

# Referências

* Design Patterns: Elements of Reusable Object-Oriented Software — Gang of Four
* Clean Code — Robert C. Martin
* Refactoring Guru

---

# Autor

Welton Eugenio
