package backend;

//definição do parametros 
public class Manufatura implements Imprimivel {
    private Processo processo;
    private float qtde;
//construtores

    public Manufatura() {
    }
    
    public Manufatura(Processo processo) {
        this.processo = processo;
    }

    
    public Manufatura(Processo processo, float qtde) {
        this.processo = processo;
        this.qtde = qtde;
    }
 //sets

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }
 
//gets
    public Processo getProcesso() {
        return processo;
    }

    public float getQtde() {
        return qtde;
    }
//chama Interface
    @Override
    public void imprime() {
        System.out.println("Manufatura");
        System.out.println("Processo: " + processo.getNome());
        System.out.println("Custo por hora: " + processo.calculaCusto());
        System.out.println("Operador: " + processo.getOperador().getCargo());
        System.out.println("Equipamento: " + processo.getEquipamento().getNome());
        System.out.println("Horas utilizadas: " + this.qtde);
    }
}