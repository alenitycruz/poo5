package br.com.gft.ultimodesafio;

public abstract class Funcionario {
    //ATRIBUTOS
    protected String nome;
    protected int idade;
    protected double salario;

    //CONSTRUTORES
    public Funcionario() {
    }

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    //GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //POLIMORFISMO
    public abstract void bonificacao();
}
