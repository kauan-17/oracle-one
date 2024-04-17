import br.com.alura.oneOrecle.calculos.CalculadoraDeTempo;
import br.com.alura.oneOrecle.calculos.Recomendacao;
import br.com.alura.oneOrecle.modelo.Episodio;
import br.com.alura.oneOrecle.modelo.Filmes;
import br.com.alura.oneOrecle.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        Filmes filmes = new Filmes();
        Serie serie = new Serie();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        Episodio episodio = new Episodio();

        System.out.println("\n---------------filmes-------------------------\n");
        filmes.setNome("To gun 2");
        filmes.setAnoDeLancamento(2023);
        filmes.setDuracaoEmMinutos(180);
        filmes.setIncluidoNoPlano(true);
        filmes.avalia(10);
        filmes.avalia(10);
        filmes.avalia(10);

        filmes.exibirFichaTecnica();
         System.out.println("A soma de todas as avaliçoes: "+filmes.getSomoDasAvalicoes());
         System.out.println("Quantas nota foi avalidado neste filme: "+filmes.getTotalAvalicao());
         System.out.println(filmes.obterMedeia());
         calculadora.inclui(filmes);
         System.out.println(calculadora.getTempoTotal());
         System.out.println("\n----------------------------------------------\n");


         System.out.println("\n---------------serie--------------------------\n");
         serie.setNome("Lost");
         serie.setAnoDeLancamento(2000);
         serie.exibirFichaTecnica();
         serie.setTemporada(10);
         serie.setEpisodeoPorTemporada(10);
         serie.setMinutosPorEpisodio(50);
        System.out.println("duração da Seriado: "+serie.getDuracaoEmMinutos());
        calculadora.inclui(serie);

        System.out.println("\n----------------------------------------------\n");
        System.out.println("\n-------------------Episodeo-------------------\n");
        Recomendacao recomendacao = new Recomendacao();
        //recomendacao.filtra(serie);
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        recomendacao.filtra(episodio);


    }
}
