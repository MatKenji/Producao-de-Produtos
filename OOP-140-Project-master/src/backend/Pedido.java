package backend;
import java.util.ArrayList;

//definição do parametros 
public class Pedido implements Imprimivel {
    private int numero;
    private Pessoa cliente;
    private Data data;
    private ArrayList<Produto> produtos;
    
//construtores
    
    public Pedido(int numero, Pessoa cliente, Data data, ArrayList<Produto> produtos) {
        this.numero = numero;
        this.cliente = cliente;
        this.data = data;
        this.produtos = produtos;
    }

    public Pedido(int numero, Pessoa cliente, Data data) {
        this.numero = numero;
        this.cliente = cliente;
        this.data = data;
        this.produtos = new ArrayList<>();
    }
    
//sets

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
    

//gets
    public int getNumero() {
        return numero;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public Data getData() {
        return data;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    
//metodos
    public float totalPedido() {
        float total = 0;
         // Calcular o custo do produto    
        for (Produto produto : produtos) {
            total += produto.getCusto();
        }
        return total;
    }

//chama Interface
    @Override
    public void imprime() {
        System.out.println("Pedido Número: " + numero + 
                           " Cliente: " + cliente.getNome() + 
                           " Data: " + data.getDia() + "/" + data.getMes() + "/" + data.getAno() + 
                           " Total do Pedido: " + totalPedido());
        //System.out.println("Cliente: " + cliente.getNome());
        //System.out.println("Data: " + data.getDia() + "/" + data.getMes() + "/" + data.getAno());
        //System.out.println("Produtos no Pedido:");
        //for (Produto produto : produtos) {
        //    produto.imprime();
        //}
        //System.out.println("Total do Pedido: " + totalPedido());
    }

    @Override
    public String toString() {
        return "Pedido Número: " + numero + 
                           " Cliente: " + cliente.getNome() + 
                           " Data: " + data.getDia() + "/" + data.getMes() + "/" + data.getAno() + 
                           " Total do Pedido: " + totalPedido() + "\n"; 
    }
    
    
    
    
}