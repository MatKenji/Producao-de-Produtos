package backend;
import java.util.ArrayList;

//definição do parametros 
public class Produto implements Imprimivel {
    private String nome;
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<Manufatura> manufaturas;
    private float custo;

//construtores

    public Produto() {
    }
            
    public Produto(ArrayList<Manufatura> manufaturas,ArrayList<Ingrediente> ingrediente) {
        this.manufaturas = manufaturas;
        this.ingredientes = ingrediente;

    }
        
    
    public Produto(String nome, ArrayList<Ingrediente> ingredientes, ArrayList<Manufatura> manufaturas) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.manufaturas = manufaturas;
    }

    public Produto(String nome) {
        this.nome = nome;
        this.ingredientes = new ArrayList<>();
        this.manufaturas = new ArrayList<>();
    }

//add lista    
    public void adicionaIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }
//add lista  
    public void adicionaManufatura(Manufatura manufatura) {
        manufaturas.add(manufatura);
    }
    
public float calculaCusto() {
    float custoTotal = 0;

    // Calcular o custo com base nos ingredientes
    for (Ingrediente ingrediente : ingredientes) {
        custoTotal += ingrediente.getMateriaPrima().getPreco() * ingrediente.getQtde();
    }

    // Calcular o custo com base nas manufaturas
    for (Manufatura manufatura : manufaturas) {
        custoTotal += manufatura.getProcesso().getCustoHora() * manufatura.getQtde();
    }
    
    custo = custoTotal;

    return custo;
}
//sets

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setManufaturas(ArrayList<Manufatura> manufaturas) {
        this.manufaturas = manufaturas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
//gets
    public String getNome() {
        return nome;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public ArrayList<Manufatura> getManufaturas() {
        return manufaturas;
    }

    public float getCusto() {
        return custo;
    }
//chama Interface
    @Override
    public void imprime() {
        System.out.println("Produto: " + nome);
        System.out.println("Custo: " + calculaCusto());
        System.out.println("Ingredientes: ");
        for (Ingrediente ingrediente : ingredientes) {
            ingrediente.imprime();
        }
        System.out.println("Manufatura: ");
        for (Manufatura manufatura : manufaturas) {
            manufatura.imprime();
        }
    }

    @Override
    public String toString() {
        return "Produto: " + nome + "Custo: " + calculaCusto() + "\n"; 
    }
    
    
}