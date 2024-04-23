package principal;

import modelo.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoa = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        while(true) {
            sc = new Scanner(System.in);
            System.out.println("Digite o nome (ou 'sair para parar): ");
            String nome = sc.nextLine();
            if(nome.equals("sair")) {
                break;
            }
            System.out.println("Digite o idade: ");
            int idade = sc.nextInt();

            Pessoa p = new Pessoa(nome, idade);
            pessoa.add(p);
        }

        System.out.println("\nNomes e Idades Digitadas:");
        for (Pessoa p : pessoa) {
            System.out.println("Nome: " + p.getNome() + ", Idade: " + p.getIdade());
        }

    }
}
