package org.example;

import java.util.Scanner;


public class ativiadde7 {
    public static void main(String[] argsS) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do retangulo: ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura do retangulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Diagonal: " + perimetro);

    }

}
