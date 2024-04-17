import br.com.alura.oneOrecle.desafio.controle.Animal.Chachorro;
import br.com.alura.oneOrecle.desafio.controle.Animal.Gato;
import br.com.alura.oneOrecle.desafio.controle.Conta.ContaBancaria;
import br.com.alura.oneOrecle.desafio.controle.Conta.ContaCorrente;
import br.com.alura.oneOrecle.desafio.controle.Numero.GeradorPrimo;
import br.com.alura.oneOrecle.desafio.controle.Numero.NumerosPrimos;
import br.com.alura.oneOrecle.desafio.controle.Numero.VerificadorPrimo;
import br.com.alura.oneOrecle.desafio.controle.carro.ModeloCarro;

public class Principal {
        public static void main(String[] args) {
            System.out.println("\n---------------Carro----------------------------\n");
            ModeloCarro meuCarro = new ModeloCarro();
            meuCarro.definirModelo("Sedan");
            meuCarro.definirPrecos(30000, 32000, 35000);
            meuCarro.exibirInfo();

            System.out.println("\n---------------Animal----------------------------\n");
            Chachorro cachorro = new Chachorro();
            cachorro.emitirSom();
            cachorro.abanarRabo();

            Gato gato = new Gato();
            gato.emitirSom();
            gato.arranharMoveis();

            System.out.println("\n---------------Conta Bancaria----------------------------\n");
            ContaBancaria conta = new ContaBancaria();
            conta.depositar(1000);
            conta.consultarSaldo();
            // Realizando operações na conta corrente
            ContaCorrente contaCorrente = new ContaCorrente();
            contaCorrente.depositar(200);
            contaCorrente.cobrarTarifaMensal();
            contaCorrente.consultarSaldo();
            contaCorrente.sacar(150);
            contaCorrente.consultarSaldo();


            System.out.println("\n---------------Numero Primo----------------------------\n");
            VerificadorPrimo verificador = new VerificadorPrimo();
            verificador.verificarSeEhPrimo(17);

            GeradorPrimo gerador = new GeradorPrimo();
            int proximoPrimo = gerador.gerarProximoPrimo(17);
            System.out.println("O próximo primo após 17 é: " + proximoPrimo);

            NumerosPrimos numerosPrimos = new NumerosPrimos();
            numerosPrimos.listarPrimos(30);
        }
    }

