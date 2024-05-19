package backend;

//definição do parametros 
public class Equipamento implements Imprimivel {
    private String nome;
    private String fabricante;
    private Data dataFabricacao;
    private float depreciacaohora;
    //construtores

    public Equipamento() {
    }
    
    
    public Equipamento(String nome, String fabricante, Data dataFabricacao, float depreciacaohora) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.dataFabricacao = dataFabricacao;
        this.depreciacaohora = depreciacaohora;
    }
    //sets

    public void setDepreciacaohora(float depreciacaohora) {
        this.depreciacaohora = depreciacaohora;
    }
    
    //gets
    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public Data getDataFabricacao() {
        return dataFabricacao;
    }

    public float getDepreciacaoHora() {
        return depreciacaohora;
    }
    
    //chama Interface
    @Override
    public void imprime() {
        System.out.println("Equipamento: " + nome);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Data de Fabricação: " + dataFabricacao.getDia() + "/" + dataFabricacao.getMes() + "/" + dataFabricacao.getAno());
        System.out.println("Depreciação por Hora: " + depreciacaohora);
    }
}