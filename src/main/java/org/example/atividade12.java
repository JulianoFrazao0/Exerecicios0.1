package org.example;
import java.util.Scanner;

public class atividade12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("coloque numero mensal em kWh: ");
        double consumo = sc.nextDouble();

        double tarifa;

        if (consumo <= 100) {
            tarifa = 0.50;
        } else if (consumo <= 300) {
            tarifa = 0.75;
        } else {
            tarifa = 1.10;
        }

        double valorTotal = consumo * tarifa;

        System.out.println("tarifa aplicada: R$ " + tarifa + " por kWh");
        System.out.println("o valor total da conta: R$ " + valorTotal);

    }

}
