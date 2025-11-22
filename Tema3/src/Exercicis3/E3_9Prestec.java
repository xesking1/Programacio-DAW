package Exercicis3;
import java.util.Scanner;
public class E3_9Prestec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix l'import del préstec: ");
        double prestec = sc.nextDouble();
        System.out.println("En quants d'anys es retomarà? ");
        int anys = sc.nextInt();
        System.out.println("Els teus ingressos anuals: ");
        double ingressos = sc.nextDouble();

        int tipusInteres;
        if (ingressos < 15000) {
            tipusInteres = 8;
        } else if (ingressos <= 30000) {
            tipusInteres = 6;
        } else {
            tipusInteres = 4;
        }
        double interes = prestec*tipusInteres*anys/100;
        System.out.println("Préstec de " + prestec + "$ pagat en " + anys + " anys");
        System.out.println("Amb un ingrés anual de " + ingressos + "$ s'aplica un " + tipusInteres + "% d'interès: " + interes + "$");
        double totalPagar = prestec + interes;
        if (anys > 10) {
            System.out.println("Import préstec + interès: " + totalPagar + "$ + 500$ cost administratiu");
            totalPagar += 500;
        }
        System.out.println("Total a pagar: " + totalPagar + "$");

    }
}
