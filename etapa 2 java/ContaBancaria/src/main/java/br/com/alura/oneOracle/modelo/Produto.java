package br.com.alura.oneOracle.modelo;

public class Produto {
    private String nome;
    private double preco;

    public void aplicarDesconto(double percentual){
       double desconto = preco * (percentual/100);
       preco -=  desconto;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
