package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse eo Screen match");
        String nome = "era do gelo";
        int anoDeLancamento = 2002;
        System.out.println(" "+nome+ " foi lançamento em: "+anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme=8.1;

        double medis = (9.8 +6.3+ 8.0)/3;
        System.out.println(String.format("a media do filme %s  foi de %.2f ",nome,medis));
        String sinopse = ("filme de animação de animas da era paleoritica");
        System.out.println(sinopse);

        int clasificacao = (int) (medis/2);
        System.out.println(clasificacao);
    }
}


