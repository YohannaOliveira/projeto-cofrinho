package entities;

import java.util.ArrayList;

//implementação da classe entities.Cofrinho
public class Cofrinho {
    //Instanciação para a lista de moedas
    ArrayList<Moeda> listaMoedas = new ArrayList<>();

    //método para que seja possível adicionar nova moeda quando chamado
    public void adicionar(Moeda m){
        listaMoedas.add(m);
    }

    //método para que seja possível remover uma moeda quando chamado
    public void remover(Moeda m) {
        listaMoedas.remove(m);
    }

    //método para que seja possível listas todas as moedas quando chamado
    public void listagemMoedas(){
        for (Moeda m : listaMoedas){
            System.out.println(m.info());;
        }
    }

    //método para que seja possível somar o valor total já convertido quando chamado
    public String totalConvertido() {
        double soma = 0;
        for (Moeda m : listaMoedas){
            soma += m.converter();
        }

        //Utilização do String.format para formatar um valor double para uma String
        return "Total convertido: R$ " + String.format("%.2f", soma);
    }
}
