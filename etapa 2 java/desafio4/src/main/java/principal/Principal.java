package principal;

import modelo.CartaoDeCredito;
import modelo.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = sc.nextInt();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair= 1;
        while (sair != 0) {
            System.out.println("digite a descrição da compra: ");
            String descricao = sc.next();

            System.out.println("Digite o valor da compra: ");
            double valor = sc.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizaa = cartao.lancaCompra(compra);
            if (compraRealizaa) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Dogote 0 para sair ou 1 para continur");
                sair = sc.nextInt();
            }else {
                System.out.println("Saldo insuficiente");
                sair=0;
            }
        }
        System.out.println("--------------------------------");
        System.out.println("COMPRA REALIZADAS:\n");
        Collections.sort(cartao.getCompra());
        for (Compra c : cartao.getCompra()){
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }
        System.out.println("\n********************************");

        System.out.println("\nSaldo do Cartão: R$ " + cartao.getSaldo());
    }
}
