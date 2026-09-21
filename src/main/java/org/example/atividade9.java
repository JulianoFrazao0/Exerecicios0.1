package org.example;
import java.util.Scanner;

public class atividade9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o numero para saber se o numero e impar ou par: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O numero é par");
        }
        else {
            System.out.println("O numero digitado e o numero impar");
        }

    }
}
