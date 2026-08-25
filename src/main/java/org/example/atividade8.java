package org.example;

import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kelvin = 273.15;

        System.out.println("Digite a temperatura em °C: ");
        double celcius = sc.nextDouble();

        System.out.println("digite para calular ou em (1= Fahrenheit), (2= Kelvin");
        double escolha = sc.nextDouble();

        if (escolha == 1){

            double calculoF = (celcius * 9.0 / 5.0) + 32;
            System.out.println("A conversao de celcius para Fahrenheit: "+ calculoF);

        } else if (escolha == 2) {

            double calculoK = kelvin + celcius;
            System.out.println("A conversao de celcius para Fahrenheit: "+ calculoK);

        }

    }
}
