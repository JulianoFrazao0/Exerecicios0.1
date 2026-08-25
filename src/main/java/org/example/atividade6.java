package org.example;

import java.util.Scanner;
public class atividade6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio do círculo: ");
        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);

        double perimetro = 2 * Math.PI * raio;

        System.out.println("Resultados");
        System.out.printf("Área do círculo: %.2f", area);
        System.out.printf("Perímetro do círculo: %.2f", perimetro);



    }
}
