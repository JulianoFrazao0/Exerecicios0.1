package org.example;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nomew do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a nota do primeiro Bimestre: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a nota do segundo Bimestre: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a nota do terceiro Bimestre");
        double nota3 = sc.nextDouble();

        System.out.println("Digite a nota do quarto Bimestre");
        double nota4 = sc.nextDouble();

        double media = nota1 + nota2 + nota3 + nota4 / 4;

        System.out.println("A nota do aluno: "+ nome+ "e a media dele é: "+ media);

    }
}
