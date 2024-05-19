package backend;

//definição do parametros 
public class Operador extends Pessoa {
    private String cargo;
    private float salarioHora;
//construtores

    public Operador() {
        super(null, null, null, null);
        this.cargo = null;
        this.salarioHora = 0;
    }
    
    
    public Operador(String nome, Data dataNasc, String cpf, Endereco endereco, String cargo, float salarioHora) {
        super(nome, dataNasc, cpf, endereco);
        this.cargo = cargo;
        this.salarioHora = salarioHora;
    }

    public Operador(String cargo, float salarioHora, String nome, Data dataNasc, String cpf, Endereco endereco) {
        super(nome, dataNasc, cpf, endereco);
        this.cargo = cargo;
        this.salarioHora = salarioHora;
    }
    
    
    //sets
    public void setSalarioHora(float salarioHora) {    
        this.salarioHora = salarioHora;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    

    //gets
    public String getCargo() {
        return cargo;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    //chama Interface
    @Override
    public void imprime() {
        super.imprime(); // Chama o método imprime da classe Pessoa
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário por Hora: " + salarioHora);
    }
}