package org.example;

import java.util.Scanner;



public class atividade3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);



        System.out.println("Digite o Dinheiro em Real: R$");
        double real = sc.nextDouble();

        System.out.println("Voce deseja converter o seu dinheiro em dolar?: (1 = Converter), (2 = Não converter");
        int conver = sc.nextInt();

        if (conver == 1) {
            double calculo = real * 5.22;

            System.out.println("a conversao ficou: " + calculo);
        }
        else {
            System.out.println("Obrigado pela escolha.");

        }

    }

}
