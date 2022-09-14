package br.com.gft.ultimodesafio;

public class Vendedor extends Funcionario{
    //CONSTRUTOR


    public Vendedor() {
    }

    public Vendedor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    //POLIMORFISMO
    @Override
    public void bonificacao() {
        super.salario += 3000.0d;
    }

    //APRESENTACAO

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }
}
