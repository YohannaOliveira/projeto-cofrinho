package entities;

//classe filha Real herdando as características da classe mãe Moeda
public class Real extends Moeda {
    //criação do construtor Real recebendo o mesmo atributo da classe Moeda
    public Real(double valor) {
        super(valor);
    }

    //sobrescrita do método info retornando o tipo da moeda e o valor
    @Override
    public String info() {
        return "Real: " + getValor();
    }

    //sobrescrita do método converter onde neste caso só retorna o próprio valor
    @Override
    public double converter() {
        return getValor();
    }

    //criação dos métodos equals e hashCode
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
