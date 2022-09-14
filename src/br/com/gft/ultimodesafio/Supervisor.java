package br.com.gft.ultimodesafio;

public class Supervisor extends Funcionario{
    //CONSTRUTOR
    public Supervisor() {
    }

    public Supervisor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    //POLIMORFISMO
    @Override
    public void bonificacao() {
        super.salario += 5000.0d;
    }

    //APRESENTACAO

    @Override
    public String toString() {
        return "Supervisor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }
}
