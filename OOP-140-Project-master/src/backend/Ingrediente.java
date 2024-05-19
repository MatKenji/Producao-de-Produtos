package backend;

//definição do parametros 
public class Ingrediente implements Imprimivel {
    private MateriaPrima materiaPrima;
    private float qtde;

 //construtores
    public Ingrediente(MateriaPrima materiaPrima, float qtde) {
        this.materiaPrima = materiaPrima;
        this.qtde = qtde;
    }
//gets
    public MateriaPrima getMateriaPrima() {
        return materiaPrima;
    }

    public float getQtde() {
        return qtde;
    }
    
//chama Interface
   @Override
    public void imprime() {
        System.out.println("Ingrediente ");
        System.out.println("Quantidade: " + this.qtde);
        materiaPrima.imprime();
    }
    
    
}