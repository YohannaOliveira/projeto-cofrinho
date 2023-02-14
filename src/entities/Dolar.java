package entities;

//classe filha Dolar herdando as características da classe mãe Moeda
public class Dolar extends Moeda {

    //criação do construtor Dolar recebendo o mesmo atributo da classe Moeda
    public Dolar(double valor) {
        super(valor);
    }

    //sobrescrita do método info retornando o tipo da moeda e o valor
    @Override
    public String info() {
        return "Dolar: " + getValor();
    }

    //sobrescrita do método converter onde é realizado o calculo do valor informado multiplicado pela cotação do Dolar em 01/10/2022.
    @Override
    public double converter() {
        return getValor() * 5.41;
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
