package application;

import entities.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //instanciação do objeto do tipo Cofrinho (onde será uma lista)
        Cofrinho cofre = new Cofrinho();

        //menu mostrado a primeira vez para a escolha desejada
        System.out.println("------- Cofrinho - Yohanna da Silva Oliveira -------");
        System.out.println("1 - Adicionar moeda");
        System.out.println("2 - Remover moeda");
        System.out.println("3 - Listar moedas");
        System.out.println("4 - Total convertido (R$)");
        System.out.println("5 - Sair");
        System.out.print("Digite a opção desejada: ");
        int opcao = sc.nextInt();
        System.out.println();

        //criação de variáveis e objeto
        int tipoMoeda;
        double valor;
        Moeda moeda;

        //estrutura de repetição criada para que o menu se repita até que seja digitado 5 (sair)
        while(opcao != 5){
            //estrutura de decisão para que sejam feitas as instruções de acordo com a opção desejada
            switch (opcao) {
                case 1 -> {
                    tipoMoeda = 0;
                    while (tipoMoeda > 3 || tipoMoeda <= 0) {
                        System.out.println("1 - Dolar");
                        System.out.println("2 - Euro");
                        System.out.println("3 - Real");
                        System.out.print("Informe a moeda: ");
                        tipoMoeda = sc.nextInt();
                        System.out.println();
                    }
                    System.out.print("Valor: ");
                    valor = sc.nextDouble();
                    System.out.println();
                    //estrutura de decisão para que o objeto seja instanciado com seu tipo
                    if (tipoMoeda == 1) {
                        moeda = new Dolar(valor);
                    } else if (tipoMoeda == 2) {
                        moeda = new Euro(valor);
                    } else {
                        moeda = new Real(valor);
                    }
                    //com o objeto já instanciado, é chamado o método de adicionar moeda
                    cofre.adicionar(moeda);
                }
                case 2 -> {
                    tipoMoeda = 0;
                    while (tipoMoeda > 3 || tipoMoeda <= 0) {
                        System.out.println("1 - Dolar");
                        System.out.println("2 - Euro");
                        System.out.println("3 - Real");
                        System.out.print("Informe a moeda: ");
                        tipoMoeda = sc.nextInt();
                        System.out.println();
                    }
                    System.out.print("Valor: ");
                    valor = sc.nextDouble();
                    System.out.println();
                    //estrutura de decisão para que o objeto seja instanciado com seu tipo
                    if (tipoMoeda == 1) {
                        moeda = new Dolar(valor);
                    } else if (tipoMoeda == 2) {
                        moeda = new Euro(valor);
                    } else {
                        moeda = new Real(valor);
                    }
                    //com o objeto já instanciado, é chamado o método de remover moeda
                    cofre.remover(moeda);
                }
                //chamada para o método de listar moedas
                case 3 -> cofre.listagemMoedas();
                //chamada para o método de mostrar valor total convertido
                case 4 -> System.out.println(cofre.totalConvertido());
                default -> System.out.println("Opção inválida.");
            }

            //menu mostrado durante as repetições
            System.out.println("------- Cofrinho - Yohanna da Silva Oliveira -------");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Total convertido (R$)");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            System.out.println();
        }
        sc.close();
    }
}
