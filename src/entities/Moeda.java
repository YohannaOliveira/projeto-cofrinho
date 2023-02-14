package entities;

import java.util.Objects;

//criação da classe abstrata Moeda
public abstract class Moeda {
    private double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    //criação do método getValor para poder acessá-lo, de acordo com o encapsulamento
    public double getValor() {
        return valor;
    }

    //implementação dos métodos equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moeda)) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(moeda.getValor(), getValor()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValor());
    }

    //criação dos métodos abstrato info e converter, para que possam ser implementadas de acordo com sua classe
    public abstract String info();

    public abstract double converter();
}
