package backend;

//definição do parametros 
public class Data implements Imprimivel {
    private int dia;
    private int mes;
    private int ano;
    //construtores
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    //gets
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    //chama Interface
    @Override
    public void imprime() {
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
    }
}