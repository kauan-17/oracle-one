package org.example;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1, nota2;
        double media;
        char continuar ='s';
        String nome;

        while (continuar == 's' || continuar == 's')  {

            System.out.println("Digita o seu nome: ");
            nome = new Scanner(System.in).nextLine();
            System.out.println("Digite um nota: ");
            nota1 = sc.nextInt();
            System.out.println("Digite um nota: ");
            nota2 = sc.nextInt();
            media =  (nota1 + nota2) / 2;

            System.out.println(String.format("o %s e a media da nota foi de %.2f ", nome, media));
            System.out.println("Deseja continuar outro numero? (S/N)");
            continuar = new Scanner(System.in).nextLine().charAt(0);
        }
        double precoProduto, valorProduto, valorEmDolares,precoOriginal;
        int quantidade;
        System.out.println("Qual e o quantidade dos produtos");
        quantidade = sc.nextInt();
        System.out.println("Qual o valor da produto");
        precoProduto = sc.nextDouble();
        valorProduto = precoProduto * quantidade;
        System.out.println("O valor da produto foi de: " + valorProduto);

        valorEmDolares =(valorProduto *4.94);
        System.out.println("O valor da produto em dolares foi de: " + valorEmDolares);

        double disconto = 10.0,novoPreco;
        precoOriginal =(valorProduto*100)/ disconto;
        novoPreco = precoOriginal - disconto;
        System.out.println("O valor da produto foi de: " + novoPreco);


    }
    }

