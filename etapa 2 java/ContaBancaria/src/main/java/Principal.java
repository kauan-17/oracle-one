import br.com.alura.oneOracle.modelo.*;

public class Principal {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        ContaBancaria conta = new ContaBancaria();
        Produto produto = new Produto();
        Aluno aluno = new Aluno();
        Livro livro = new Livro();

        System.out.println("\n");
        conta.titula="marcos";
        conta.setNumeroConta(1233421234);
        System.out.println("Numero da conta: " + conta.getNumeroConta());
        System.out.println("Saldo da conta: " + conta.getSaldo());
        System.out.println("Tirula: "+conta.titula);
        conta.setSaldo(1500);
        System.out.println("Novo Saldo: "+conta.getSaldo());

        System.out.println("\n");
        pessoa.setIdade(18);
        pessoa.setNome("Marcos");
        System.out.println(pessoa.getNome()+"tem"+ pessoa.getIdade());
        pessoa.verificaIdadePessoa();

        System.out.println("\n");
        produto.setNome("Celular");
        produto.setPreco(2000);
        System.out.println("Nome do produto: "+produto.getNome());
        System.out.println("Preço: "+produto.getPreco());
        produto.aplicarDesconto(10);
        System.out.println("Novo Preço após Descontos: "+produto.getPreco());

        System.out.println("\n");
        aluno.setNome("Lulu");
        aluno.setNota1(75);
        aluno.setNota2(81);
        aluno.setNota3(92);
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("Nota 3: " + aluno.getNota3());
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println();

        System.out.println("\n");
        livro.setTitulo("Lógica de Programação");
        livro.setAutor("Paulo Silveira");
        livro.exibirDetalhes();




    }
}
