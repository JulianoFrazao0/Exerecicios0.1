package org.example;

import java.util.Scanner;


public class Atividade2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o numero inteiro: ");
        int num = sc.nextInt();

        System.out.println("Digite o numero inteiro: ");
        int num1 = sc.nextInt();

        System.out.println("Digite que tipo de conta voce quer fazer: (1= Soma, 2 = Subtracao, 3= divisao");
        int chose = sc.nextInt();


        if (chose == 1) {
            int calculo_sum = num + num1;
            System.out.println("O calculo é: "+ calculo_sum);
            
        } else if (chose == 2) {
            int calculo_sub = num + num1;
            System.out.println("O calculo é: "+ calculo_sub);
            
        } else if (chose == 3) {
            int calculo_div = num + num1;
            System.out.println("O calculo é: "+ calculo_div);
        }


    }
}
