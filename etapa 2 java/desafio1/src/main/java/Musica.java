public class Musica {
    int anoDeLancamento ;
    String titulo, artista;
    double valicoes,totalAvalicao;

    void FichaTecnica(){
        System.out.println("-------------Ficha Tecnica----------------\n");
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("\n-------------------------------------------");
    }
    void avalia(double nota){
        valicoes += nota;
        totalAvalicao++;
    }
    double RetornaMedia(){
        return valicoes/totalAvalicao;
    }
}
