package org.example;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double Salario = 1500.00;

        double hora = 8;

        double desconto = 0.08;

        double calculo1 = Salario * desconto;

        double calculo2 = Salario - calculo1;

        System.out.println("O valor total que voce vai receber: "+ calculo2);


    }
}
