package br.com.alura.minhasMusicas.modelo;

public class MInhasPreferidas {

    public void incluirPreferida(Audio audio) {
        if (audio.getClassificacao()>=9) {
            System.out.println(audio.getTitulo()+" E considerado sucesso e preferido por todos. ");
        }else{
            System.out.println(audio.getTitulo()+" Tambem e um dos que todos esta curtindo ");
        }

    };
}
