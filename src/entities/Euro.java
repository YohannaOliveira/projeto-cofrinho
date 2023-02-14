package entities;

//classe filha Euro herdando as características da classe mãe Moeda
public class Euro extends Moeda {

    //criação do construtor Euro recebendo o mesmo atributo da classe Moeda
    public Euro(double valor) {
        super(valor);
    }

    //sobrescrita do método info retornando o tipo da moeda e o valor
    @Override
    public String info() {
        return "Euro: " + getValor();
    }

    //sobrescrita do método converter onde é realizado o calculo do valor informado multiplicado pela cotação do Euro em 01/10/2022.
    @Override
    public double converter() {
        return getValor() * 5.31;
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
