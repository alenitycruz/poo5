package br.com.gft.ultimodesafio;

public class Principal {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        Supervisor s1 = new Supervisor("NicoleDickman", 30, 30000.0d);
        Vendedor v1 = new Vendedor("Fernando Pessoa", 50, 10000.0d);

        g1.setNome("Johnny Deep");
        g1.setIdade(40);
        g1.setSalario(40000.0d);

        v1.bonificacao();
        s1.bonificacao();

        System.out.println(g1);
        System.out.println(v1);
        System.out.println(s1);
    }
}
