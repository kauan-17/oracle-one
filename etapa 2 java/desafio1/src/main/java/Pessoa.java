public class Pessoa {
    public static void main(String[] args) {
        System.out.println("ola mundo");
        Calculadora soma = new Calculadora();
        Aluno aluno = new Aluno();
        Carro carro = new Carro();
        Musica musica = new Musica();


        soma.numero = 4;
        System.out.println(soma.DobroDoNumero());

        aluno.nome = "kauan";
        aluno.idade = 20;
        aluno.Informacao();

        carro.ano=2000;
        carro.modelo = "uno";
        carro.cor="branco";
        System.out.println("A idade do carro e: "+carro.IdadeDoCarro());

        musica.artista = "kauan";
        musica.anoDeLancamento = 2014;
        musica.titulo ="vai com tudo jaca";
        musica.FichaTecnica();
        musica.avalia(80);
        musica.avalia(70);
        musica.avalia(60);
        System.out.println(musica.valicoes);
        System.out.println(musica.totalAvalicao);
        System.out.println(musica.RetornaMedia());
    }
}
