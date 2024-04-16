package org.example;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoDeLancamento;
        boolean incluidoNoPlano = true;
        double notaDoFilme=8.1;
        String tipoPlano = "plus";

        System.out.println(" O filme foi lançado em que ano: ");
        anoDeLancamento =sc.nextInt();

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamendo que os clientes estão curtindo!");

        }

        else {
            System.out.println("filmes retro que vale apena assistir");
        }
        if(incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("filme liberato");
        }
        else {
            System.out.println("deve paga a locação");
        }
    }
}
