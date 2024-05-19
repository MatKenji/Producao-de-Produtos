package backend;

//Criando a Main para testar as Classes
public class Main {
    public static void main(String[] args) {
        // criando objetos de Data para usar em outras classes
        Data dataNascimento = new Data(10, 5, 1990);
        Data dataFabricacaoEquipamento = new Data(15, 8, 2020);

        // criando objetos de Endereço
        Endereco enderecoCliente = new Endereco("SP", "São Paulo", "Centro", "Rua A", 123);
        Endereco enderecoOperador = new Endereco("RJ", "Rio de Janeiro", "Copacabana", "Avenida B", 456);

        // criando objetos de Pessoa
        Pessoa cliente = new Pessoa("João", dataNascimento, "123.456.789-00", enderecoCliente);
        Operador operador = new Operador("Maria", dataNascimento, "987.654.321-00", enderecoOperador, "Operador de Máquina", (float) 20.0);

        // criando objetos de MateriaPrima
        MateriaPrima materiaPrima1 = new MateriaPrima("Açúcar", "kg", "Fornecedor A", 2.5f);
        MateriaPrima materiaPrima2 = new MateriaPrima("Farinha de Trigo", "kg", "Fornecedor B", 3.0f);

        // criando objetos de Ingrediente
        Ingrediente ingrediente1 = new Ingrediente(materiaPrima1, 0.5f);
        Ingrediente ingrediente2 = new Ingrediente(materiaPrima2, 0.3f);

        // criando objeto de Produto e adicionando ingredientes
        Produto produto = new Produto("Bolo de Chocolate");
        produto.adicionaIngrediente(ingrediente1);
        produto.adicionaIngrediente(ingrediente2);

        // criando objetos de Pedido e adicionando produtos
        Pedido pedido = new Pedido(1, cliente, dataNascimento);
        pedido.getProdutos().add(produto);

        // criando objetos de Equipamento
        Equipamento equipamento = new Equipamento("Máquina de Produção", "Fabricante XYZ", dataFabricacaoEquipamento, 10.0f);

        // criando objetos de Processo
        Processo processo = new Processo("Produção de Bolo", 15.0f, operador, equipamento);

        // criando objetos de Manufatura e associando ao Processo
        Manufatura manufatura = new Manufatura(processo, 2.0f);

        // imprimindo informações com a Interface
        System.out.println("Informações do Cliente:");
        cliente.imprime();

        System.out.println("\nInformações do Operador:");
        operador.imprime();

        System.out.println("\nInformações do Pedido:");
        pedido.imprime();

        System.out.println("\nInformações do Equipamento:");
        equipamento.imprime();

        System.out.println("\nInformações do Processo:");
        processo.imprime();

        System.out.println("\nInformações da Manufatura:");
        manufatura.imprime();
    }
}