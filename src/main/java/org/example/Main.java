package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("O nome é "+ nome+ ", e a idade é "+ idade+ "e a altura é "+ altura);



        }
    }

