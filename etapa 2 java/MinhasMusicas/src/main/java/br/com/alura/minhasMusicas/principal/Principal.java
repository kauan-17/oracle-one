package br.com.alura.minhasMusicas.principal;

import br.com.alura.minhasMusicas.modelo.MInhasPreferidas;
import br.com.alura.minhasMusicas.modelo.Musica;
import br.com.alura.minhasMusicas.modelo._Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.setTitulo("Forever");
        musica.setArtista("kiss");

        for(int i=0;i<100; i++){
            musica.reproduzi();
        }
        for (int i = 0; i < 50; i++) {
            musica.curti();
        }
        _Podcast podcast = new _Podcast();
        podcast.setTitulo("podPa");
        podcast.setAprsentador("Igor");

        for(int i=0;i<100; i++){
            podcast.curti();
        }
        for (int i = 0; i < 50; i++) {
            podcast.reproduzi();
        }

        MInhasPreferidas preferidas = new MInhasPreferidas();
        preferidas.incluirPreferida(podcast);
        preferidas.incluirPreferida(musica);
    }
}
