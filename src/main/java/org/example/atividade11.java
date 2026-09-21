package org.example;
import java.util.Scanner;

public class atividade11 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o primeiro numero : ");
        int n1 = sc.nextInt();

        System.out.print("digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.print("digite o terceiro número: ");
        int n3 = sc.nextInt();

        int maior;

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n2 > n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        System.out.println("o maiors  é: " + maior);


        
    }
}
