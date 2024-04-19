package br.com.alura.minhasMusicas.modelo;

public class Audio {
    private String titulo;
    private int totalreproducoes,totalCurtifas;
    private int classificacao;


public void curti() {
    this.totalCurtifas++;
}
public  void reproduzi(){
    this.totalreproducoes++;
}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalreproducoes() {
        return totalreproducoes;
    }

    public int getTotalCurtifas() {
        return totalCurtifas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
