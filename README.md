Este projeto é um sistema de gerenciamento de produção que permite gerenciar matérias-primas, ingredientes, produtos, processos de manufatura, operadores, pedidos e clientes. Ele foi desenvolvido em Java e utiliza a classe `ArrayList` para armazenar coleções de objetos.

## Funcionalidades

- **Gerenciamento de Matérias-Primas:** Cadastro de matérias-primas com nome, unidade, fornecedor e preço.
- **Gerenciamento de Ingredientes:** Associação de matérias-primas a ingredientes com quantidade específica.
- **Gerenciamento de Produtos:** Cadastro de produtos com ingredientes e processos de manufatura associados. Cálculo do custo total do produto.
- **Gerenciamento de Processos de Manufatura:** Cadastro de processos de manufatura com nome, custo por hora, operador e equipamento.
- **Gerenciamento de Operadores:** Cadastro de operadores com cargo e salário por hora.
- **Gerenciamento de Pedidos:** Cadastro de pedidos com número, cliente, data e produtos. Cálculo do total do pedido.
- **Gerenciamento de Clientes:** Cadastro de clientes com nome, data de nascimento, CPF e endereço.

## Classes

### MateriaPrima
Representa uma matéria-prima utilizada na produção.
- Atributos: nome, unidade, fornecedor, preço.
- Métodos: `imprime()`

### Ingrediente
Representa um ingrediente feito de uma matéria-prima.
- Atributos: materiaPrima (objeto de `MateriaPrima`), qtde.
- Métodos: `imprime()`

### Produto
Representa um produto composto por ingredientes e processos de manufatura.
- Atributos: nome, ingredientes (lista de `Ingrediente`), manufaturas (lista de `Manufatura`), custo.
- Métodos: `adicionaIngrediente()`, `adicionaManufatura()`, `calculaCusto()`, `imprime()`

### Manufatura
Representa um processo de manufatura associado a um produto.
- Atributos: processo (objeto de `Processo`), qtde.
- Métodos: `imprime()`

### Processo
Representa um processo de produção.
- Atributos: nome, custoHora, operador (objeto de `Operador`), equipamento (objeto de `Equipamento`).
- Métodos: `imprime()`

### Operador
Representa um operador que herda de `Pessoa`.
- Atributos: cargo, salarioHora.
- Métodos: `imprime()`

### Pessoa
Representa uma pessoa com informações básicas.
- Atributos: nome, dataNasc (objeto de `Data`), cpf, endereco (objeto de `Endereco`).
- Métodos: `imprime()`

### Endereco
Representa um endereço.
- Atributos: estado, cidade, bairro, rua, numero.
- Métodos: `imprime()`

### Equipamento
Representa um equipamento utilizado no processo de manufatura.
- Atributos: nome, fabricante, dataFabricacao (objeto de `Data`), depreciacaohora.
- Métodos: `imprime()`

### Data
Representa uma data.
- Atributos: dia, mes, ano.
- Métodos: `imprime()`

### Pedido
Representa um pedido feito por um cliente.
- Atributos: numero, cliente (objeto de `Pessoa`), data (objeto de `Data`), produtos (lista de `Produto`).
- Métodos: `totalPedido()`, `imprime()`
