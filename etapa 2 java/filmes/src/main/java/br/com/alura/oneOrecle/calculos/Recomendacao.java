package br.com.alura.oneOrecle.calculos;

import br.com.alura.oneOrecle.modelo.Titulo;

public class Recomendacao {
    private String recomendacao;

    public void filtra(Classificar classificar) {
        if(classificar.getClassificacao() >=4 ){
            System.out.println("Está entre os preferidos do momento:");
        }else if(classificar.getClassificacao() >=2) {
            System.out.println("Bem avaliado no momento");
        }
        else{
            System.out.println("Coloca na sua lista para assistir depois:");
        }

    }
}
