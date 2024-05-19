package backend;

//definição do parametros 
public class Endereco implements Imprimivel {
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;

    //construtores
    public Endereco(String estado, String cidade, String bairro, String rua, int numero) {
        this.estado = estado;
        this.cidade = cidade;
        this. bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }
    //gets    
    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }
    
    //chama Interface
    @Override
    public void imprime() {
        System.out.println("Endereço: " + rua + ", " + bairro + ", " + cidade + ", " + estado);
    }
}
    
    
