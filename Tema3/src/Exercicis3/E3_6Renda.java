package Exercicis3;
import java.util.Scanner;
public class E3_6Renda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix els teus ingressos anuals: ");
        double ingressos = sc.nextDouble();
        sc.nextLine();
        System.out.println("I el teu estat civil (solter/casat)");
        String estatCivil = sc.nextLine();

        double impostTotal = 0;
        if (estatCivil.equals("solter")) {
            if (ingressos <= 12000) {
                impostTotal = 0;
            } else if (ingressos <= 25000) {
                impostTotal = ingressos * 0.1;
            } else {
                impostTotal = ingressos * 0.2;
            }
        } else if (estatCivil.equals("casat")) {
            if (ingressos <= 18000) {
                impostTotal = 0;
            } else if (ingressos <= 35000) {
                impostTotal = ingressos * 0.1;
            } else {
                impostTotal = ingressos * 0.2;
            }
        } else {
            System.out.println("Estat civil no vàlid");
        }
        double souNet = ingressos - impostTotal;

        System.out.println("Impost total: " + impostTotal + "$");
        System.out.println("Sou net: " + souNet + "$");
    }
}
