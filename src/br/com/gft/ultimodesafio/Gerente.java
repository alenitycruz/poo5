package br.com.gft.ultimodesafio;

public class Gerente extends Funcionario{
    //CONSTRUTOR
    public Gerente() {
    }

    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    //POLIMORFISMO
    @Override
    public void bonificacao() {
        super.salario += 10000.0d;
    }

    //APRESENTACAO

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }
}
