package br.com.alura.oneOrecle.modelo;

public class Titulo {
    private String nome;
    private int anoDeLancamento, totalAvalicao, duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somoDasAvalicoes;

    public void exibirFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
        System.out.println("Duração do filme: "+ duracaoEmMinutos);
        System.out.println("normal: "+incluidoNoPlano);
    }
    public void avalia(double nota){
        somoDasAvalicoes += nota;
        totalAvalicao++;
    }


    public double obterMedeia(){
        return somoDasAvalicoes / totalAvalicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getTotalAvalicao() {
        return totalAvalicao;
    }

    public void setTotalAvalicao(int totalAvalicao) {
        this.totalAvalicao = totalAvalicao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomoDasAvalicoes() {
        return somoDasAvalicoes;
    }

    public void setSomoDasAvalicoes(double somoDasAvalicoes) {
        this.somoDasAvalicoes = somoDasAvalicoes;
    }
}
