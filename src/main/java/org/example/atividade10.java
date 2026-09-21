package org.example;
import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a média final do aluno: ");
        double media = sc.nextDouble();

        if (media >= 7.0) {
            System.out.println("aprovado");
        } else if (media >= 5.0) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }

    }
}
