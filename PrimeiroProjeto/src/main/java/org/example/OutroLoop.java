package org.example;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDeNota =0;
        double mediaAvalicao=0, nota=0;

        while (nota !=-1) {
            System.out.println("Diga sua avaliação para o filme de 0 ate 10 ou -1 para encerrar: ");
            nota = sc.nextDouble();
            if (nota != -1) {
                mediaAvalicao += nota;
                totalDeNota++;
            }
        }
        System.out.println(String.format("A media foi de %.2f", mediaAvalicao/totalDeNota));
    }
}

