package org.example;

import java.util.Scanner;

public class Leitora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int ano;
        double avalicao;

        System.out.println("Digite o nome do seu Filme famorito: ");
        nome = sc.nextLine();
        System.out.println("Ano do seu de lançamento: ");
        ano = sc.nextInt();
        System.out.println("Diga sua avaliação para o filme de 0 ate 10:");
        avalicao = sc.nextDouble();

        System.out.println(String.format("o %s a não que lançamento e %d e a sua avaliação e de %.1f",nome,ano,avalicao));
    }
}
