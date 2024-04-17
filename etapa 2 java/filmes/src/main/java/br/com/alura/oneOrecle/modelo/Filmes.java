package br.com.alura.oneOrecle.modelo;

import br.com.alura.oneOrecle.calculos.Classificar;

public class Filmes extends  Titulo implements Classificar  {

    private String direto;


    public String getDireto() {
        return direto;
    }

    public void setDireto(String direto) {
        this.direto = direto;
    }


    @Override
    public int getClassificacao() {
        return (int) obterMedeia()/2;
    }
}
